
public class CurrentAccount extends Account {
	private double overdraftLimit = 20000.0;
	public CurrentAccount(){
			this.setAccountType(3);
	}
	
	public void setOverdraftLimit(double overdraftLimit){
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit(){
		return overdraftLimit;
	}
}
