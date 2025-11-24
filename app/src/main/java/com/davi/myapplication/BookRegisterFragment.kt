package com.davi.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BookRegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_book_register, container, false)

        val btnAddCopy = view.findViewById<LinearLayout>(R.id.btn_add_copy)
        btnAddCopy.setOnClickListener {
            findNavController().navigate(R.id.action_register_to_addCopy)
        }

        return view
    }
}
