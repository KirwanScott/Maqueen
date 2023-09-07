package com.example.maqueen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.net.URL
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    fun executeNetworkTask(url: String) {
        NetworkTask(this).execute(url)
    }
    val executorService2 = Executors.newFixedThreadPool(2)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // icon -> animate icon
//        val icon: ImageView = findViewById(R.id.icon)
//        val animator = ObjectAnimator.ofFloat(icon, "translationY", 0f, 50f)
//        animator.duration = 2000; animator.repeatCount = ObjectAnimator.INFINITE;
//        animator.repeatMode = ObjectAnimator.REVERSE; animator.interpolator = LinearInterpolator()
//        animator.start();

        // multi-threading




        // FORWARD
        val btnUp: ImageView = findViewById(R.id.btnUp)
        btnUp.setOnClickListener {

            try{
                val url = "http://192.168.4.1/Drive" // Replace with your URL
                executeNetworkTask(url)
            Toast.makeText(this, "Forward Clicked", Toast.LENGTH_SHORT).show()
            }
            catch (e: Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }


        // BACKWARD
        val btnDown: ImageView = findViewById(R.id.btnDown)
        btnDown.setOnClickListener {


            try {
                val url = "http://192.168.4.1/DriveAlt"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }


        }


        // STOP
        val btnStop: TextView = findViewById(R.id.btnStop)
        btnStop.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Stop"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }


        // LEFT
        val btnLeft: ImageView = findViewById(R.id.btnLeft)
        btnLeft.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Left"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }


        // RIGHT
        val btnRight: ImageView = findViewById(R.id.btnRight)
        btnRight.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Right"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }

        val btnSound1: Button = findViewById(R.id.btnSound1)
        btnSound1.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Mario"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }

        val btnSound2: Button = findViewById(R.id.btnSound2)
        btnSound2.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Sonic"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }

        val btnFull: Button = findViewById(R.id.btnFull)
        btnFull.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Full"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }

        val btnDance: Button = findViewById(R.id.btnDance)
        btnDance.setOnClickListener {
            try {
                val url = "http://192.168.4.1/Dance"
                executeNetworkTask(url)
            }
            catch (e : Exception)
            {
                Toast.makeText(this, e.toString(),Toast.LENGTH_SHORT).show()
            }
        }






        // LIGHTS
        val btnLights: Button = findViewById(R.id.btnLights)
        btnLights.setOnClickListener {
            Toast.makeText(this, "Lights Triggered", Toast.LENGTH_SHORT).show()
        }



        // next page -> tricks
        val btnPlay: Button = findViewById(R.id.btnTricks)
        btnPlay.setOnClickListener {
            val intent = Intent(this, TricksActivity::class.java)
            startActivity(intent)
        }
    }
    fun onSuccess(result: String) {
        // Handle successful network response here
        runOnUiThread {
            Toast.makeText(this, "Success: $result", Toast.LENGTH_SHORT).show()
        }
    }

    fun onError(exception: Exception) {
        // Handle network error here
        runOnUiThread {
            Toast.makeText(this, "Error: ${exception.message}", Toast.LENGTH_SHORT).show()
        }
    }


}
