package org.ssglobal.training.codes.objects;

public class TestCrudRepository {

	public static void main(String[] args) {

		try {
			CrudRepository crud = new CrudRepository("username", "password");
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
