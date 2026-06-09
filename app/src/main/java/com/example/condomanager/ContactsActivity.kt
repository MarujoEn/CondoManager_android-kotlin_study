package com.example.condomanager // Verifique seu package

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Contact(val role: String, val phone: String, val email: String)

class ContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val rvContacts = findViewById<RecyclerView>(R.id.rvContacts)

        val contactList = listOf(
            Contact("Front Desk / Gate", "Phone: (55) 5555-0101", "Email: gate@condo.com"),
            Contact("Property Manager (Sindico)", "Phone: (55) 5555-0102", "Email: manager@condo.com"),
            Contact("Administration Office", "Phone: (55) 5555-0103", "Email: admin@condo.com"),
            Contact("Maintenance Emergency", "Phone: (55) 5555-0199", "Email: support@condo.com")
        )

        rvContacts.layoutManager = LinearLayoutManager(this)
        rvContacts.adapter = ContactAdapter(contactList)
    }

    class ContactAdapter(private val contacts: List<Contact>) :
        RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val role: TextView = view.findViewById(R.id.txtContactRole)
            val phone: TextView = view.findViewById(R.id.txtContactPhone)
            val email: TextView = view.findViewById(R.id.txtContactEmail)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_contact, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = contacts[position]
            holder.role.text = item.role
            holder.phone.text = item.phone
            holder.email.text = item.email
        }

        override fun getItemCount() = contacts.size
    }
}