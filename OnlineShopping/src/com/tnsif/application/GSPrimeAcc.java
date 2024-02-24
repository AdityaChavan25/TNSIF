package com.tnsif.application;
import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float Charges=500.0f;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges) {
		System.out.println("charges are: " + charges);
		System.out.println("prime charges: " + (charges - 500.0f));
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
