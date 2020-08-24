package kr.co.tjoeun.pizzaorder_200820

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setUpEvents()
        setValues()
}
    override fun setUpEvents() {

        okBtn.setOnClickListener {

            val inputNickname = newNicknameEdt.text.toString()

//            입력한 닉네임이 5글자가 넘어야 이전화면으로 복귀.
//            그렇지 않다면 토스트로 "닉네임은 5자 이상이어야 합니다." 문구만 출력

            if (inputNickname.length < 5) {
                Toast.makeText(mContext, "닉네임은 5자 이상이어야 합니다.", Toast.LENGTH_SHORT).show()

//                밑의 resultIntent 관련 코드를 실행하지 못하도록
//                ok 클릭 이벤트를 강제 종료
                return@setOnClickListener
            }

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()



        }

    }

    override fun setValues() {

    }


}