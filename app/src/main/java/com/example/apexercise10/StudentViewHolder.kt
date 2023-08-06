package com.example.apexercise10

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apexercise10.databinding.StudentLayoutBinding

class StudentViewHolder(private val binding: StudentLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(student: Student){
        binding.txtRecyclerName.text = student.name
        binding.txtRecyclerAge.text = student.age
        binding.txtRecyclerGrade.text = student.grade

        Glide.with(itemView.context)
            .load(student.studentImage)
            .into(binding.studentImage)


    }

}