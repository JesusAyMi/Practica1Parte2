package net.iessochoa.practica1parte2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundoActivity : AppCompatActivity() {

    companion object{
        val EXTRA="practica1parte2.SegundoActivity.comtraseña"
    }

    private lateinit var tvBienvenido: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)

        tvBienvenido=findViewById(R.id.tvBienvenido)
        val contraseña=intent.getStringExtra(EXTRA)
        tvBienvenido.text="Bienvenido, la contraseña es: " + contraseña

    }
}