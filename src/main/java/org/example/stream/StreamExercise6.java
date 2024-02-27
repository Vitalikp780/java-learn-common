package org.example.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
Data Analysis:
You have a list of Transaction objects containing attributes such as transaction ID, amount, and date.
Write a method that takes this list as input and
returns the total sum of transactions that occurred in January 2024.
*/

class Transaction {
    private int transactionId;
    private double amount;
    private LocalDate date;

    public Transaction(int transactionId, double amount, LocalDate date) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
    // Constructor, getters, and setters
}

public class StreamExercise6 {
    public static void main(String[] args) {
        // Create a list to store Transaction objects
        List<Transaction> transactions = new ArrayList<>();

        // Add some Transaction objects to the list
        transactions.add(new Transaction(1, 100.50, LocalDate.of(2022, 1, 5)));
        transactions.add(new Transaction(2, 200.75, LocalDate.of(2023, 1, 10)));
        transactions.add(new Transaction(3, 50.25, LocalDate.of(2024, 2, 15)));
        transactions.add(new Transaction(4, 300.30, LocalDate.of(2025, 2, 20)));
        transactions.add(new Transaction(5, 150.90, LocalDate.of(2024, 3, 25)));

        List<Transaction> transactions2024 = transactions.stream()
                .filter(transaction -> transaction.getDate().isAfter(LocalDate.of(2024, 1, 1)))
                .toList();


        System.out.println(transactions2024.size());
    }
}
