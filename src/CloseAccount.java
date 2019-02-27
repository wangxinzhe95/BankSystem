import java.util.ArrayList;

public class CloseAccount {
	public void closeAccount(int accountNumber, int PIN){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		if ((list.size()<accountNumber)){
			System.out.println("此账户不存在!");
		}
		else if ((list.get(accountNumber-1).getCustomer().getPIN()) != PIN){
			System.out.println("无法确定你是账户的主人");
		}
		else if ((list.get(accountNumber-1).getBalance())!=0){
			System.out.println("账户尚有余额，无法关户");
		}
		else if ((list.get(accountNumber-1).getUnclearFunds())!=0){
			System.out.println("账户尚有未到账的资金，无法关户");
		}
		else {
			list.set(accountNumber-1, null);	
			System.out.println("关户成功！");
		}
	}
}
