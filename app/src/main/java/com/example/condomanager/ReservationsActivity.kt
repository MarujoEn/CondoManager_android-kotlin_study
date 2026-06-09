package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Reservation(val area: String, val date: String, val status: String)

class ReservationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservations)

        val rvReservations = findViewById<RecyclerView>(R.id.rvReservations)

        // Dados fictícios para preencher a tela
        val reservationList = listOf(
            Reservation("Barbecue Area", "06/15/2026", "Confirmed"),
            Reservation("Party Hall", "07/04/2026", "Pending Approval"),
            Reservation("Tennis Court", "07/12/2026", "Confirmed")
        )

        rvReservations.layoutManager = LinearLayoutManager(this)
        rvReservations.adapter = ReservationAdapter(reservationList)
    }

    class ReservationAdapter(private val reservations: List<Reservation>) :
        RecyclerView.Adapter<ReservationAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val area: TextView = view.findViewById(R.id.txtAreaName)
            val date: TextView = view.findViewById(R.id.txtReservationDate)
            val status: TextView = view.findViewById(R.id.txtReservationStatus)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_reservation, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = reservations[position]
            holder.area.text = item.area
            holder.date.text = "Date: ${item.date}"
            holder.status.text = "Status: ${item.status}"
        }

        override fun getItemCount() = reservations.size
    }
}