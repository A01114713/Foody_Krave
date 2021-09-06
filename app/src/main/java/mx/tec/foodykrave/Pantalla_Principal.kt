package mx.tec.foodykrave

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Pantalla_Principal : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var editText : EditText
    lateinit var editText : EditText
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)
    }
}