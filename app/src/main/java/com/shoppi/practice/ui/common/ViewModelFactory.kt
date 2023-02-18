package com.shoppi.practice.ui.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shoppi.practice.repository.MainRepository
import com.shoppi.practice.repository.MainDataSourceImp
import com.shoppi.practice.ui.main.MainViewModel

// ViewModel의 생성 방식을 알려주는 ViewModelProvider.Factory를 상속한 클래스이다.

class ViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(MainDataSourceImp())) as T
        } else {
            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
        }
    }
}
