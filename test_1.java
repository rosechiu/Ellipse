package ncnu.csie.hw.ellipse;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ellipse e1=new ellipse();
		e1.a = 20;
		e1.b = 12;
		
		System.out.println("E1的面積 :"+e1.area());
		System.out.println("E1的周長 :"+e1.perimeter());
	}
}
