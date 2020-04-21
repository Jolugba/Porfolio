package com.tinuade.porfolio

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.core.content.ContextCompat.startActivity

// Extensions for Log class
fun Activity.showLog(message:String){
    if(BuildConfig.DEBUG)Log.i(this::class.java.simpleName,message)
}
//Extension for Intent class
fun Activity.viewIntent(url: String) {
    val intent = Intent()
    intent.action = Intent.ACTION_VIEW
    intent.data = Uri.parse(url)
    startActivity(Intent.createChooser(intent, "Welcome"))

}