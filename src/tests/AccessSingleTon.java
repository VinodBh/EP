package tests;

public class AccessSingleTon {

	
	
	
	public static void main(String[] args) {
		
	
		SingleTon ton = SingleTon.getInstance();
		ton.print();
		
		SingleTon ton1 = SingleTon.getInstance();
		
		if(ton.hashCode() == ton1.hashCode()) {
			System.out.println("same obj");
		}
		ton1.print();
	}
	
}
