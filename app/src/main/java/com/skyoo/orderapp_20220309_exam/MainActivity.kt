package com.skyoo.orderapp_20220309_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skyoo.orderapp_20220309_exam.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// mAdapter는 나중에 (객체화)대입한다고 lateinit var 변수로 지정, 그래서 setValues에서 씀.
    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    fun setupEvents() {

    }
//    MainViewPagerAdapter를 mAdapter에 넣어 화면의 뷰페이저로 보이게 함
    fun setValues() {
        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

//    지금은 2페이지이지만, 나중에 도전과제로 3페이지의 뷰페이저로 구현 하기 위해, 3을 씀
//    이것은 재사용성으로 3장의 화면을 모두 메모리에 넣기 위함
        mainViewPager.offscreenPageLimit = 3

//    메인 뷰페이저와 연결, 상단 탭으로 움직일 수 있게 함
        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}