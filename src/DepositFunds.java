import java.util.*;

public class DepositFunds {
	public void depositFunds(int accountNumber, int type, double digital){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		double cc = digital%100.0;
		if (list.size() < accountNumber){
			System.out.println("此账户不存在！");			
		}
		else if ((list.get(accountNumber-1))==null){
			System.out.println("此账户已关闭");
		}
		else if (!(list.get(accountNumber-1).getState())){
			System.out.println("此账号被暂关了！");
		}
		else if (cc!=0){
			System.out.println("不是100的整数倍，不能取!");
		}
		else if (type == 1){//存入clear即现金
			list.get(accountNumber-1).depositClearFunds(digital);
			System.out.println("存钱成功！余额： " + a.getList().get(accountNumber-1).getBalance());
		}
		else if (type == 2){//存入un-clear即支票
			list.get(accountNumber-1).depositUnclearFunds(digital);
			System.out.println("存钱成功！余额： " + a.getList().get(accountNumber-1).getBalance());
		}
		
	}
}
