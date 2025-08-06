package com.logical;

public class ValidateEmail {

	public static void main(String[] args) {
		System.out.println(isValideEmail("invalide@gmail.com"));

	}

	static boolean isValideEmail(String str) {
		if (str.length() == 0) {
			return false;
		} else {
			if (!str.contains("@"))
				return false;
			if (!str.contains("gmail"))
				return false;
			if (!str.endsWith(".com"))
				return false;
		}
		return true;

	}

}
