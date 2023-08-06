package com.example.apexercise10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apexercise10.databinding.ActivityStudentInfoBinding

class StudentInfoActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStudentInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resourceId = intent.getIntExtra("studentImage", 0) // Provide a default value if the extra is not found
        binding.StudentImage.setImageResource(resourceId)

        binding.txtStudName.text = intent.getStringExtra("name")
        binding.txtStudAge.text = intent.getStringExtra("age")
        binding.txtStudGrade.text = intent.getStringExtra("grade")


    }
}