package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Placa Samsung",
                descricao = " Placa Principal Toshiba lED 32l2800 NO1.30.1.DM100104ARR DM1001 ",
                valor = BigDecimal("19.11")
            )
        )
    }

}