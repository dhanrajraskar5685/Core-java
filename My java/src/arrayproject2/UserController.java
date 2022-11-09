package arrayproject2;

import java.util.Scanner;

public class UserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("YOUR APPLICATION START; ");
		boolean flag = true;
		UserService u = new UserServiceimpl();
		while (flag) {
			System.out.println("1.Add user");
			System.out.println("2.Delete user ");
			System.out.println("3.Get all user");
			System.out.println("4.Exit");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				u.addUser();
				break;
			case 2:
				u.deleteUser();
				break;
			case 3:
				u.getAllUserDetails();
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("You are enter invaild choice");

			}

		}

	}
}
