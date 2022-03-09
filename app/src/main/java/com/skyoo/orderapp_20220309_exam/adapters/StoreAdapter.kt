package com.skyoo.orderapp_20220309_exam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.skyoo.orderapp_20220309_exam.R
import com.skyoo.orderapp_20220309_exam.datas.StoreData
import com.willy.ratingbar.BaseRatingBar
import de.hdodenhof.circleimageview.CircleImageView

class StoreAdapter(
    val mContext: Context,      // 어느화면에서 쓸지
    val resId: Int,             // layout의 store_list_item.xml을 불러오기 위해 Int값으로 정함
    val mList: ArrayList<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

//    getView로 layout.store_list_item을 불러 옴. tempRow를 이용 convertView에 뭐가 되었던...
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }
        val row = tempRow!!
//    StoreData의 mList(가게이름)를 data에 주고, store_list_item.xml에서 각 아이템마다 id를 지정해 준다.
        val data = mList[position]
//  바로 위 data들을 가져 올 UI들을 지정해 줌
//  이렇게 쓰는데  써클이미지뷰는 가용성이 있어 간단히 아래처럼 써도 됨. val imgLogo = row.findViewById<CircleImageView>(R.id.imgLogo)
        val imLogo = row.findViewById<ImageView>(R.id.imgLogo)
        val txtName = row.findViewById<TextView>(R.id.txtName)
        val scoreRatingBar = row.findViewById<BaseRatingBar>(R.id.scoreRatingBar)

        txtName.text = data.name


        return row

    }
}