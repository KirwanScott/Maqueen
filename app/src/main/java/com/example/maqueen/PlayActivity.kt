package com.example.maqueen

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        // icon -> animate icon
        val icon : ImageView = findViewById(R.id.icon2)
        val animator = ObjectAnimator.ofFloat(icon, "translationY", 0f, 50f)
        animator.duration = 2000; animator.repeatCount = ObjectAnimator.INFINITE;
        animator.repeatMode = ObjectAnimator.REVERSE; animator.interpolator = LinearInterpolator()
        animator.start();

//
        // onclick -> buttons
        // RACE-BOT
        val btnRace : Button = findViewById(R.id.btnRace)
        btnRace.setOnClickListener {

        }

        // ROTATE-BOT
        val btnRotate : Button = findViewById(R.id.btnRotate)
        btnRotate.setOnClickListener {

        }
    }
}