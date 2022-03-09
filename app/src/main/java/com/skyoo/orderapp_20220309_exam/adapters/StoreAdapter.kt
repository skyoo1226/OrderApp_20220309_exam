package com.skyoo.orderapp_20220309_exam.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.skyoo.orderapp_20220309_exam.datas.StoreData

class StoreAdapter(
    val mContext: Context,
//    layout의 store_list_item.xml을 불러오기 위해 Int값으로 정함
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {
}