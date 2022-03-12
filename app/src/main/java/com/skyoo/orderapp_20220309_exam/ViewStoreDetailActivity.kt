package com.skyoo.orderapp_20220309_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ViewStoreDetailActivity : AppCompatActivity() {
    lateinit var mStoreData: StoreData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        mStoreData = intent.getSerializableExtra("store") as StoreData
        setupEvents()
        setValues()
    }

    fun setupEvents() {

        btnCall.setOnClickListener {

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                    val myIntent = Intent( Intent.ACTION_CALL, myUri )
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(this@ViewStoreDetailActivity,  "전화 연결을 하려면, 통화 권한이 필요합니다.", Toast.LENGTH_SHORT).show()

                }

            }

            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions( Manifest.permission.CALL_PHONE )
                .check()

        }

    }

    fun setValues() {
        txtName.text = mStoreData.name
        Glide.with(this).load(mStoreData.logoUrl).into(imgLogo)
        txtPhoneNum.text = mStoreData.phoneNum
        scoreRatingBar.rating = mStoreData.score.toFloat()
        txtScore.text = "(${mStoreData.score})"
    }
}