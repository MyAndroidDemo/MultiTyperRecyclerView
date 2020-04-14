package com.demon.multityperecyclerview.merge.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demon.multityperecyclerview.R
import com.demon.multityperecyclerview.adapter.ViewHolder
import com.demon.multityperecyclerview.data.Person
import com.demon.multityperecyclerview.data.Student
import kotlinx.android.synthetic.main.item_student.*
import kotlinx.android.synthetic.main.item_teacher.*

/**
 * @author DeMon
 * Created on 2020/4/13.
 * E-mail 757454343@qq.com
 * Desc:
 */
class StudentAdapter(private val datas: List<Person>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
    )

    override fun getItemCount(): Int = datas.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvStudent.text = datas[position].name
    }
}