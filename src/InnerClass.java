
public class InnerClass {

	public static void main(String[] args) {	
		Outer outerObj = new Outer();
		Outer.InnerClass innerObj = outerObj.new InnerClass();
		

	}
	
	class Outer{
		private int data=30;
		class InnerClass{
			void msg(){
				System.out.println("data is "+data);
				}  
		}
		}
	}

}
