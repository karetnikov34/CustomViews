package ru.netology.customviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        findViewById<StatsView>(R.id.stats).data = listOf(
            0.25F,
            0.25F,
            0.25F,
            0.25F
        )
    }
}