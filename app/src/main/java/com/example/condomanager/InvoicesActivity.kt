package com.example.condomanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// 1. Modelo de dados para o Boleto
data class Invoice(val name: String, val value: String, val date: String)

class InvoicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoices)

        val rvInvoices = findViewById<RecyclerView>(R.id.rvInvoices)

        // 2. Dados Hardcoded (como o professor pediu)
        val invoiceList = listOf(
            Invoice("Condo Fee - April", "$ 150.00", "05/10/2026"),
            Invoice("Condo Fee - May", "$ 150.00", "06/10/2026"),
            Invoice("Condo Fee - June", "$ 150.00", "07/10/2026"),
            Invoice("Extra Maintenance", "$ 50.00", "07/15/2026")
        )

        // 3. Configurando a lista
        rvInvoices.layoutManager = LinearLayoutManager(this)
        rvInvoices.adapter = InvoiceAdapter(invoiceList)
    }

    // 4. O "Ajudante" da lista (Adapter)
    class InvoiceAdapter(private val invoices: List<Invoice>) :
        RecyclerView.Adapter<InvoiceAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val name: TextView = view.findViewById(R.id.txtInvoiceName)
            val value: TextView = view.findViewById(R.id.txtInvoiceValue)
            val date: TextView = view.findViewById(R.id.txtInvoiceDate)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_invoice, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = invoices[position]
            holder.name.text = item.name
            holder.value.text = "Value: ${item.value}"
            holder.date.text = "Due Date: ${item.date}"
        }

        override fun getItemCount() = invoices.size
    }
}