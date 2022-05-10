package org.ssglobal.training.codes.objects;

public class CrudRepository {

	public CrudRepository (String username, String password) throws NullPointerException, Exception {
		if(username.length() == 0 || password.length() == 0 || username == null || password == null) {
			throw new NullPointerException();
		}
		
		// initialization
		// setup or configure
	}
}
