package kr.co.tjoeun.pizzaorder_200820.adapters

import android.content.Context
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizzaorder_200820.datas.Pizzas
import kr.co.tjoeun.pizzaorder_200820.fragments.MyProfileFragment
import kr.co.tjoeun.pizzaorder_200820.fragments.Pizza_store

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Pizza_store()
            else -> MyProfileFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}
