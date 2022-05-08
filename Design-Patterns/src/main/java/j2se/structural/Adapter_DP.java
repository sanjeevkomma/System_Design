package j2se.structural;

import java.io.BufferedReader;  
import java.io.InputStreamReader;  

// Client class
public class Adapter_DP {

	public static void main(String[] args) {

		CreditCard targetInterface = new BankCustomer();  
		  
		targetInterface.giveBankDetails();  
		  
		System.out.print(targetInterface.getCreditCard());  
	}

}

// Target Interface:
interface CreditCard {  

	public void giveBankDetails();  

	public String getCreditCard();  
}

// Adaptee class
class BankDetails {  

	private String bankName;  

	private String accHolderName;  

	private Long accNumber;  



	public String getBankName() {  

		return bankName;  
	}  

	public void setBankName(String bankName) {  

		this.bankName = bankName;  
	}  

	public String getAccHolderName() {  

		return accHolderName;  
	}  

	public void setAccHolderName(String accHolderName) {  

		this.accHolderName = accHolderName;  
	}  

	public Long getAccNumber() {  

		return accNumber;  
	}  

	public void setAccNumber(Long accNumber) {  

		this.accNumber = accNumber;  
	}  
}

// Adapter class

class BankCustomer extends BankDetails implements CreditCard { 

	public void giveBankDetails() { 

		try {  

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

			System.out.print("Enter the account holder name :");  

			String customername = br.readLine();  

			System.out.print("Enter the account number:");  

			Long accno= Long.parseLong(br.readLine());  

			System.out.print("Enter the bank name :");  

			String bankname = br.readLine();  

			setAccHolderName(customername);  

			setAccNumber(accno);  

			setBankName(bankname);  

		} catch(Exception e) {  

			e.printStackTrace();  
		}  
	}  

	public String getCreditCard() {  

		Long accno = getAccNumber();  

		String accholdername = getAccHolderName();  

		String bname = getBankName();  

		return ("The Account number "+accno+" of "+accholdername+" in "+bname+ " bank is valid and authenticated for issuing the credit card. ");  

	}  

}
