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

        showLog( "Application is onCreate")

        playStore_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data =
                Uri.parse("https://play.google.com/store/apps/details?id=com.project.android_kidstories")
            startActivity(Intent.createChooser(intent, "Welcome"))

        }
        github_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://github.com/Jolugba/")
            startActivity(Intent.createChooser(intent, "Welcome"))

        }
        bitBucket_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://bitbucket.org/dashboard/projects")
            startActivity(Intent.createChooser(intent, "Welcome"))

        }
        facebook_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.facebook.com")
            startActivity(Intent.createChooser(intent, "Welcome"))

        }
        twitter_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://mobile.twitter.com/missTinuade")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        instagram_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.instagram.com/estherjolugba/")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        googlePlus.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://myaccount.google.com/profile")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        youTube_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        dribbble_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://dribbble.com/")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        linkedIn_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.linkedin.com/in/esther-jolugba-0b336a185")
            startActivity(Intent.createChooser(intent, "Welcome"))


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
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.skype.com/en/")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        google_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://www.google.com")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        androidBot_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://developer.android.com/")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }
        web_image.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.data = Uri.parse("https://dev.start.ng/#/user/dashboard")
            startActivity(Intent.createChooser(intent, "Welcome"))


        }


    }


    override fun onPause() {
        super.onPause()
        showLog( "The application is onPause")


    }

    override fun onResume() {
        super.onResume()
        showLog( "The application is onResume")


    }

    override fun onStop() {
        super.onStop()
        showLog( "The application is onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        showLog("The application is onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        showLog( "The application is onRestart")

    }

}
