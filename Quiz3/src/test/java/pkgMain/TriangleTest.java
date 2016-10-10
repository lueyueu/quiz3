package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgexcptions.TrangleException;

public class TriangleTest {

	@Test
	public void GoodTriange() {

		double ExpectedPerimeter = 12.0;
		double ExpectedArea = 6;

		try {
			Triangle t1 = new Triangle(3, 4, 5);
			assertEquals(ExpectedPerimeter, t1.getPerimeter(), 0.01);
			assertEquals(ExpectedArea, t1.getArea(), 0.01);

		} catch (TrangleException e) {
			fail("This is not a triangle");
			e.printStackTrace();
		}

	}

	@Test(expected = TrangleException.class)
	public void BadTriangle() throws TrangleException {

		try {
			Triangle t1 = new Triangle(3, 4, 8);
		} catch (TrangleException e) {
			System.out.println("Side 1: " + e.getT().getside1());
			System.out.println("Side 2: " + e.getT().getside2());
			System.out.println("Side 3: " + e.getT().getside3());
			throw e;
		}

	}
}
