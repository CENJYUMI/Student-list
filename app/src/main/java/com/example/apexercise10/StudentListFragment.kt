package com.example.apexercise10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apexercise10.databinding.FragmentStudentListBinding

class StudentListFragment : Fragment() {
    private lateinit var binding: FragmentStudentListBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStudentListBinding.inflate(layoutInflater,container, false)
        // Inflate the layout for this fragment
        recyclerView = binding.recyclerView
        recyclerView.layoutManager =LinearLayoutManager(requireContext())

        val student = listOf(
            Student("Alvarez, David Christoph Gutierrez","Age: 7", "Grade 1",R.drawable.bkidone),
            Student("Delirio, Matt Lawrence Valdejueza","Age: 8", "Grade 1",R.drawable.bkidtwo),
            Student("Gutierrez, Braille Martinez","Age: 6", "Grade 1",R.drawable.bkidthree),
            Student("Nicolas, Yuri Kaizen Losloso","Age: 6", "Grade 1",R.drawable.bkidfour),
            Student("Portes, Dean Matthew Oxales","Age: 6", "Grade 1",R.drawable.bkidfive),
            Student("Roces, Seth Caius Egos","Age: 6", "Grade 1",R.drawable.bkidsix),
            Student("Domantay, Alissa Jazzmyn Urciana","Age: 7", "Grade 1",R.drawable.gkidonee),
            Student("Lusterio, Maryden Clarisse Osongco","Age: 6", "Grade 1",R.drawable.gkidsixxxx),
            Student("Madrona, Bleselda Francisca Estella","Age: 6", "Grade 1",R.drawable.gkidthreeeeee),
            Student("Mendoza, Adrielle Ysidra Dialola","Age: 7", "Grade 1",R.drawable.gkidfour),
            Student("Padua, Cia Jess Merle","Age: 6", "Grade 1",R.drawable.gkidseven),

        )
        recyclerView.adapter = StudentAdapter(student)
        return binding.root

    }


}