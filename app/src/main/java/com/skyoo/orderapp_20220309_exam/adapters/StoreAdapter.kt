package com.skyoo.orderapp_20220309_exam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.skyoo.orderapp_20220309_exam.R
import com.skyoo.orderapp_20220309_exam.datas.StoreData

class StoreAdapter(
    val mContext: Context,
//    layout의 store_list_item.xml을 불러오기 위해 Int값으로 정함
    val resId: Int,
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

//    getView로 layout.store_list_item을 불러 옴. tempRow를 이용 convertView에 뭐가 되었던...
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }
        val row = tempRow!!
        return row

    }
}