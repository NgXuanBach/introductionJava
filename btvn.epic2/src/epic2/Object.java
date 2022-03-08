package epic2;

public class Object {
	Float a;
	Float b;
	Float c;
	Float delta;
	Float x1;
	Float x2;

	public void pTBac21(Float a, Float b, Float c) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("phuong trinh vo nghiem.");
			} else {
				System.out.println("phuong trinh co 1 nghiem la: " + "x = " + (-c / b));
			}
		}
	}

	public void pTBac22(Float a, Float b, Float c) {
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("phuong trinh co 2 nghiem la: "+ "x1 = " + x1 + " và x2 = " + x2);
		}
		else {
			if(delta==0) {
				x1 = (-b / (2 * a));
	            System.out.println("phuong trinh co nghiem kep: "
	                    + "x1 = x2 = " + x1);
			}
			else {
				System.out.println("phuong trinh vo nghiem.");
			}
		}
	}
}
