package pkgexcptions;

import pkgMain.Triangle;

public class TrangleException extends Exception {
	private Triangle t;

	public TrangleException(Triangle t) {
		super();
		this.t = t;
	}

	public Triangle getT() {
		return t;
	}
	
}
