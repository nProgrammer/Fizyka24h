package pl.norbertwagner.nprogrammer.fizyka24h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val dbHelper = DataBaseHelper(applicationContext)
        val db = dbHelper.writableDatabase
        recycler_view.layoutManager = GridLayoutManager(applicationContext, 1)
        recycler_view.adapter = ItemViewAdapter(applicationContext, db)
    }
}
