package com.example.apexercise10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apexercise10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Fragment
        val SList = StudentListFragment()

        //default fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView2, SList)
            commit()
        }


    }
}
