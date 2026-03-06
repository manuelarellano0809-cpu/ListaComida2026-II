package com.mexiti.listacomida.data

import com.mexiti.listacomida.R
import com.mexiti.listacomida.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo> {
        return listOf(
            Platillo(R.string.desayuno, R.drawable.desayuno, "MX $100", "Desscuento de 20%"),
            Platillo(R.string.hamburger, R.drawable.hamburger, "MX $80", "Descuento de 30%"),
            Platillo(R.string.pizza, R.drawable.pizza, "MX $150", "Descuento de 25%"),
            Platillo(R.string.postre, R.drawable.postre, "MX $50", "Descuento de 10%"),
            Platillo(R.string.pozole, R.drawable.pozole, "MX $100", "Descuento de 20%"),
            Platillo(R.string.tacos, R.drawable.tacos, "MX $60", "Descuento de 15%"),
        )
    }
}
