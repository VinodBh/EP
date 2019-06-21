package tests;

public interface Design {

	
	public void draw(int i);
	public void draw(int i, int k);
	public void draw(int i, int k, int j);

	public static void clear() {
		System.out.println("shape cleared..");
	}

	
}
