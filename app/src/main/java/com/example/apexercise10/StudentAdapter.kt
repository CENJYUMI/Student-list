package com.example.apexercise10

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.apexercise10.databinding.StudentLayoutBinding

class StudentAdapter(private val student:List<Student>): RecyclerView.Adapter<StudentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = StudentLayoutBinding.inflate(inflater, parent, false)
        return StudentViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return student.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.bind(student[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, student[position].name, Toast.LENGTH_LONG)
                .show()
            val image = student[position].studentImage

            val intent = Intent(holder.itemView.context, StudentInfoActivity::class.java)
            if (image is Int) {
                intent.putExtra("studentImage", image) // Put the image as a Drawable extra

            }
            intent.putExtra("name", student[position].name)
            intent.putExtra("age", student[position].age)
            intent.putExtra("grade", student[position].grade)
            holder.itemView.context.startActivities(arrayOf(intent))

        }
    }
}