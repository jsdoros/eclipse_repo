package org.ssglobal.training.codes.objects;

public class TestProfile {

	public static void main(String[] args) throws ProfileSingletonException{
		try {
			Profile profile = Profile.create();
			System.out.println("successfully instantiated");
			Profile profile2 = Profile.create(101, "Juan Luna");
			Profile profile3 = Profile.create(102, "100100.00F");
			//Profile profile4 = Profile.create(102, "100100.00F");
			System.out.println("other profiles successfully instantiated");
		} catch (ProfileSingletonException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
