package com.skyoo.orderapp_20220309_exam.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.skyoo.orderapp_20220309_exam.R

class PiazzaStoreListFragment : Fragment() {

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

    }


}