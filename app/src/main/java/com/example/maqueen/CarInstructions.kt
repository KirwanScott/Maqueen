package com.example.maqueen

import java.net.URL

class CarInstructions {


    companion object{

        suspend fun Forward()
        {
            val url = URL("http://192.168.4.1/Drive")
            val json = url.readText()
        }



    }
}