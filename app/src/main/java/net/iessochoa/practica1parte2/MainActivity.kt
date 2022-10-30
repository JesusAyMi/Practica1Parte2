package net.iessochoa.practica1parte2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //DEFINO LAS VARIABLES
    private lateinit var etContraseña: EditText
    private lateinit var btAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CONECTO LAS VARIABLES CON SUS RESPECTIVOS ELEMENTOS
        etContraseña = findViewById(R.id.etContraseña)
        btAceptar = findViewById(R.id.btAceptar)

        //LLAMO AL MÉTODO
        btAceptar.setOnClickListener{enviarContraseña()}
    }

    private fun enviarContraseña() {

        if (!etContraseña.text.isEmpty()) {

            val password: String = etContraseña.getText().toString()
            if (password.equals("1234")){
                val intent = Intent(this, SegundoActivity::class.java)
                intent.putExtra(SegundoActivity.EXTRA, etContraseña.text.toString())
                startActivity(intent)
            } else{
                Toast.makeText(this, getString(R.string.contraseña_incorrecta), Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, getString(R.string.msj_contraseña), Toast.LENGTH_LONG).show()
        }

    }
}