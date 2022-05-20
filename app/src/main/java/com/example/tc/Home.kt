package com.example.tc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    private lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        if (savedInstanceState == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .add(R.id.frame_container, HomeFragment())
//                .commit()
//        }

        navigateTo(HomeFragment(),true)
        bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_bar)
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    navigateTo(HomeFragment(),false)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_result -> {
                    navigateTo(ResultsFragment(),false)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_attendance -> {
                    navigateTo(AttendanceFragment(),false)
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_profile ->{
                    navigateTo(ProfileFragment(),false)
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_container, fragment)

        if (addToBackstack) {
            transaction.addToBackStack(null)
        }

        transaction.commit()
    }

}
