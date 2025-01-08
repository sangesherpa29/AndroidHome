package com.example.kotlintutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kotlintutorial.ui.theme.CustomNavigationBar

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // List of Conversation UI
            // ConversationList(SampleData.conversationSample)

        }
    }
}