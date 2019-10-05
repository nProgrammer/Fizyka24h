package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_force_ex.*

class ForceExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var score = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_force_ex)

        checkBT.setOnClickListener{
            if(ex1A.isChecked){
                score++
                Log.d("Answers", score.toString())
            }
            if(ex2C.isChecked){
                score++
                Log.d("Answers", score.toString())
            }
            Toast.makeText(applicationContext, "Wynik został zapisany... Prznoszenie do strony głównej", Toast.LENGTH_SHORT).show()
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}
