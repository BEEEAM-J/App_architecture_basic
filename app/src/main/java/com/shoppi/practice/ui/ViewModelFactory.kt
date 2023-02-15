package com.shoppi.practice.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shoppi.practice.repository.MainDataSource
import com.shoppi.practice.repository.MainRepository

// ViewModel의 생성 방식을 알려주는 ViewModelProvider.Factory를 상속한 클래스이다.

class ViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(MainDataSource)) as T
        }
    }
}
