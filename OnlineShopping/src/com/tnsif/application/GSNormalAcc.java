package com.tnsif.application;
import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float deliveryCharges) {
		System.out.println("Your product charges are: " + getCharges());
		System.out.println("Your Delivery charges are: " + deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


}
