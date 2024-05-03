package br.com.francisco.model

import java.math.BigDecimal

data class Contrato(
    val cliente: Cliente,
    val valorTotalApolice : BigDecimal,
    val mensalidades : List<Mensalidade>,
    val idApolice : String,
    val meioPagamento : String
)
