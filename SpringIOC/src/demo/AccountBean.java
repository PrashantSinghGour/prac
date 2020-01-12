package demo;

public class AccountBean {
	
	private Account account;
	
	public AccountBean()
	{
		System.out.println("In Bean Class Constructor");
	}
	
	public void setAccount(Account account)
	{
		this.account=account;
	}
	
	public void makeDeposit()
	{
		account.deposite();
	}

}
