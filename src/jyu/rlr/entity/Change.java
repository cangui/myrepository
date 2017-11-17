package jyu.rlr.entity;

/**
 * 
 * @author admin
 *
 */
public class Change {
	private long id;
	private double balance;//余额
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
