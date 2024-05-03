package br.com.francisco.repository

import br.com.francisco.model.Contrato
import com.mongodb.client.MongoClient
import com.mongodb.client.result.InsertOneResult
import jakarta.inject.Singleton

@Singleton
class ContratoRepository (
    private val mongoClient: MongoClient
){
    fun create(contrato: Contrato) : InsertOneResult{
        return getConnection().insertOne(contrato)
    }
    fun getConnection() = mongoClient
        .getDatabase("contratos")
        .getCollection("contrato", Contrato::class.java)
}