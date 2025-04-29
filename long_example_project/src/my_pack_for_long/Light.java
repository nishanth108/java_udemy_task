package my_pack_for_long;

public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		lightspeed = 186000;
		
		days = 150;//specify the number of days
		
		seconds = days*24*60*60;
		
		distance = lightspeed*seconds;
		
		System.out.print("In"+days);
		
		System.out.print("days light will travel about");
		
		System.out.print(distance+"miles");
		
	}

}
