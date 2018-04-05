package problem2;

import java.util.ArrayList;

public class Customer {
	static ArrayList<Customer> allCustomer;
	static int idGenerator = 0; //id generator
	public int customerId;
	public ArrayList<Integer> transactionId;
	public ArrayList<String> emails;
	public ArrayList<String> phones;
	public ArrayList<String> cards;
	
	
	Customer(int id, String email, String phone, String card){
		this.transactionId.add(id);
		this.emails.add(email);
		this.phones.add(phone);
		this.cards.add(card);
		idGenerator++;
		setCustomerId(idGenerator); //start dari 1
	}
	public void setCustomerId(int id){
		customerId = id;
	}
	public int getCustomerId(){
		return customerId;
	}
	public void addEmail(ArrayList<String> emails){
		for(String email: emails){
			this.emails.add(email);
		}
		
	}
	public void addPhone(ArrayList<String> phones){
		for(String phone: phones){
			this.phones.add(phone);
		}
	}
	public void addCard(ArrayList<String> cards){
		for(String card: cards){
			this.cards.add(card);
		}
	}
	public void addTransaction(ArrayList<Integer> trans){
		for(int tr: trans){
			this.transactionId.add(tr);
		}
	}
	
	public void mergeCustomer(Customer x, Customer y){
		x.addEmail(y.emails);
		x.addPhone(y.phones);
		y.addCard(y.cards);
		allCustomer.remove(y);
	}
	@Override
	public String toString(){
		return "Customer id: "+customerId+" transaction: "+transactionId.toString()+" emails: "+emails.toString()+" phones: "+phones.toString()+" cards: "+cards.toString() ;
	}
}
