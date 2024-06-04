package com.example.mvi

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val viewModel by lazy { MainViewModel(applicationContext) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.sing).setOnClickListener {
            viewModel.handleIntent(UserIntent.Sing("唱歌"))
        }
        findViewById<Button>(R.id.dance).setOnClickListener {
            viewModel.handleIntent(UserIntent.Dance("跳舞"))
        }
        findViewById<Button>(R.id.study).setOnClickListener {
            viewModel.handleIntent(UserIntent.Study("学习"))
        }
    }
}