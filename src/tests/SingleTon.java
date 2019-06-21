package tests;

public class SingleTon {

	
	private static SingleTon singleton;
	private static int count;
	public static boolean isExists =false;
	
	
	
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		if(!isExists) {
			 singleton = new SingleTon( );
			 count++;
			 isExists=true;
		}
		return singleton;
	}
	
	
	protected void print() {
		System.out.println("Print count" + count);
		
		
	}
	
}
