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
}