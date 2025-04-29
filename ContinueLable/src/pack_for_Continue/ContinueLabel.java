package pack_for_Continue;

public class ContinueLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	outer : for(int i = 0; i < 3 ;i++) {
				for(int j = 0;j < 3; j++)
				{
					if(j>i) {
						System.out.println();
						continue outer;
					}
					System.out.print(" "+(i*j));
				}
			}
	}

}
