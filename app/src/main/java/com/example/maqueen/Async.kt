package com.example.maqueen
import android.os.AsyncTask
import java.io.IOException
import java.net.URL

class NetworkTask(private val callback: MainActivity) : AsyncTask<String, Void, String>() {

    interface Callback {
        fun onSuccess(result: String)
        fun onError(exception: Exception)
    }

    override fun doInBackground(vararg params: String?): String {
        try {
            val url = URL(params[0])
            return url.readText()
        } catch (e: IOException) {
            callback.onError(e)
        }
        return ""
    }

    override fun onPostExecute(result: String) {
        if (result.isNotEmpty()) {
            callback.onSuccess(result)
        }
    }
}
