package ncnu.csie.hw.ellipse;

public class ellipse {
		// TODO Auto-generated method stub
		int a;	//ªø¶b
		int b;	//µu¶b
		float x = 3.14f;	//pi
		public float area(){
			return x*a*b;
		}
		public float perimeter(){
			return x*b+2*(a-b);
		}
		
		public void setAB(int a,int b){
			this.a = a;
			this.b = b;
		}
}

