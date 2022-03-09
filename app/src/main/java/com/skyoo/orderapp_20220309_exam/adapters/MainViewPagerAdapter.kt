package com.skyoo.orderapp_20220309_exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.skyoo.orderapp_20220309_exam.fragments.MyProfileFragment
import com.skyoo.orderapp_20220309_exam.fragments.PiazzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> PiazzaStoreListFragment()
            else -> MyProfileFragment()
        }

    }
}