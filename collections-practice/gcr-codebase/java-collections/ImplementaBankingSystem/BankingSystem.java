package collections_practice.gcr_codebase.java_collections.ImplementaBankingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

class BankManager{
	HashMap<Integer, Double> accounts = new HashMap<>();
	Queue<Integer> withdrawalQueue = new LinkedList<>();
	
	public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }
	
	public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found ");
        }
    }
	
	public void processWithdrawals(double amount) {
		while (!withdrawalQueue.isEmpty()) {
			int accNo = withdrawalQueue.poll();
			double balance = accounts.get(accNo);
			if(balance>=amount) {
				accounts.put(accNo, balance-amount);
				System.out.println("Withdrawal successful for Account "+accNo);
			}
			else {
				System.out.println("Insufficient balance for Account ");
			}
		}
	}
	
	public void displayCustomersSortedByBalance() {
		TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();
		for (int accNo : accounts.keySet()) {
			double balance = accounts.get(accNo);
			if (!sortedMap.containsKey(balance)) {
                sortedMap.put(balance, new ArrayList<>());
            }
            sortedMap.get(balance).add(accNo);
		}
		
		System.out.println("Customers Sorted By Balance:");
        for (Double balance : sortedMap.keySet()) {
            for (Integer accNo : sortedMap.get(balance)) {
                System.out.println("Account " + accNo + " -> " + balance);
            }
        }
	}
}
public class BankingSystem {
	public static void main(String[] args) {
		BankManager bank = new BankManager();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);
        bank.addAccount(104, 3000);

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(105); // Invalid account

        bank.processWithdrawals(2000);
        bank.displayCustomersSortedByBalance();
	}
}
