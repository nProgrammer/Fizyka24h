package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TableOfContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_of_content)
    }

    fun gravityForceClick(v: View){
        startActivity(Intent(applicationContext, ForceActivity::class.java))
    }
}
