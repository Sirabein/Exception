package exception;

public class Triangle {
	
	private double a, b, c, max, min, mid;
	
	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean check() {
		max =  Math.max(a, Math.max(b, c));
		min = Math.min(a, Math.min(b, c));
		mid = a + b + c - max - min;
		if (mid + min < max) {
			return false;
		} return true;
	}
	
	public double findArea() throws ExistenceException {
		if (check()) {
			double p = (a + b + c) / 2;
			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			return s;
		} else throw new ExistenceException(max);
	}

}
