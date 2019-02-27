import java.util.ArrayList;

public class ReinstateAccount {
	public void reinstateAccount(int accountNumber){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		if ((list.size()<accountNumber)){
			System.out.println("此账户不存在!");
		}
		else{
			list.get(accountNumber-1).setState(true);
			System.out.println("恢复成功！");
		}
	}	
}
