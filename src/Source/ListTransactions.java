package Source;

import java.util.ArrayList;

public class ListTransactions {
    private ArrayList<Transaction> transactionList;
    
    public ListTransactions(){
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
    
    public void deleteTransaction(int index){
        transactionList.remove(index);
    }

}
