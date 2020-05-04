package com.tinuade.porfolio

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tinuade.porfolio.SignUp.AppPreferences.MODE
import com.tinuade.porfolio.SignUp.AppPreferences.NAME
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    object AppPreferences {
        const val NAME = "com.tinuade.porfolio.portfolio"
        const val MODE = Context.MODE_PRIVATE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        progress.visibility = View.GONE

        signInLink.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()


        }
        signUp_button.setOnClickListener {
            signUpButton()
        }

    }

    private fun signUpButton() {
        val name: String = _fullname_editText.text.toString()
        val email: String = email_editText.text.toString()
        val password: String = password_editText.text.toString()
        val phoneNumber: String = phone_number_editText.text.toString()

        if (TextUtils.isEmpty(name) && name.length < 3) {
            showToast("Please Enter a valid Name")
        } else if (TextUtils.isEmpty(email) && !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast("Please Enter a valid Email Address")
        } else if (TextUtils.isEmpty(password)) {
            showToast("Please Enter a valid Password")
        } else if (TextUtils.isEmpty(password) && email.isEmpty()) {
            showToast("Please Enter a valid Password and Email Address")
        } else if (TextUtils.isEmpty(password) && !email.contains("@")) {
            showToast("Please Enter a valid Password and email address")
        } else if (TextUtils.isEmpty(phoneNumber) && phoneNumber.length < 9) {
            showToast("Please Enter a valid Phone Number")
            password_editText.setText("")
        } else {

            val preferences: SharedPreferences = getSharedPreferences(NAME, MODE)

            // stored them with the help of editor
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.putString("name",name)
            editor.putString("email",email)
            editor.putString("password",password)
            editor.putString("phonenumber",phoneNumber)
            editor.putString(email + password + "data", "Email: $email")
            editor.apply()
            progress.visibility = View.VISIBLE
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
            showToast("you have Successfully registered")
            progress.visibility = View.GONE

        }
    }
}





