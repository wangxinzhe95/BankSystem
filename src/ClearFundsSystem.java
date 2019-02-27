import java.util.*;

public class ClearFundsSystem {
	public void clearFunds(int accountNumber){
	OpenAccount a = new OpenAccount();
	ArrayList<Account> list = a.getList();
	if ((list.size()) < accountNumber){
		System.out.println("此账号不存在!");
	}
	else if (!(list.get(accountNumber-1).getState())){
		System.out.println("此账号被暂关了！");
	}
	else{
	list.get(accountNumber-1).addUnclearToFunds();
	list.get(accountNumber-1).setUnclearFunds(0);
	System.out.println("unclear资金已到账！");
	}
  }
}
