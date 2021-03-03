package org.company;

public class CompanyInfo {

	private void companyName() {
	System.out.println("CompanyName");
	}
	private void companyId() {
		System.out.println("CompanyId");
	}
	private void companyAddress() {
	System.out.println("CompanyAddress");
	}
	public static void main(String[] args) {
		CompanyInfo companydetails=new CompanyInfo();
		companydetails.companyName();
		companydetails.companyId();
		companydetails.companyAddress();
	}

}
