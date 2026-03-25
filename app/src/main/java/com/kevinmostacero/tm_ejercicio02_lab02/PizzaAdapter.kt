package com.kevinmostacero.tm_ejercicio02_lab02

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PizzaAdapter(
    private val context: Context,
    private val listaPizzas: List<Pizza>
) : BaseAdapter() {

    override fun getCount(): Int {
        return listaPizzas.size
    }

    override fun getItem(position: Int): Any {
        return listaPizzas[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val vista: View = convertView ?: LayoutInflater.from(context)
            .inflate(R.layout.item_pizza, parent, false)

        val imgPizza = vista.findViewById<ImageView>(R.id.imgPizza)
        val txtPizza = vista.findViewById<TextView>(R.id.txtPizza)

        val pizza = listaPizzas[position]

        imgPizza.setImageResource(pizza.imagen)
        txtPizza.text = pizza.nombre

        return vista
    }
}