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
    fun setValues() {
        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

    }
}