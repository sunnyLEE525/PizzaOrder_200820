package kr.co.tjoeun.pizzaorder_200820.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kr.co.tjoeun.pizzaorder_200820.R
import kr.co.tjoeun.pizzaorder_200820.datas.Stores

class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Stores>
) : ArrayAdapter<Stores>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null){
            tempRow = inf.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val logoImg = row.findViewById<ImageView>(R.id.logUrl)
//        val phoneNum = row.findViewById<TextView>(R.id.phoneNum)

        val data = mList[position]

        nameTxt.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(logoImg)

//        logoImg.image = data.logoUrl
//        phoneNum.text = data.phoneNum

        return row
    }

}