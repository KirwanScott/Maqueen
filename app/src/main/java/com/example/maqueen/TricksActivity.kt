package com.example.maqueen

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TricksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tricks)

        // icon -> animate icon
//        val icon : ImageView = findViewById(R.id.icon2)
//        val animator = ObjectAnimator.ofFloat(icon, "translationY", 0f, 50f)
//        animator.duration = 2000; animator.repeatCount = ObjectAnimator.INFINITE;
//        animator.repeatMode = ObjectAnimator.REVERSE; animator.interpolator = LinearInterpolator()
//        animator.start();


        // RACE
        val btnRace : Button = findViewById(R.id.btnRace)
        btnRace.setOnClickListener {}

        // ROTATE
        val btnRotate : Button = findViewById(R.id.btnRotate)
        btnRotate.setOnClickListener {}

    }
}