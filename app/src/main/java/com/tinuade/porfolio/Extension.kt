package com.tinuade.porfolio

import android.app.Activity
import android.util.Log

fun Activity.showLog(TAG: String = "MainActivity", method: String) {
    Log.i(TAG, method)

}
/**btnShareToOtherApps.setOnClickListener{
    val message:String=userMessage.text.toString()
    val intent=Intent()
    intent.action=Intent.ACTION_SEND
    intent.putExtra(Intent.EXTRA_TEXT,message)
    intent.type="text/plain"

    startActivity(Intent.createChooser(intent,"Share to :"))
}**/
