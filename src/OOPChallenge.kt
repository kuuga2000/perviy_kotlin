package com.example.main

fun main() {
    val alexAccount = Account("Alex")
    alexAccount.deposit(2000)
    alexAccount.withdraw(1100)
    alexAccount.deposit(-20)
    alexAccount.withdraw(-100)
    val balance = alexAccount.calculateBalance()
    println("Balance is $balance")

}

class Account(val accountName: String) {
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance+=amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("cannot deposite negative sums")
        }
    }

    fun withdraw(withdrawal: Int) {
        if(-withdrawal < 0) {
            transactions.add(-withdrawal)
            this.balance+=-withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance}")
        } else {
            println("cannot withdraw negative sums")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for(transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}