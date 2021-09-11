package mx.tec.foodykrave

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
    }

    fun toLogin(v: View) {
        val i = Intent(this, Login::class.java).apply {
            putExtra("id", 1)
        }
        startActivity(i)
    }

    fun toRegister(v: View) {
        val i = Intent(this, Register::class.java).apply {
            putExtra("id", 0)
        }
        startActivity(i)
    }
}