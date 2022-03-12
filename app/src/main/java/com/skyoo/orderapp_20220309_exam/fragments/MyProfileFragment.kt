package com.skyoo.orderapp_20220309_exam.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.skyoo.orderapp_20220309_exam.EditNicknameActivity
import com.skyoo.orderapp_20220309_exam.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_CODE_NICKNAME = 3000

//    2가지 함수(onCreateView와 onActivityCreated) 를 받을 예정  와 나중에 동작에 관한 명령을 할것임
//    onCreateView 어떤 xml(fragment_pizza_store_list) 을 끌어다 쓸지
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

//    onActivityCreated  어떤 동작을 할지 지정
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

         btnEditNickname.setOnClickListener {

             val myIntent = Intent(requireContext(), EditNicknameActivity::class.java)
             startActivity(myIntent, REQ_CODE_NICKNAME)
         }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_CODE_NICKNAME) {

            if (resultCode == Activity.RESULT_OK) {

                val resultNickname = data!!.getStringExtra("nickname")
                txtNickname.text = resultNickname
            }
        }
    }
}