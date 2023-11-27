package com.example.retrofittas.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittas.data.User
import com.example.retrofittas.databinding.UserCardBinding
import com.squareup.picasso.Picasso
import java.util.Collections.emptyList


class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private var dataList: List<User> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = UserCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setProducts(products: List<User>) {
        dataList = products
        notifyDataSetChanged()
    }

    class ViewHolder(private val binding: UserCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            Picasso.get().load(user.photoUrl).into(binding.image)
            binding.id.text = user.id.toString()
            binding.name.text = user.name
            binding.email.text = user.email
            binding.phone.text = user.phone

        }
    }
}