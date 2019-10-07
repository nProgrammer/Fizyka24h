package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pressure_ex.*

class PressureExActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var score = 0
        val unit = "Ciśnienie"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pressure_ex)

        checkBTPressure.setOnClickListener{
            if(ex1BPressure.isChecked){
                score++
            }
            if(ex2BPressure.isChecked){
                score++
            }
            if(ex2CPressure.isChecked){
                score++
            }
            score = score * 100 / 3
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
