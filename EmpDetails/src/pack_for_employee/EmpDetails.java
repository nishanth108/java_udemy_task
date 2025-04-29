package pack_for_employee;
class employee {
	int eid;
	char gender;
	String name,address;
	long payment;
	int rating;
	
	employee(int id,char gender,String name,String address,long payment,int rating) {
		this.eid = id;
		this.gender = gender;
		this.name = name;
		this.address = address;
		this.payment = payment;
		this.rating = rating;
	}
	
	 void Display_my_data() {
		System.out.println(" Employee id is "+eid+".\n Name:"+name+".\n gender : "+gender
				+".\n Payment = "+payment+".\n Address : "+address+".\n Ratings : "+rating+".");
	}
}
public class EmpDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee(1,'m',"Nishanth","K K road perwad",6666666,10);
		e.Display_my_data();
	}

}
