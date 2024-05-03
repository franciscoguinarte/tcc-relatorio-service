package br.com.francisco.model

import java.math.BigDecimal

data class Cliente(

    val id : Long,
    val cpf : String,
    val nome : String,
    val endereco : String,
    val contato: String,
    val placaVeiculo : String,
    val modeloVeiculo: String,
    val valorVeiculo : BigDecimal,
    val anoVeiculo : Long
)