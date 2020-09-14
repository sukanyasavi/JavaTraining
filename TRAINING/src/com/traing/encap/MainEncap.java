package com.traing.encap;

public class MainEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap e=new Encap();
		e.setName("abc");
		e.setId(1);
		e.setAcc_no(12_33_44);
        e.setMob_no(923476234);	
        System.out.println(e.getName()+" "+e.getId()+" "+e.getAcc_no()+" "+e.getMob_no());
	}

}
