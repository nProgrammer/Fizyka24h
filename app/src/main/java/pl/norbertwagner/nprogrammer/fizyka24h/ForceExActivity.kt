package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_force_ex.*

class ForceExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var score = 0 // score - var that have info about score
        val unit = "Siła ciężkości" // unit - value that have info about subject name

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_force_ex)

        checkBTForce.setOnClickListener{
            if(ex1AForce.isChecked){
                score++
            }
            if(ex2CForce.isChecked){
                score++
            }
            score = score * 100 / 2
            val finalScore = "$score%"

            val dbHelper = DataBaseHelper(applicationContext)
            val db = dbHelper.writableDatabase
            val value = ContentValues()
            value.put("unit", unit)
            value.put("score", finalScore)
            db.insertOrThrow(TableInfo.TABLE_NAME, null, value)

            Toast.makeText(applicationContext, "Wynik został zapisany... Prznoszenie do strony głównej", Toast.LENGTH_SHORT).show()
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}
