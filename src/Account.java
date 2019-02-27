
public class Account {
	private int accountNumber = 0;
	private int accountType;
	private double funds = 2000.0;//默认里面刚开就有2000块
	private double cash = 0.0;//clear money
	private double cheque = 0.0;//un-clear money
	private boolean state = true;//默认未悬停
	private Customer customer;
	
	public Account(){
		accountNumber = accountNumber + 1;
	}
	public void setAccountType(int accountType){
		this.accountType = accountType;
	}
	
	public int getAccountType(){
		return accountType;
	}
	
	public void setCustomer(Customer customer){//设置对应的用户
		this.customer = customer;
	}
	
	public Customer getCustomer(){
		return customer;
	}
	
	public void depositClearFunds(double cash){//添加现金,存入funds
		this.cash += cash;
		funds += cash;
	}
	
	public double getCash(){
		return cash;
	}
	public void depositUnclearFunds(double cheque){//存入unclear钱，暂时放在cheque里
		this.cheque += cheque;
	}
	
	public void addUnclearToFunds(){
		this.funds += cheque;
	}
	public void withdrawFunds(double funds){//取钱
		this.funds -= funds;
	}
	
	public double getBalance(){//查询余额
		return funds;
	}
	
	public void setState(boolean state){
		this.state = state;
	}
	
	public boolean getState(){
		return this.state;
	}
	
	public double getUnclearFunds(){
		return cheque;
	}
	
	public void setUnclearFunds(double cheque){
		this.cheque = cheque;
	}
	
	public String toString(){
		return "1";
	}
}
