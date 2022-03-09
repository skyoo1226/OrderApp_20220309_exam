package com.skyoo.orderapp_20220309_exam.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.skyoo.orderapp_20220309_exam.fragments.MyProfileFragment
import com.skyoo.orderapp_20220309_exam.fragments.PiazzaStoreListFragment

class MainViewPagerAdapter(fm: FragmentManager ) : FragmentPagerAdapter(fm) {

//    구현 할 총 페이지가 2개이므로 getCount()는 2개로 단순하게 처리
    override fun getCount() = 2

//    getItem()은 2가지 경우 임. '0'과 'else'롤 각각 어떤 프래그먼트로 갈지 정해 줌.
    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> PiazzaStoreListFragment()
            else -> MyProfileFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자주문"
            else -> "내 정보 설정"
        }
    }

}