package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : AppCompatActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(/* name = */ EXTRA_LEAGUE)!!
        println(league)

    }
}