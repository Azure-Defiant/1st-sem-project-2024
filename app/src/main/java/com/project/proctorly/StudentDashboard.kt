package com.project.proctorly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.project.proctorly.databinding.ActivityStudentDashboardBinding

class StudentDashboard : AppCompatActivity() {

    private lateinit var binding : ActivityStudentDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        class YourActivity : AppCompatActivity() {

            private lateinit var binding: ActivityStudentDashboardBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding =
                    ActivityStudentDashboardBinding.inflate(layoutInflater)
                setContentView(binding.root)

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


            private fun replaceFragment(fragment: Fragment) {
                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.framelayout, fragment)
                fragmentTransaction.commit()
            }
        }
    }

}