package org.roadtocode.myrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = userList[position].name
        holder.tvMobile.text = userList[position].mobile
        if(userList[position].img==1)
        {
            holder.ivUser.setImageResource(R.drawable.businessman)
        }
        else if(userList[position].img==2)
        {
            holder.ivUser.setImageResource(R.drawable.programmer)
        }
        else
        {
            holder.ivUser.setImageResource(R.drawable.woman)
        }

        holder.ivUser.setOnClickListener{
            val intent = Intent(holder.ivUser.context, DetailedView::class.java)
            intent.putExtra("user_name", userList[position].name)
            intent.putExtra("mobile_number",userList[position].mobile)
            holder.ivUser.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val ivUser: ImageView =itemView.findViewById(R.id.ivUser)
        val tvName: TextView = itemView.findViewById(R.id.tvName)
        val tvMobile: TextView = itemView.findViewById(R.id.tvMobile)
    }

}