package com.project.proctorly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.project.proctorly.databinding.ActivityStudentDashboardBinding

class StudentDashboard : AppCompatActivity() {

    private lateinit var binding: ActivityStudentDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set default fragment
        if (savedInstanceState == null) {
            replaceFragment(Home()) // Replace with your default fragment
        }

        // Set up the BottomNavigationView listener
        binding.bottomnavigationview.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navHome -> {
                    replaceFragment(Home())
                    true
                }
                R.id.navRecords -> {
                    replaceFragment(Records())
                    true
                }
                R.id.navHistory -> {
                    replaceFragment(History())
                    true
                }
                else -> false
            }
        }
    }

    // Function to replace fragments
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.addToBackStack(null) // Optional: adds the transaction to the back stack
        fragmentTransaction.commit()
    }
}