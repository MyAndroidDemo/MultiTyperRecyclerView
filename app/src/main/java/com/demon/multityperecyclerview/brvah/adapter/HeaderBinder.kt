package com.demon.multityperecyclerview.brvah.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.chad.library.adapter.base.binder.BaseItemBinder
import com.demon.multityperecyclerview.R
import com.demon.multityperecyclerview.adapter.ViewHolder
import com.demon.multityperecyclerview.data.Header

/**
 * @author DeMon
 * Created on 2020/4/13.
 * E-mail 757454343@qq.com
 * Desc:
 */
class HeaderBinder : BaseItemBinder<Header, ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false))
    }

    override fun convert(holder: ViewHolder, data: Header) {

    }
}