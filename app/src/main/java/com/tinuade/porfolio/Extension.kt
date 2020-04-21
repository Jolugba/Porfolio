package com.tinuade.porfolio

import android.app.Activity
import android.util.Log

fun Activity.showLog(message:String){
    if(BuildConfig.DEBUG)Log.i(this::class.java.simpleName,message)
}