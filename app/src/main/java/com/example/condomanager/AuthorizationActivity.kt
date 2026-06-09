package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        val edtName = findViewById<EditText>(R.id.edtVisitorName)
        val edtDoc = findViewById<EditText>(R.id.edtVisitorDoc)
        val btnSave = findViewById<Button>(R.id.btnSaveAuth)

        btnSave.setOnClickListener {
            val name = edtName.text.toString().trim()
            val doc = edtDoc.text.toString().trim()

            if (name.isEmpty() || doc.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            } else {
                // Simula o salvamento com sucesso
                Toast.makeText(this, "Visitor $name authorized successfully!", Toast.LENGTH_LONG).show()
                finish() // Fecha essa tela e volta para o painel automaticamente
            }
        }
    }
}