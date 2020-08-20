package kr.co.tjoeun.pizzaorder_200820.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pizza_store.*
import kr.co.tjoeun.pizzaorder_200820.R
import kr.co.tjoeun.pizzaorder_200820.adapters.StoreAdapter
import kr.co.tjoeun.pizzaorder_200820.datas.Stores

class Pizza_store : Fragment() {

    val mPizzaStoreList = ArrayList<Stores>()
    lateinit var mPizzaStoreAdapter : StoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        리스트뷰에 피자 가게 뿌려주기 필요함

        mPizzaStoreList.add(Stores("피자헛", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "1588-5588"))
        mPizzaStoreList.add(Stores("파파존스", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "1577-8080"))
        mPizzaStoreList.add(Stores("미스터피자", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "1577-0077"))
        mPizzaStoreList.add(Stores("도미노피자", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "1577-3082"))

//        context 변수(Fragment들이 갖고있는 변수 - 우리가 만든 변수 아님)로 대신 대입
//        context 변수는 Context? 타입. => null일 수도 있다 => 어댑터 대입 불가
//        !!을 이용해, NullPointException의 리스크를 감수하고 억지로 우겨서 대입
        mPizzaStoreAdapter = StoreAdapter(context!!, R.layout.store_list_item, mPizzaStoreList)

        pizzaStoreListView.adapter = mPizzaStoreAdapter




    }
}