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

        val edtName = findViewById<EditText>(R.id.edtMovingName)
        val edtApt = findViewById<EditText>(R.id.edtMovingApt)
        val edtDate = findViewById<EditText>(R.id.edtMovingDate)
        val edtType = findViewById<EditText>(R.id.edtMovingType)
        val btnSave = findViewById<Button>(R.id.btnSaveMoving)

        btnSave.setOnClickListener {
            val name = edtName.text.toString().trim()
            val apt = edtApt.text.toString().trim()
            val date = edtDate.text.toString().trim()
            val type = edtType.text.toString().trim()

            if (name.isEmpty() || apt.isEmpty() || date.isEmpty() || type.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Moving scheduled successfully!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}