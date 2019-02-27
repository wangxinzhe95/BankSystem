import java.util.*;

public class AppointSaverAccount {
	public void appointSaverAccount(int accountNumber, int PIN){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		if ((list.size()<accountNumber)){
			System.out.println("此账户不存在!");
		}
		else if ((list.get(accountNumber-1).getCustomer().getPIN()) != PIN){
			System.out.println("无法确定你是账户的主人");
		}
		else if ((list.get(accountNumber-1).getAccountType())!=1){
			System.out.println("不是SaverAccount不需要预约!");
		}
		else{
			SaverAccount account1 = (SaverAccount)(list.get(accountNumber-1));
			account1.setAppoint(true);
			System.out.println("预约成功！");
		}
	}
}
