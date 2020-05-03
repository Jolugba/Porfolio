package com.tinuade.porfolio

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import com.tinuade.porfolio.Login.AppPreferences.MODE
import com.tinuade.porfolio.Login.AppPreferences.NAME
import com.tinuade.porfolio.Login.AppPreferences.editor
import com.tinuade.porfolio.Login.AppPreferences.preferences
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    object AppPreferences {
        const val NAME = "com.tinuade.porfolio.portfolio"
        const val MODE = Context.MODE_PRIVATE
        lateinit var preferences: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpLink.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        login_button.setOnClickListener {
            loginUser()
        }
    }

    private fun loginUser() {
        val email: String = login_email_editText.text.toString()
        val password: String = login_password_editText.text.toString()

        if (TextUtils.isEmpty(email) && !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast("Please Enter a valid Email Address")
        } else if (TextUtils.isEmpty(password)) {
            showToast("Please Enter a valid Password")
        } else {
            AppPreferences.preferences = getSharedPreferences(NAME, MODE)
            var userEmail: String? = preferences.getString(
                email + password + "data",
                "email address or password is incorrect"
            )
            editor = preferences.edit()
            editor.putString("display", userEmail)
            editor.commit()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            showToast("successful")

        }
    }
}
