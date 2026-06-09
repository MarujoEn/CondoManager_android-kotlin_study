package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MovingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moving)

        val edtDate = findViewById<EditText>(R.id.edtMovingDate)
        val edtTime = findViewById<EditText>(R.id.edtMovingTime)
        val btnSave = findViewById<Button>(R.id.btnSaveMoving)

        btnSave.setOnClickListener {
            val date = edtDate.text.toString().trim()
            val time = edtTime.text.toString().trim()

            if (date.isEmpty() || time.isEmpty()) {
                Toast.makeText(this, "Please fill in both Date and Time!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Moving scheduled successfully for $date at $time!", Toast.LENGTH_LONG).show()
                finish() // Fecha a tela e volta ao painel principal automaticamente
            }
        }
    }
}