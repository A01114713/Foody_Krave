package mx.tec.foodykrave

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mx.tec.foodykrave.data.User

class Login : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Log In"
        email = findViewById(R.id.emailLogin)
        password = findViewById(R.id.passwordLogin)
    }

    fun login(v: View) {
        if (!User.isEmailValid(email.text.toString())) {
            Toast.makeText(this, "El correo no es valido", Toast.LENGTH_SHORT).show()
        } else {
            login()
        }
    }

    private fun login() {
        val i = Intent(this, Inicio::class.java).apply {
            putExtra("id", 2)
        }
        startActivity(i)
        finish()
    }
}