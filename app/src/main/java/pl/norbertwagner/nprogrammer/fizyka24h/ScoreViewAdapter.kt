package pl.norbertwagner.nprogrammer.fizyka24h

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.score_view.view.*
//SCORE VIEW ADAPTER
class ItemViewAdapter(val context: Context, val db: SQLiteDatabase): RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val scoreView_score = layoutInflater.inflate(R.layout.score_view, parent, false)
        return MyViewHolder(scoreView_score)
    }

    override fun getItemCount(): Int {
        val cursor = db.query(TableInfo.TABLE_NAME, null,
            null, null, null,null,null)
        val numberOfItems = cursor.count
        cursor.close()
        return numberOfItems
    }

    @SuppressLint("Recycle")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val scoreView = holder.view.cardView
        val unit = holder.view.unitView
        val score = holder.view.scoreView

        val cursor = db.query(TableInfo.TABLE_NAME, null,
            BaseColumns._ID + "=?", arrayOf(holder.adapterPosition.plus(1).toString()),
            null,null,null)

        if(cursor.moveToFirst()){
            if(!cursor.getString(2).isNullOrEmpty()){
                unit.text = cursor.getString(1)
                score.text = cursor.getString(2)
            }
        }
    }
}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view)