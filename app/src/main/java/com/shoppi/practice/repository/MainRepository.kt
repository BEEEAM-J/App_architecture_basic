package com.shoppi.practice.repository

import com.shoppi.practice.MainData

// Main 화면에서 보여줄 데이터를 관리함
// Data Source로 부터 데이터를 받아야함

class MainRepository(
    private val mainDataSource: MainDataSource
) {

    fun getMainData(): MainData {
        return mainDataSource.getMainData()
    }

}