package com.example.recycleview2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview2.databinding.BookRvListBinding

class BookAdapter(val Booklist :List<Book>):RecyclerView.Adapter<BookAdapter.bookViewHolder>() {

    lateinit var binding : BookRvListBinding

    class bookViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bookViewHolder {
        binding = BookRvListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return bookViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: bookViewHolder, position: Int) {
        binding.bookName.text=Booklist.get(position).name
        binding.bookWritter.text=Booklist.get(position).writtername
        binding.bookPrice.text=Booklist.get(position).price.toString()
        binding.bookRatting.text=Booklist.get(position).Ratting.toString()
    }

    override fun getItemCount(): Int =Booklist.size
}