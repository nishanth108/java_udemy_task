package pack_for_dowhile;

public class DoWhile {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		char choice;
		
		do {
			
			System.out.println("Help on:");
			System.out.println("1.If");
			System.out.println("2.Switch");
			System.out.println("3.While");
			System.out.println("4.DoWhile");
			System.out.println("5.For");
			
			choice = (char)System.in.read();
		}while(choice<'1' || choice >'5');
		
		System.out.println("\n");
		
		switch(choice)
		{
			case '1':
				System.out.println("The if:");
				System.out.println("If(condition) statement");
				System.out.println("else statement");
				break;
				
			case '2' :
				System.out.println("The switch: \n");
				System.out.println("switch(expression){ statement");
				System.out.println("case constant:");
				System.out.println(" statement sequence :");
				System.out.println(" break;");
				break;
				
			case '3' :
				System.out.println("The while: \n");
				System.out.println("while(condition) statement");
				break;
			
			case '4' :
				System.out.println("The do-while: \n");
				System.out.println("do {");
				System.out.println("  Statement;");
				System.out.println(" }while(condition);");
				break;
			
			case '5' :
				System.out.println("The for: \n");
				System.out.println("for(intialization;condition;iteration) {");
				System.out.println("  Statement;");
				System.out.println(" }");
				break;
		}
	}

}
