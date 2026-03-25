package com.kevinmostacero.tm_ejercicio02_lab02

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var gridViewPizzas: GridView
    private lateinit var listaPizzas: ArrayList<Pizza>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridViewPizzas = findViewById(R.id.gridViewPizzas)

        listaPizzas = arrayListOf(
            Pizza("Hawaiana", R.drawable.pizza_hawaiana),
            Pizza("Pepperoni", R.drawable.pizza_pepperoni),
            Pizza("Americana", R.drawable.pizza_americana),
            Pizza("Vegetariana", R.drawable.pizza_vegetariana),
            Pizza("Cuatro Quesos", R.drawable.pizza_cuatroquesos),
            Pizza("Suprema", R.drawable.pizza_suprema)
        )

        val adapter = PizzaAdapter(this, listaPizzas)
        gridViewPizzas.adapter = adapter

        gridViewPizzas.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                "Pizza: ${listaPizzas[position].nombre}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}