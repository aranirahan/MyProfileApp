package com.aranirahan.myprofileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_simpan
import kotlinx.android.synthetic.main.activity_main.et_alamat
import kotlinx.android.synthetic.main.activity_main.et_name
import kotlinx.android.synthetic.main.activity_main.et_telepon
import kotlinx.android.synthetic.main.activity_main.sp_gender

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_simpan.setOnClickListener {
            val name = et_name.text.toString()
            val gender = sp_gender.selectedItem.toString()
            val telepon = et_telepon.text.toString()
            val alamat = et_alamat.text.toString()
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("gender", gender)
            intent.putExtra("telepon", telepon)
            intent.putExtra("alamat", alamat)
            startActivity(intent)
        }
    }
}
