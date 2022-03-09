package com.skyoo.orderapp_20220309_exam.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.skyoo.orderapp_20220309_exam.R
import com.skyoo.orderapp_20220309_exam.datas.StoreData

class PiazzaStoreListFragment : Fragment() {

    val mPizzaStoreList = ArrayList<StoreData>()



//    2가지 함수(onCreateView와 onActivityCreated) 를 받을 예정  와 나중에 동작에 관한 명령을 할것임
//    onCreateView 어떤 xml(fragment_pizza_store_list) 을 끌어다 쓸지
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)
    }

//    onActivityCreated  어떤 동작을 할지 지정
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

         mPizzaStoreList.add( StoreData("피자헛", 4.5, "1588-5588", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
         mPizzaStoreList.add( StoreData("파파존스", 3.0, "1577-8080", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
         mPizzaStoreList.add( StoreData("도미노피자", 5.0, "1577-3082", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"))
         mPizzaStoreList.add( StoreData("미스터피자", 3.5, "1577-0077", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"))

    }

}