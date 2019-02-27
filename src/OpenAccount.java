import java.util.ArrayList;

public class OpenAccount {
	public static ArrayList<Account> list = new ArrayList<Account>();
	public static int number = 0;
	public void openAccount(String name, String address, String birth, int accountType){
		Customer customer = new Customer(name, address, birth);
		customer.setAccountType(accountType);
		CreditAgency agency = new CreditAgency();
		if((agency.checkCredit(name)) == false){
			System.out.println("这个名字进黑名单了！");
			System.exit(1);
		}
		
		if (accountType == 1){
			SaverAccount account = new SaverAccount();
			account.setCustomer(customer);
			list.add(account);
			number++;
			System.out.println("开通成功！Account number is "+ number +", "+ customer);
		}
		else if (accountType == 2){
				if((customer.getAge()) > 16)
				{
					System.out.println("你大于16岁，不能开此类型账户");
				}
				else
				{
					JuniorAccount account = new JuniorAccount();
					account.setCustomer(customer);
					list.add(account);
					number++;
					System.out.println("开通成功！Account number is "+ number+", " + customer);
				}
		}
		else if (accountType == 3){
			CurrentAccount account = new CurrentAccount();
			account.setCustomer(customer);
			list.add(account);
			number++;
			System.out.println("开通成功！Account number is "+ number+", " + customer);
		}
		else{
			System.out.println("There is invalid type, please reinput!");
		}
	}
	
	public ArrayList<Account> getList(){
		return list;
	}
	
	public int getNumber(){
		return number;
	}
}
