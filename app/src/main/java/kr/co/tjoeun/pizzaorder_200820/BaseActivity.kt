package kr.co.tjoeun.pizzaorder_200820

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setUpEvents()

    abstract fun setValues()

}