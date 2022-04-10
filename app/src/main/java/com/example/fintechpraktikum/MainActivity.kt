package com.example.fintechpraktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fintechpraktikum.home.HomeFragment
import com.example.fintechpraktikum.profile.ProfileFragment
import com.example.fintechpraktikum.setting.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnHome: Button
    private lateinit var btnProfile: Button
    private lateinit var btnSetting: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnProfile = findViewById(R.id.btn_profile)
        btnSetting = findViewById(R.id.btn_setting)

        /*btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", "naka")
            startActivity(intent)
        }*/
        btnHome.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btnSetting.setOnClickListener {
            loadFragment(SettingFragment())
        }
        btnProfile.setOnClickListener {
            loadFragment(ProfileFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }

}