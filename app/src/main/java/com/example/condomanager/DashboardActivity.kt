package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Mapeando o botão de Contatos como exemplo
        val btnInvoices = findViewById<Button>(R.id.btnInvoices)
        val btnReservations = findViewById<Button>(R.id.btnReservations)


        btnInvoices.setOnClickListener {
            val intent = Intent(this, InvoicesActivity::class.java)
            startActivity(intent)
        }


        btnReservations.setOnClickListener {
            val intent = Intent(this, ReservationsActivity::class.java)
            startActivity(intent)
        }

        val btnAuthorization = findViewById<Button>(R.id.btnAuthorization)

        btnAuthorization.setOnClickListener {
            val intent = Intent(this, AuthorizationActivity::class.java)
            startActivity(intent)
        }

        val btnWall = findViewById<Button>(R.id.btnWall)

        btnWall.setOnClickListener {
            val intent = Intent(this, WallActivity::class.java)
            startActivity(intent)
        }

        val btnMoving = findViewById<Button>(R.id.btnMoving)

        btnMoving.setOnClickListener {
            val intent = Intent(this, MovingActivity::class.java)
            startActivity(intent)
        }

        val btnContacts = findViewById<Button>(R.id.btnContacts)

        btnContacts.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }

        // Repita o processo para os outros botões conforme formos criando as telas
    }
}