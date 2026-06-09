package com.example.condomanager // Garanta que está o seu package aqui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// Modelo para o Aviso do Mural
data class WallNotice(val title: String, val date: String, val message: String)

class WallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wall)

        val rvWall = findViewById<RecyclerView>(R.id.rvWall)

        // Lista de avisos fictícios do condomínio
        val noticeList = listOf(
            WallNotice("Elevator Maintenance", "06/08/2026", "The main elevator will be undergoing preventive maintenance tomorrow from 2 PM to 4 PM."),
            WallNotice("General Assembly", "06/05/2026", "Next Thursday at 7 PM we will have our monthly meeting in the party hall to discuss the new budget."),
            WallNotice("Water Supply Interruption", "06/01/2026", "The water will be temporarily turned off on Friday morning for internal pipe repairs.")
        )

        rvWall.layoutManager = LinearLayoutManager(this)
        rvWall.adapter = WallAdapter(noticeList)
    }

    // O Adapter interno para desenhar os itens na lista
    class WallAdapter(private val notices: List<WallNotice>) :
        RecyclerView.Adapter<WallAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val title: TextView = view.findViewById(R.id.txtWallTitle)
            val date: TextView = view.findViewById(R.id.txtWallDate)
            val message: TextView = view.findViewById(R.id.txtWallMessage)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wall, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = notices[position]
            holder.title.text = item.title
            holder.date.text = "Posted on: ${item.date}"
            holder.message.text = item.message
        }

        override fun getItemCount() = notices.size
    }
}