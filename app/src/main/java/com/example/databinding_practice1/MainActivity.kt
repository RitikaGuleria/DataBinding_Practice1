package com.example.databinding_practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding_practice1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)

//        binding.tv1.text="Hi! How are you?"
//        binding.tv2.text="Ritika Gueria"
        val quoteObj = Quote("Hi! How are you?","Ritika Gueria")
        binding.quote = quoteObj

    }
}