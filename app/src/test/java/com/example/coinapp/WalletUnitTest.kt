package com.example.coinapp

import org.junit.Assert.assertEquals
import org.junit.Test

class WalletUnitTest {

    @Test
    @Throws(Exception::class)
    fun createWallet() {
        val wallet = Wallet(42.00)
        assertEquals(42.00, wallet.balance, 0.001)
    }

    @Test
    @Throws(java.lang.Exception::class)
    fun depositMoney() {
        val wallet = Wallet(0.00)
        wallet.deposit(10.00)
        assertEquals(10.00, wallet.balance, 0.001)
    }

    @Test
    @Throws(java.lang.Exception::class)
    fun withdrawMoney() {
        val wallet = Wallet(10.00)
        wallet.withdraw(10.00)
        assertEquals(0.00, wallet.balance, 0.001)
    }

}
