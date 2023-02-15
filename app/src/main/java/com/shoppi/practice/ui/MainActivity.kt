package com.shoppi.practice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.shoppi.practice.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorld = findViewById<TextView>(R.id.tv_helloWorld)
        val helloAndroid = findViewById<TextView>(R.id.tv_helloAndroid)

        // viewModel에 생성자가 추가되어서 viewModel 생성 방식을 변경해야함
        // 생성자가 추가된 viewModel의 생성 방식은 viewModels의 3번째 인자로 알려줄 수 있다.
        // ViewModelProvider.Factory를 전달해야함

        val viewModel: MainViewModel by viewModels{}

        viewModel.text1.observe(this) { text1 ->
            helloWorld.text = text1.toString()
        }

        viewModel.text2.observe(this) { text2 ->
            helloAndroid.text = text2.toString()
        }
    }
}