package com.davi.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BookSearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // infla o layout da tela
        val view = inflater.inflate(R.layout.fragment_book_search, container, false)

        // botão "Adicionar livro"
        val btnAddBook = view.findViewById<LinearLayout>(R.id.btn_add_book)
        btnAddBook.setOnClickListener {
            // navega para a tela de "Registrar Livro"
            findNavController().navigate(R.id.action_bookSearch_to_register)
        }

        return view
    }
}
