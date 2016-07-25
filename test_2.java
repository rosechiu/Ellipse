package ncnu.csie.hw.ellipse;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ellipse e1=new ellipse();
		e1.a = 20;
		e1.b = 12;

		System.out.println("E1的面積 :"+e1.area());
		System.out.println("E1的周長 :"+e1.perimeter());
		System.out.println();
		
		ellipse e2 = e1;
		e2.b = 18;
		
		System.out.println("E2的面積 :"+e1.area());
		System.out.println("E2的周長 :"+e1.perimeter());
	}

}
