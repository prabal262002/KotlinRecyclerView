package com.example.kotlinrecyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactAdapter(private val context: Context, private val contacts: List<Contacts>)
    : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_contact, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount() = contacts.size

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bind(contact: Contacts) {
            itemView.personName.text = contact.name
            itemView.personAge.text = "Age: ${contact.age}"
            Glide.with(context).load(contact.imageURL).into(itemView.profileid)
        }
    }

}