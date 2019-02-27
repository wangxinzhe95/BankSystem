
public class SaverAccount extends Account {
	private boolean appoint = false;
	public SaverAccount(){
		this.setAccountType(1);
	}
	
	public void setAppoint(boolean a){
		this.appoint = a;
	}
	
	public boolean getAppoint(){
		return appoint;
	}
}
