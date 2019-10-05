package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex)
    }
    fun gravityForceExClick(v: View){
        startActivity(Intent(applicationContext, ForceExActivity::class.java))
    }

    fun pascalExClick(v: View){
        TODO("Add this function to onClick to button goBTPascal")
    }
}
