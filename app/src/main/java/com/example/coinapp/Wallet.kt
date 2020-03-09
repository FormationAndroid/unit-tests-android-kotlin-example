package com.example.coinapp

data class Wallet(var balance: Double){

    fun deposit(amount: Double){
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }

}

