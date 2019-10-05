package pl.norbertwagner.nprogrammer.fizyka24h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun theoryBTClick(v: View){
        startActivity(Intent(applicationContext, TableOfContentActivity::class.java))
    }
    fun exBTClick(v: View){
        startActivity(Intent(applicationContext, ExActivity::class.java))
    }
    fun scoreBTClick(v: View){
        startActivity(Intent(applicationContext, ScoreActivity::class.java))
    }
}
