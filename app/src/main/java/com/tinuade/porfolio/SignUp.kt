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
import com.tinuade.porfolio.SignUp.AppPreferences.editor
import com.tinuade.porfolio.SignUp.AppPreferences.preferences
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    object AppPreferences {
        const val NAME = "com.tinuade.porfolio.portfolio"
        const val MODE = Context.MODE_PRIVATE
        lateinit var preferences: SharedPreferences
        lateinit var editor: SharedPreferences.Editor
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        progress.visibility=View.GONE

        signInLink.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)


        }
        signUp_button.setOnClickListener {
            signUpButton()
        }

    }

    private fun signUpButton() {
        val name: String = _fullname_editText.text.toString()
        val email: String = email_editText.text.toString()
        val password: String = password_editText.text.toString()
        val confirmPassword: String = confirm_password_editText.text.toString()
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
        } else if (password !== (confirmPassword)) {
            showToast("Passwords do not match")
            password_editText.setText("")
            confirm_password_editText.setText("")
        } else if (TextUtils.isEmpty(phoneNumber) && phoneNumber.length < 9) {
            showToast("Please Enter a valid Phone Number")
        } else
            preferences = getSharedPreferences(NAME, MODE)
        // as now we have information in string. Lets stored them with the help of editor
        editor= editor.putString(email + password + "data", name + "\n" + email)
        editor.commit()   // commit the values
        progress.visibility=View.VISIBLE
        // after saving the value open next activity
        val intent = Intent(this, Login::class.java)
        startActivity(intent)

        showToast("Successful")
        progress.visibility=View.GONE

    }
}





