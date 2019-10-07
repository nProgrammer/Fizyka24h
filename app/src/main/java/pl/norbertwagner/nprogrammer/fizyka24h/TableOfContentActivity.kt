package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TableOfContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_of_content)
    }

    fun gravityForceClick(v: View){
        startActivity(Intent(applicationContext, ForceActivity::class.java))
    }

    fun pressureClick(v: View){
        startActivity(Intent(applicationContext, PressureActivity::class.java))
    }
}
