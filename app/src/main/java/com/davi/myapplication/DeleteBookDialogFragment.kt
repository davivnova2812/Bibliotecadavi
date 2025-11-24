package com.davi.myapplication

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DeleteBookDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.dialog_delete_book, null)

        val btnClose = view.findViewById<ImageButton>(R.id.btn_close)
        val btnConfirm = view.findViewById<Button>(R.id.btn_confirm)

        btnClose.setOnClickListener {
            dismiss()
        }

        btnConfirm.setOnClickListener {
            // Aqui você vai colocar a lógica de excluir o livro (depois)
            dismiss()
        }

        return AlertDialog.Builder(requireContext())
            .setView(view)
            .create()
    }
}
