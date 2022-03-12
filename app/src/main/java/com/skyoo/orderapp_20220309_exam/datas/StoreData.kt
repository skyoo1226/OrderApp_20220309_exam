package com.skyoo.orderapp_20220309_exam.datas

import java.io.Serializable

class StoreData(
    val name: String,
    val score: Double,
    val phoneNum: String,
    val logoUrl: String,
) : Serializable {
}