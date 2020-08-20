package kr.co.tjoeun.pizzaorder_200820.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.tjoeun.pizzaorder_200820.datas.Pizzas

class PizzaAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: List<Pizzas>
) : ArrayAdapter<Pizzas>(mContext, resId, mList){
}