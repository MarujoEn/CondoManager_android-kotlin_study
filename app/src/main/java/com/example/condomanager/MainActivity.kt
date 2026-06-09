package com.example.condomanager // <- DEIXE O SEU PACOTE AQUI

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.condomanager.R // <- ADICIONE O SEU PACOTE AQUI SEGUIDO DE .R

class MainActivity : AppCompatActivity() { // Se renomeou para LoginActivity, mude aqui

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            val emailText = edtEmail.text.toString().trim()
            val passwordText = edtPassword.text.toString().trim()

            if (emailText == "admin@admin.com" && passwordText == "1234") {
                // Apontando temporariamente para si mesma para não dar erro
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid email or password!", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            Toast.makeText(this, "Registration feature not implemented yet.", Toast.LENGTH_SHORT).show()
        }
    }
}