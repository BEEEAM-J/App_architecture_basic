package com.shoppi.practice.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.shoppi.practice.R
import com.shoppi.practice.databinding.ActivityMainBinding
import com.shoppi.practice.ui.common.ViewModelFactory

class MainActivity : AppCompatActivity() {

    // viewModel에 생성자가 추가되어서 viewModel 생성 방식을 변경해야함
    // 생성자가 추가된 viewModel의 생성 방식은 viewModels의 3번째 인자로 알려줄 수 있다.
    // ViewModelProvider.Factory를 전달해야함

    private val viewModel: MainViewModel by viewModels { ViewModelFactory() }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data Binding을 했기 때문에 직접 참조할 필요가 없어짐
//        val helloWorld = findViewById<TextView>(R.id.tv_helloWorld)
//        val helloAndroid = findViewById<TextView>(R.id.tv_helloAndroid)

        // 액티비티에서는 binding class.inflate(layoutInflater)로 바인딩 객체를 초기화 하고,
        // setContentView(binding.root)로 레이아웃을 표시한다.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setText()
    }

    private fun setText() {
        viewModel.text.observe(this) { text ->
//            helloWorld.text = text1.toString()
            // 여기에서 가져온 data class를 넣어주면 알아서 값이 할당이 된다.
            binding.text = text
        }
    }


}