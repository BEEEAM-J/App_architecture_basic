package com.shoppi.practice.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.practice.MainData
import com.shoppi.practice.repository.MainRepository

// main 화면에서 데이터를 그릴때 holder 역할을 한다.

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    // 데이터를 관리할 때는 2가지 타입으로 나누어서 관리한다.
    private val _text = MutableLiveData<MainData>()
    val text: LiveData<MainData> = _text


    init {
        loadMainData()
    }

    // 데이터 요청
    private fun loadMainData() {
        // Data Layer - Repository에 요청
        val mainData = mainRepository.getMainData()

        // 위에서 만든 MainData 형식의 MutableLiveData에 data class 값을 넣는다.
        mainData?.let { mainData ->
            _text.value = mainData
        }
    }

}