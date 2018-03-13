package eu.ase.poly;

public class ProgMainPoly {
	public static void main(String... args) {
		Vehicle v = null;
		Auto a = new Auto(1200, 3);
		Plane p = new Plane(11000, 40, 2);
		
		v = a;
		System.out.println(v.display());
		
		v = p;
		System.out.println(v.display());
		
		Vehicle v1 = null;
		Auto a1 = new Auto(2100, 5);
		
		v1 = a1;
		try {
			Plane p1 = (Plane)v1;
			System.out.println(p1.display());
		} catch(ClassCastException cce) {
			cce.printStackTrace();
		}
		
		Movement m = new Plane(23000, 120, 4);
		m.startEngine();
		
	}
}