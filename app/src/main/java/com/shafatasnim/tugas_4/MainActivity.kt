package com.naldy.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import com.naldy.myapplication.model.User
import com.shafatasnim.tugas_4.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simple.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }
        btn_intent_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplicitIntenActivity::class.java)

            dataIntent.putExtra(ExplicitIntenActivity.EXTRA_NAME, "Sunardi")
            dataIntent.putExtra(ExplicitIntenActivity.EXTRA_EMAIL, "Sunardi123@gmail.com")
            dataIntent.putExtra(ExplicitIntenActivity.EXTRA_AGE, "19 Tahun")
            startActivity(dataIntent)
        }

        btn_inten_parcelable.setOnClickListener {
            val parcelInten = Intent(this@MainActivity, ParcleActivity::class.java)
            val user = User("Sunardi", "akunaku@gmail.com", "19 Tahun")
            parcelInten.putExtra(ParcleActivity.EXTRA_USER, user)
            startActivity(parcelInten)
        }

        btn_implicit.setOnClickListener {
            val phoneNumber = "0895365281040"
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(intent)
        }
    }
}