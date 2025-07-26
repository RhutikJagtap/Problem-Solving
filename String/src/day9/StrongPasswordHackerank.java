package day9;

import java.util.Scanner;

//should contain 
//atleast one digit(0-9)
//atleast one lowercase character(a-z)
//atleast one uppercase character(A-Z)
//atleast one special character(!@#$%&*()_+)
//lenght>=6
public class StrongPasswordHackerank {

	static int strongPassword(int passwordLength, String s) {
		int lc = 0, uc = 0, nc = 0, sc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				if (ch >= 'a' && ch <= 'z') {
					lc++;
				} else {
					uc++;
				}

			} else if (ch >= '0' && ch <= '9') {
				nc++;
			} else {
				sc++;
			}
		}

		int execeptedCharCount = 0;

		if (lc == 0) {
			execeptedCharCount++;
		}
		if (uc == 0) {
			execeptedCharCount++;
		}
		if (nc == 0) {
			execeptedCharCount++;
		}
		if (sc == 0) {
			execeptedCharCount++;
		}

		int lengthCount = 6 - passwordLength;
		if (lengthCount < 0) {
			lengthCount = 0;
		}

		return Math.max(execeptedCharCount, lengthCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the password length");
		int passwordLength = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the string");
		String str = scanner.nextLine();

		System.out.println("Minimum number of character to add");
		int result = strongPassword(passwordLength, str);
		System.out.println(result);
	}

}

/*
 * scenario1 ab invalid we need to add 4 more ab1A@c
 * 
 * to satisfy character 3 added to satisfy length 6-s.length i.e 6-2=4 character
 * count= 3 length count= 4
 * 
 * which one is greater that we need to return
 * 
 * we need to return 4 ------------------------------ scenario2 aaaaaa invalid
 * we need to add 1 digit ,1uppercase,1special aaaaaa1A@ to satisfy character 3
 * added to satisfy length 6-s.length i.e 6-6=0 character count = 3 length
 * count= 0
 * 
 * we need to return 3 3 means minimum characters we need to add
 * ----------------------------------- scenario 3 aB@15 invalid we need to add
 * one more character to satisfy character no need to added to satisfy length
 * 6-s.length i.e 6-5=1 character count =0 length count =1
 * 
 * we need to return 1
 * 
 * 
 */