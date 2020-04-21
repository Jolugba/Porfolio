package com.tinuade.porfolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLog("", "The application is onCreate")

    }

    override fun onPause() {
        super.onPause()
        showLog("", "The application is onPause")


    }

    override fun onResume() {
        super.onResume()
        showLog("", "The application is onResume")

    }

    override fun onStop() {
        super.onStop()
        showLog("", "The application is onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        showLog("", "The application is onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        showLog("", "The application is onRestart")

    }

}
