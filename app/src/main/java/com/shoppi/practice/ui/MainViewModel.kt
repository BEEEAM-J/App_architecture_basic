package com.shoppi.practice.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shoppi.practice.repository.MainRepository

// main 화면에서 데이터를 그릴때 holder 역할을 한다.

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    // 데이터를 관리할 때는 2가지 타입으로 나누어서 관리한다.
    private val _text1 = MutableLiveData<String>()
    val text1: LiveData<String> = _text1

    private val _text2 = MutableLiveData<String>()
    val text2: LiveData<String> = _text2


    // 데이터 요청
    fun loadMainData1() {
        // Data Layer - Repository에 요청
        val mainData1 = mainRepository.getMainData1()
        mainData1?.let { mainData1 ->
            _text1.value = mainData1
        }
    }

    fun loadMainData2() {
        // Data Layer - Repository에 요청
        val mainData2 = mainRepository.getMainData2()
        mainData2?.let { maindata2 ->
            _text2.value = maindata2
        }
    }
}