package pack_if_else;

public class IfElse {
	public static void main(String[] args) {
		
		int month = 12;
		String season;
		 
		if(month == 12 || month ==1 || month ==2 )
		{
			season = "winter";
			
		}
		else if(month == 3 || month ==4 || month ==5 )
		{
			season = "Spring";
			
		}
		else if(month == 6 || month ==7 || month ==8 )
		{
			season = "Summer";
			
		}
		else if(month == 9 || month ==10 || month ==11 )
		{
			season = "Autumn";
			
		}
		else {
			season ="Bogus month";
		}
		System.out.println("April is in the"+season+"season");
	}
}
