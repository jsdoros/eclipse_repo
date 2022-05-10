package org.ssglobal.training.codes.nested;

import java.util.ArrayList;
import java.util.List;

public class TestHosts {

	public static void main(String[] args) {

		AccessHost ah = new AccessHost();
		ah.validateHost(new HostClass() {
			// anon inner class
		});

		HostClass h = new HostClass() {
			// anon inner class, ito na yung object
			// hindi na-create na object si new HostClass(); anon is created
			// h is not an object, but only a pointer
			protected String company = "Accenture";
			public int x = 100;
			
			public void sayHello() {
				System.out.println("hello");
				System.out.println(x);
				System.out.println(company);
			}
			
			@Override
			public List<Double> getResult(double x, double y) {
				List<Double> result = new ArrayList<>();
				result.add(sum(x, y));
				result.add(diff(x, y));
				return result;
			}
			
			public double sum(double x, double y) {
				return x + y;
			}
			
			public double diff(double x, double y) {
				return x - y;
			}
		};
		
		System.out.println(h.baseSalary); // object ni anon class
		System.out.println(h.company);
		System.out.println(HostClass.speedLevel);
		h.sayHello();
		System.out.println(h.getResult(20, 10));
	}

}
