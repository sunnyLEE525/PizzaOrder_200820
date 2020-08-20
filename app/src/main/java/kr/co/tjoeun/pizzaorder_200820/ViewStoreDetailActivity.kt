package kr.co.tjoeun.pizzaorder_200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
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

    }

    override fun setValues() {

        mStore = intent.getSerializableExtra("storeInfo") as Stores

        nameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum
        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)

    }


}