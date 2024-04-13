package com.example.chat_gpt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chat_gpt.databinding.ActivityMainBinding
import view.ChatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNewChat.setOnClickListener{
            val goOnChatIntent = Intent(this, ChatActivity::class.java)
            startActivity(goOnChatIntent)
        }
    }
}