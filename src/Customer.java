import java.util.*;
import java.text.*;

public class Customer {
	private String name;
	private String address;
	private String birth;
	private Date date;
	private int year;
	private int age;
	private int PIN;
	private int accountType = 0;//默认没开户
	private boolean credit = true;
	private String[] accountType1 = {"Saver account", "Junior account", "Current account"};
	
	public Customer(String str1, String str2, String str3){
		this.PIN = (int)(Math.random()*9999);//随机分配一个PIN
		this.name = str1;
		this.address= str2;
		this.birth = str3;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = null;
		try{
			date = sdf.parse(str3);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			this.year = c.get(Calendar.YEAR);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int getAge(){
		Calendar c1 = Calendar.getInstance();
		int year1 = c1.get(Calendar.YEAR);
		age = year1-year;
		return age;
	}
	public int getPIN(){
		return this.PIN;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	
	public void setAccountType(int accountType){
		this.accountType = accountType;
	}
	
	public String getAccountType(){
		return accountType1[this.accountType-1];
	}
	
	public void setCredit(){
		this.credit = false;
	}
	
	public boolean getCredit(){
		return credit;
	}
	
	public String toString(){
		return "name is "+this.name+", address is "+this.address+", birth day is "+"\n"+this.birth+", age is "+this.getAge()+", type is "+this.getAccountType()+", PIN is "+this.PIN+"\n";
	}
}
