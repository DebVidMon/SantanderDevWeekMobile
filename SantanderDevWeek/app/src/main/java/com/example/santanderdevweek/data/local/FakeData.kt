package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Débora")
        val cartao = Cartao("1234")
        return Conta(
            "01063373-6",
            "0207",
            "R$ 2.450,60",
            "R$ 3.120,40",
            cliente,
            cartao
        );
    }
}