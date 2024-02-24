package com.tnsif.client;

import com.tnsif.framework.ShopFactory;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.NormalAcc;
import com.tnsif.application.GSShopFactory;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.application.GSNormalAcc;

public class client {
	public static void main(String[] args) {
		ShopFactory sf=new GSShopFactory();
		
		PrimeAcc pa=new GSPrimeAcc(345432344, "Apurva", 4000, false);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		
		NormalAcc na = new GSNormalAcc(543452344, "Ritesh", 50000, 10000);
		na.bookProduct(na.getDeliveryCharges());
		na.toString();
	}

}
