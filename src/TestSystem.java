import java.util.*;

public class TestSystem {
	public TestSystem(){
		int x;
	while (true){
		while(true){
			System.out.println("1.Open Account 2.Deposit Funds 3.Withdraw Funds 4.Close Account"+"\n"+ "5.Clear un-clear Funds 6.Suspend Account 7.Reinstate Account 8.Appointment to Saver Account");
			Scanner input = new Scanner(System.in);
			String s = input.next();
			try {
				x = Integer.parseInt(s);
			}catch(Exception e){
				x = 0;
			}
			if (x==1||x==2||x==3||x==4||x==5||x==6||x==7||x==8){
				break;
			}
			System.out.println("输入错误!请重新输入！");
		}
		BankSystem a = new BankSystem(x);
	  }
	}
}
