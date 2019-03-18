package com.example.mobilegerenciadepjskotlin.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobilegerenciadepjskotlin.View.ProjetoActivity
import com.example.mobilegerenciadepjskotlin.R
import kotlinx.android.synthetic.main.activity_tec_item.view.*

class TecnologiaAdapter: RecyclerView.Adapter<TecnologiaViewHolder>(){

    //seta o nome e descriações das tecnologias
    val tecnologias = listOf("Java", "Androide", "Html", "Kotlin")
    val descricoes = listOf("Web", "Mobile", "Web", "Mobile")

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TecnologiaViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellFor = layoutInflater.inflate(R.layout.activity_tec_item, parent, false  )
        return TecnologiaViewHolder(cellFor)
    }

    override fun onBindViewHolder(holder: TecnologiaViewHolder?, position: Int) {
            //pega o nome das tecnologias e seta no layout de itens
            val tec = tecnologias.get(position)
            holder?.view?.textView_nome?.text = tec

            //seta a descrição das listas que eu declarei la em cima no item_layout
            val des = descricoes.get(position)
            holder?.view?.textView_descricao?.text = des
    }

    override fun getItemCount(): Int {
        return tecnologias.size
    }
}

class TecnologiaViewHolder(val view: View): RecyclerView.ViewHolder(view){
    init {
        //fazer um item da Recycle View Ser clicável
        view.setOnClickListener {
            val intent = Intent(view.context, ProjetoActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}








