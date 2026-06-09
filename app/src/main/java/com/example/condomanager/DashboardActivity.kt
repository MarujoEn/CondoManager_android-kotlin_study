package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Mapeando o botão de Contatos como exemplo
        val btnContacts = findViewById<Button>(R.id.btnContacts)
        val btnInvoices = findViewById<Button>(R.id.btnInvoices)

        btnInvoices.setOnClickListener {
            // No futuro, aqui abriremos a tela de Boletos
            Toast.makeText(this, "Opening Bills...", Toast.LENGTH_SHORT).show()
        }

        btnContacts.setOnClickListener {
            Toast.makeText(this, "Opening Contacts...", Toast.LENGTH_SHORT).show()
        }

        // Repita o processo para os outros botões conforme formos criando as telas
    }
}