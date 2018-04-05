package problem2;

public class Transaction {

	public int id;
	public String email;
	public String phone;
	public String card;
	
	public Transaction(int id, String email, String phone, String card){
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.card = card;
		Main.allTransaction.add(this);
	}
	
	public void mergeHelper(){
		//mencari customer yang melakukan transaksi
		mergeChecker(searchingByX(this.email),searchingByX(this.phone),searchingByX(this.card));
	}
	public void mergeChecker(Customer x, Customer y, Customer z){
		if(x!= null && y!= null && x.customerId != y.customerId ){
			x.mergeCustomer(x, y);
		}
		if(x!= null && z!= null && x.customerId != z.customerId){
			x.mergeCustomer(x, z);
		}
	}
	
	public Customer searchingByX(String x){
		for(Customer customer: Customer.allCustomer){
			for(String cust: customer.emails){
				if(x.equalsIgnoreCase(cust))
					return customer;
			}
		};
		return null;
	}
	
}
