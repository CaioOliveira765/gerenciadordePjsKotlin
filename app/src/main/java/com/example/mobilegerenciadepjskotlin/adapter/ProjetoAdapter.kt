package com.example.mobilegerenciadepjskotlin.adapter

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobilegerenciadepjskotlin.R
import com.example.mobilegerenciadepjskotlin.View.ProjetoDetalhadoActivity
import kotlinx.android.synthetic.main.activity_card_projetos.view.*

class ProjetoAdapter : RecyclerView.Adapter<ProjetoViewHolder>() {

    val nomes = listOf("Java1", "java2", "java3")
    val responsaveis = listOf("Caio", "Mauricio", "Pacheco")
    val descri = listOf("fbsidw", "FGYUSBINWCS", "FBSYVAIUCASNC")

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProjetoViewHolder? {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellFor = layoutInflater.inflate(R.layout.activity_card_projetos, parent, false)
        return ProjetoViewHolder(cellFor)
    }
    override fun getItemCount(): Int {
        return nomes.size
    }
    override fun onBindViewHolder(holder: ProjetoViewHolder?, position: Int) {
       val nomesCard = nomes.get(position)
       holder?.view?.card_nome?.text = nomesCard

        val resp = responsaveis.get(position)
        holder?.view?.card_responsavel?.text = resp

        val desc = descri.get(position)
        holder?.view?.card_descricao?.text = desc
    }
}
    class ProjetoViewHolder(val view : View): RecyclerView.ViewHolder(view){
        init {
            view.setOnClickListener {
                val intent = Intent(view.context, ProjetoDetalhadoActivity::class.java)
                view.context.startActivity(intent)
        }
    }
}