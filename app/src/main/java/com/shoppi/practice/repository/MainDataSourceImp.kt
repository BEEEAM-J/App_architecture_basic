package com.shoppi.practice.repository

import com.shoppi.practice.MainData

// interface는 생성자 생성이 불가하기 때문에 MainDataSource를 상속받는 class를 만들어서 구현체를 생성 해야 사용이 가능하다.
// 여기서 데이터를 할당해줌

class MainDataSourceImp: MainDataSource {
    override fun getMainData(): MainData {
        return MainData("안드로이드 안녕\n여기가 텍스트 1", "안드로이드 반가워\n여기가 텍스트 2")
    }
}