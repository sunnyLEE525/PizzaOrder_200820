package kr.co.tjoeun.pizzaorder_200820

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import kotlinx.android.synthetic.main.store_list_item.*
import kotlinx.android.synthetic.main.store_list_item.nameTxt
import kr.co.tjoeun.pizzaorder_200820.datas.Stores

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStore : Stores

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setUpEvents()
        setValues()
}
    override fun setUpEvents() {

        callBtn.setOnClickListener {

            val permissionListener = object : PermissionListener {
                override fun onPermissionGranted() {
//                    권한이 승인된 상태일때 실행할 코드

                    //            전화(010-5555-6666)를 바로 연결 처리 (ACTION_CALL)

                    val myUri = Uri.parse("tel:${mStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
//                    권한이 거부되었을 때 실행할 코드
                    Toast.makeText(mContext, "전화연결이 거부되어 연결 불가능", Toast.LENGTH_SHORT).show()
                }
            }

            //            완성된 행동 방침(가이드북)을 가지고 권한 실제 요청
        TedPermission.with(mContext)
            .setPermissionListener(permissionListener)
            .setDeniedMessage("권한을 거부하면 통화가 불가능합니다. 설정 > 권한에서 허용해 주세요.")
            .setPermissions(Manifest.permission.CALL_PHONE)
            .check()
        }

    }

    override fun setValues() {

        mStore = intent.getSerializableExtra("storeInfo") as Stores

        nameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum
        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)

    }


}