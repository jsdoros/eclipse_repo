package org.ssglobal.training.codes.nested;

import java.util.ArrayList;
import java.util.List;

public class LeaderClass {
	
	public static double speedLevel = 1000.50;
	protected String company = "77Global"; 
	float baseSalary = 500000.00F;
	private int headCounts = 800;
	
	public void referenceData() {
		//MemberClass mc = new MemberClass();
		// since the local inner classes are temporary, created in stack rather than heap
	}
	
	public void createLocalInner() {
		
		float interest = 0.10F;
		
		abstract class Apply{
			
			public abstract void processResume();
		}
		
		class MemberClass{
			
			public String name = "Joanna";
			private int zipCode = 5476;
			
			public void referenceData() {
				System.out.println(speedLevel);
				System.out.println(company);
				System.out.println(baseSalary);
				System.out.println(headCounts);
			}
		}
		
		class InnerDefaultClass{
			
		}
		
		MemberClass mc = new MemberClass();
		InnerDefaultClass idc = new InnerDefaultClass();
		
		// return idc; // di pwede because no one knows MemberClass outside
	}
		
		public List<Double> compute(double x, double y){
			
			double sum = x + y;
			double diff = x - y;
			
			class Sum{
				
				public double getSum() {
					return x + y;
				}
			}
			
			class Subtraction{
				
				public double getDiff() {
					return x - y;
				}
			}
			
			Sum s = new Sum();
			Subtraction s2 = new Subtraction();
			List<Double> results = new ArrayList<>();
			results.add(sum);
			results.add(diff);
			return null;
			
		}
	
}
