package kr.co.tjoeun.pizzaorder_200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.pizzaorder_200820.datas.Pizzas

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
}
    override fun setUpEvents() {

    }

    override fun setValues() {

        val mPizzaList = ArrayList<Pizzas>()


    }


}