import java.util.*;

public class BankSystem {
	public BankSystem(int flag){
		OpenAccount a = new OpenAccount();
		if (flag == 1){//开户
		System.out.println("请携带2000现金作为最低额度，才能开通账户！");
		System.out.printf("Please input your name, address, birth day (yyyy-MM-dd) " + "\n" + "and account type number(1 is SaverAccount, 2 is JuniorAccount, 3 is CurrentAccount\n");
		Scanner input= new Scanner(System.in);
		String[] s = new String[4];
		for (int i = 0; i < 4; i++){
			s[i] = input.next();
		}
		int type = Integer.parseInt(s[3]);
		a.openAccount(s[0], s[1], s[2], type);
	   }
		else if (flag == 2){//存钱
			DepositFunds b = new DepositFunds();
			System.out.println("Please input account number, deposit mode(1 is cash, 2 is cheque), and funds");
			Scanner input = new Scanner(System.in);
			String[] s = new String[3];
			for (int i = 0; i < 3; i++){
				s[i] = input.next();
			}
			int accountNumber = Integer.parseInt(s[0]);
			int type = Integer.parseInt(s[1]);
			double funds = Double.parseDouble(s[2]);
			b.depositFunds(accountNumber, type, funds);
		}
		else if (flag == 3){//取钱
			WithdrawFunds c = new WithdrawFunds();
			System.out.println("Please input account number, PIN to check, and funds");
			Scanner input = new Scanner(System.in);
			String[] s = new String[3];
			for (int i = 0; i < 3; i++){
				s[i] = input.next();
			}
			int accountNumber = Integer.parseInt(s[0]);
			int PIN = Integer.parseInt(s[1]);
			double funds = Double.parseDouble(s[2]);
			c.withdrawFunds(accountNumber, PIN, funds);		
		}
		else if (flag == 4){//关账户
			CloseAccount d = new CloseAccount();
			System.out.println("Please input account number, PIN to check to close the account");
			Scanner input = new Scanner(System.in);
			String[] s = new String[2];
			for (int i = 0; i < 2; i++){
				s[i] = input.next();
			}
			int accountNumber = Integer.parseInt(s[0]);
			int PIN = Integer.parseInt(s[1]);
			d.closeAccount(accountNumber, PIN);
		}
		else if (flag == 5){//把unclearFunds到账
			ClearFundsSystem uuu = new ClearFundsSystem();
			System.out.println("Please input account number that ready to clear");
			Scanner input = new Scanner(System.in);
			int accountNumber = input.nextInt();
			uuu.clearFunds(accountNumber);
		}
		else if (flag == 6){
			SuspendAccount f = new SuspendAccount();
			System.out.println("Please input account number to suspend account");
			Scanner input = new Scanner(System.in);
			String s = input.next();
			int accountNumber = Integer.parseInt(s);
			f.suspendAccount(accountNumber);
		}
		else if (flag == 7){
			ReinstateAccount ttt = new ReinstateAccount();
			System.out.println("Please input account number to reinstate account");
			Scanner input = new Scanner(System.in);
			String s = input.next();
			int accountNumber = Integer.parseInt(s);
			ttt.reinstateAccount(accountNumber);
		}
		else if (flag == 8){
			AppointSaverAccount appoint = new AppointSaverAccount();
			System.out.println("Please input account number, PIN to check to appoint the account");
			Scanner input = new Scanner(System.in);
			String[] s = new String[2];
			for (int i = 0; i < 2; i++){
				s[i] = input.next();
			}
			int accountNumber = Integer.parseInt(s[0]);
			int PIN = Integer.parseInt(s[1]);
			appoint.appointSaverAccount(accountNumber, PIN);
		}
	}
}
