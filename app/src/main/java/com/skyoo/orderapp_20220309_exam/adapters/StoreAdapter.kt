package com.skyoo.orderapp_20220309_exam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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
//  store_list_item.xml에서 가게이름(id - txtName)을 가져와 뿌림.
        txtName.text = data.name
//  인터넷 주소에서 이미지(로고)를 가지고 와 뿌리는 라이브러리 Glide 사용.
//    StoreAdapter.kt에서 Glide 자동완성 안되면 상단 메뉴 File > Close Project 클릭 후 새화면의 최근 화일 다시 선택 시작
//    화면이 어디인지는 mContext를 통해서 쓰기로 했으므로 Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView);
//    에서 this 대신 mContext를 써야 함.
//    logoUrl에 있는 data를 가져와서 imLogo에 넣어준다.
         Glide.with(mContext).load(data.logoUrl).into(imLogo)

        return row

    }
}