package mx.tec.foodykrave

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mx.tec.foodykrave.data.User

class Register : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Registro"
        name = findViewById(R.id.usernameRegister)
        email = findViewById(R.id.emailRegister)
        password = findViewById(R.id.passwordRegister)
    }

    fun signUp(v: View) {
        if (!User.isEmailValid(email.text.toString())) {
            Toast.makeText(this, "El correo no es valido", Toast.LENGTH_SHORT).show()
        } else if (!User.isNameValid(name.text.toString())) {
            Toast.makeText(this, "El nombre de usuario no es valido", Toast.LENGTH_SHORT).show()
        } else if (!User.isPasswordValid(password.text.toString())) {
            Toast.makeText(this, "La contraseña no es valida", Toast.LENGTH_SHORT).show()
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