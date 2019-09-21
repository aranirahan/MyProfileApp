package com.aranirahan.myprofileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.tv_alamat
import kotlinx.android.synthetic.main.activity_profile.tv_jenis_kelamin
import kotlinx.android.synthetic.main.activity_profile.tv_nama
import kotlinx.android.synthetic.main.activity_profile.tv_telepon

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent.extras
        val name = intent?.getString("name")
        val telepon = intent?.getString("telepon")
        val kelamin = intent?.getString("gender")
        val alamat = intent?.getString("alamat")

        tv_nama.text = name
        tv_telepon.text = telepon
        tv_jenis_kelamin.text = kelamin
        tv_alamat.text = alamat
    }
}
