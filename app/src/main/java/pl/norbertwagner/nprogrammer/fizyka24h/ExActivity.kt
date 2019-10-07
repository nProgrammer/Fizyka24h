package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex)
    }
    fun gravityForceExClick(v: View){
        startActivity(Intent(applicationContext, ForceExActivity::class.java))
    }

    fun pressureExClick(v: View){
        Toast.makeText(applicationContext, "Wkrótce dostępne", Toast.LENGTH_SHORT).show()
    }
}