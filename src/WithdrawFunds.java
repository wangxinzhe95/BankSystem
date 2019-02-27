import java.util.ArrayList;

public class WithdrawFunds {
	public void withdrawFunds(int accountNumber, int PIN, double digital){
		OpenAccount a = new OpenAccount();
		ArrayList<Account> list = a.getList();
		
		if ((list.size())<accountNumber){
			System.out.println("此账户不存在");
		}
		else if ((list.get(accountNumber-1))==null){
			System.out.println("此账户已关闭");
		}
		else if ((list.get(accountNumber-1).getCustomer().getPIN()) != PIN){
			System.out.println("无法确定你是账户的主人");
		}
		else if (!(list.get(accountNumber-1).getState())){
			System.out.println("此账号被暂关了！");
		}
		else {

		int type = list.get(accountNumber-1).getAccountType();
		if (type == 1){
			SaverAccount account1 = (SaverAccount)(list.get(accountNumber-1));
			if (account1.getAppoint()){
				double balance = account1.getBalance();
				if (balance < digital){
					System.out.println("余额不足");
				}
				else{
					account1.withdrawFunds(digital);
					account1.setAppoint(false);
					System.out.println("取钱完成，现在账户内余额: " + a.getList().get(accountNumber-1).getBalance());
				}
			}
			else
				System.out.println("未预约不可以取钱！");
		}
		else if (type == 2){
			double balance = list.get(accountNumber-1).getBalance();
			if (balance < digital){
				System.out.println("余额不足");
			}
			else{
				list.get(accountNumber-1).withdrawFunds(digital);
				System.out.println("取钱完成，现在账户内余额: " + a.getList().get(accountNumber-1).getBalance());
			}
		}
		else if (type == 3){
			CurrentAccount account2 = (CurrentAccount)(list.get(accountNumber-1));
			double overdraftLimit = account2.getOverdraftLimit();
			if ((digital-account2.getBalance()) > overdraftLimit){
				System.out.println("超过贷款上限");
			}
			else{
				account2.withdrawFunds(digital);
				System.out.println("取钱完成，现在账户内余额: " + a.getList().get(accountNumber-1).getBalance());
			}
		}
	  }
	}
}
