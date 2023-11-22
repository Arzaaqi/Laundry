/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;

/**
 *
 * @author kimi reza
 */
public class ListTransaction {

    private ArrayList<Transaction> transactionList;

    public ListTransaction() {
        transactionList = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public Transaction getTransaction(int index) {
        return transactionList.get(index);
    }

    public int getTransactionCount() {
        return transactionList.size();
    }

    public void deleteTransaction(int index) {
        transactionList.remove(index);
    }
}
