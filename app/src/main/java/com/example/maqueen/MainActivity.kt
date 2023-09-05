package com.example.maqueen

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.net.URL
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val executorService1 = Executors.newFixedThreadPool(2)
        val executorService2 = Executors.newFixedThreadPool(3)

        // icon -> animate icon
        val icon: ImageView = findViewById(R.id.icon)
        val animator = ObjectAnimator.ofFloat(icon, "translationY", 0f, 50f)
        animator.duration = 2000; animator.repeatCount = ObjectAnimator.INFINITE;
        animator.repeatMode = ObjectAnimator.REVERSE; animator.interpolator = LinearInterpolator()
        animator.start();


        // onclick -> directions
        // UP
        val btnUp: ImageView = findViewById(R.id.btnUp)
        btnUp.setOnClickListener {

            //val executor = Executors.newSingleThreadExecutor()
            executorService1.execute {
                val url = URL("http://192.168.4.1/DriveAlt")
                val json = url.readText()
                runOnUiThread {
                    executorService1.shutdown()
                }
            }
            Toast.makeText(this, "Has been clicked", Toast.LENGTH_SHORT).show()


        }


        // DOWN
        val btnDown: ImageView = findViewById(R.id.btnDown)
        btnDown.setOnClickListener {
            //val executor = Executors.newSingleThreadExecutor()
            executorService2.execute {
                val url = URL("http://192.168.4.1/Stop")
                val json = url.readText()
                runOnUiThread {
                    executorService2.shutdown()
                }

            }
            Toast.makeText(this, "Has been clicked", Toast.LENGTH_SHORT).show()
        }


            // LEFT
            val btnLeft: ImageView = findViewById(R.id.btnLeft)
            btnLeft.setOnClickListener {
                val executor = Executors.newSingleThreadExecutor()
                executor.execute {
                    val url = URL("http://192.168.4.1/Left")
                    val json = url.readText()
                }
                Toast.makeText(this, "Has been clicked", Toast.LENGTH_SHORT).show()

            }


            // RIGHT
            val btnRight: ImageView = findViewById(R.id.btnRight)
            btnRight.setOnClickListener {
                val executor = Executors.newSingleThreadExecutor()
                executor.execute {
                    val url = URL("http://192.168.4.1/Right")
                    val json = url.readText()
                }
                Toast.makeText(this, "Has been clicked", Toast.LENGTH_SHORT).show()

            }


            // navigate to next page -> lets play-btn
            val btnPlay: Button = findViewById(R.id.btnPlay)
            btnPlay.setOnClickListener {
                val intent = Intent(this, PlayActivity::class.java)
                startActivity(intent)
            }
        }

    }
