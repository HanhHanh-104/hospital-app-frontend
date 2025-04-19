package com.example.hospitalapp_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.hospitalapp_frontend.activities.LoginActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Mở màn hình đăng nhập
        startActivity(Intent(this, LoginActivity::class.java))
        // Kết thúc MainActivity để tránh quay lại màn này
        finish()
    }
}
