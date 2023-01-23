package com.example.kotlinrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinrecyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        binding.rvContacts.setBackgroundColor(Color.RED)

        val contacts = createContacts()
        binding.rvContacts.adapter = ContactAdapter(this,contacts)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
    }

    private fun createContacts():List<Contacts> {
        val contact = mutableListOf<Contacts>()
        contact.add(Contacts("Prabal Srivastava",20))
        contact.add(Contacts("Prakriti Srivastava",15))
        for (i in 1..150) contact += Contacts("Person $i",i+5)
        return contact
    }
}