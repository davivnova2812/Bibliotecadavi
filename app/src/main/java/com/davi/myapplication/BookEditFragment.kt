package com.davi.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class BookEditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_book_edit, container, false)

        val btnDelete = view.findViewById<Button>(R.id.btn_delete)
        btnDelete.setOnClickListener {
            // Abre o popup de excluir livro
            DeleteBookDialogFragment().show(parentFragmentManager, "deleteBook")
        }

        return view
    }
}
