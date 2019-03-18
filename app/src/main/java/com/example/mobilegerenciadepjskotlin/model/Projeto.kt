package com.example.mobilegerenciadepjskotlin.model

class Projeto(val nome : String,
              val id: Long,
              val dataInicio: String,
              val dataFim: String,
              val horas: Int,
              val responsavelBRQ: String,
              val responsavelCliente : String,
              val descrição: String,
              val tecnologia: List<Tecnologia>,
              val status: Status,
              val usuarioCriador: Usuario)