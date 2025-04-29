package pack_for_calc;
class Myclass {
	int avg;
	void average(int a ,int b, int c, int d , int e) {
		avg = (a+b+c+d+e)/5;
		System.out.println("the average of the number is:"+avg);
	}
}
public class AvgExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m = new Myclass();
		m.average(2, 2, 2, 2,2);
		
	}

}
