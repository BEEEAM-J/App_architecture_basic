package com.shoppi.practice.repository

import com.shoppi.practice.MainData

// 데이터를 요청하는 곳
// Data Source는 여러 유형이 존재할 수 있다. 이런 여러 유형에 Data Source에게 요청하는 것은 원본 데이터이다.

interface MainDataSource {

    // 데이터를 요청하는 메서드
    fun getMainData(): MainData

}