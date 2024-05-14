package org.bank;

public class AxisBank extends BankInfo {
private void bankName(String name) {
	System.out.println("Bank Name:"+name+"\n");
	super.deposit(234567l);
	this.deposit(456789l);
}
@Override
public void saving(long saving) {
	System.out.println("Saving Amount1: "+saving);
}
@Override
	public void fixed(int fixed) {
		System.out.println("Fixed Amount2: "+fixed);
	}
@Override
	public void deposit(long deposit) {
		System.out.println("Deposit amount2: "+deposit+"\n");
	}
public static void main(String[] args) {
	AxisBank obj = new AxisBank();
	obj.bankName("AxixBAnk");
	
}
}
