import java.util.ArrayList;

public class SuspendAccount {
	public void suspendAccount(int accountNumber){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		if ((list.size()<accountNumber)){
			System.out.println("此账户不存在!");
		}
		else{
			list.get(accountNumber-1).setState(false);
			System.out.println("暂关成功！");
		}
	}	
}
