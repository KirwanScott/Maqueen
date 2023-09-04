package com.example.maqueen

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // icon -> animate icon
        val icon : ImageView = findViewById(R.id.icon)
        val animator = ObjectAnimator.ofFloat(icon, "translationY", 0f, 50f)
        animator.duration = 2000; animator.repeatCount = ObjectAnimator.INFINITE;
        animator.repeatMode = ObjectAnimator.REVERSE; animator.interpolator = LinearInterpolator()
        animator.start();


        // onclick -> directions
        // UP
        val btnUp : ImageView = findViewById(R.id.btnUp)
        btnUp.setOnClickListener {

        }


        // DOWN
        val btnDown : ImageView = findViewById(R.id.btnDown)
        btnDown.setOnClickListener {

        }


        // LEFT
        val btnLeft : ImageView = findViewById(R.id.btnLeft)
        btnLeft.setOnClickListener {

        }


        // RIGHT
        val btnRight : ImageView = findViewById(R.id.btnRight)
        btnRight.setOnClickListener {

        }


        // navigate to next page -> lets play-btn
        val btnPlay : Button = findViewById(R.id.btnPlay)
        btnPlay.setOnClickListener {
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}