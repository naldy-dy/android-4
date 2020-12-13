package com.naldy.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shafatasnim.tugas_4.R
import kotlinx.android.synthetic.main.activity_explicit_inten.*

class ExplicitIntenActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_AGE = "extra_age"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_inten)

        txt_nama.text = intent.getStringExtra(EXTRA_NAME)
        txt_email.text = intent.getStringExtra(EXTRA_EMAIL)
        txt_age.text = intent.getStringExtra(EXTRA_AGE)

        btn_back.setOnClickListener{
            val backItm = Intent(this@ExplicitIntenActivity, MainActivity::class.java)
            startActivity(backItm)
        }
    }
}