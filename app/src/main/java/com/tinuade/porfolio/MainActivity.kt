package com.tinuade.porfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.grid_layout.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showLog("Application is onCreate")

        fun viewMyIntent(url: String) {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse(url)
            startActivity(Intent.createChooser(intent, "Welcome"))

        }

        playStore_image.setOnClickListener {
            viewMyIntent("https://play.google.com/store/apps/details?id=com.project.android_kidstories")

        }
        github_image.setOnClickListener {
            viewMyIntent("https://github.com/Jolugba/")

        }
        bitBucket_image.setOnClickListener {
            viewMyIntent("https://bitbucket.org/dashboard/projects")

        }
        facebook_image.setOnClickListener {
            viewMyIntent("https://www.facebook.com")

        }
        twitter_image.setOnClickListener {
            viewMyIntent("https://mobile.twitter.com/missTinuade")


        }
        instagram_image.setOnClickListener {
            viewMyIntent("https://www.instagram.com/estherjolugba/")


        }
        googlePlus.setOnClickListener {
            viewMyIntent("https://myaccount.google.com/profile")


        }
        youTube_image.setOnClickListener {
            viewMyIntent("https://www.youtube.com/")


        }
        dribbble_image.setOnClickListener {
            viewMyIntent("https://dribbble.com/")


        }
        linkedIn_image.setOnClickListener {
            viewMyIntent("https://www.linkedin.com/in/esther-jolugba-0b336a185")


        }
        mail_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_EMAIL, "estherjolugba@yahoo.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Send Email Using"))


        }
        whatsapp_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, "Send me a message")
            intent.type = "text/plain"
            intent.setPackage("com.whatsapp")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        skype_image.setOnClickListener {
            viewMyIntent("https://www.skype.com/en/")


        }
        google_image.setOnClickListener {
            viewMyIntent("https://www.google.com")


        }
        androidBot_image.setOnClickListener {
            viewMyIntent("https://developer.android.com/")


        }
        web_image.setOnClickListener {
            viewMyIntent("https://dev.start.ng/#/user/dashboard")


        }


    }


    override fun onPause() {
        super.onPause()
        showLog("The application is onPause")


    }

    override fun onResume() {
        super.onResume()
        showLog("The application is onResume")


    }

    override fun onStop() {
        super.onStop()
        showLog("The application is onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        showLog("The application is onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        showLog("The application is onRestart")

    }

}
