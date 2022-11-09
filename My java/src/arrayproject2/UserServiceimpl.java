package arrayproject2;

import java.util.Scanner;

public class UserServiceimpl implements UserService {
	public static final int MAX_USER = 3;
	User[] userArray = new User[MAX_USER];
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("HOW MANY USER YOU WANT TO ADD");
		int ch = sc.nextInt();
		for (int i = 0; i < ch; i++) {

			User user = new User();
			System.out.println(" Enter your user uid");
			user.setUid(sc.nextInt());
			System.out.println("Enter your name");
			user.setUname(sc.next());
			System.out.println("Enter your upass");
			user.setUpass(sc.next());
			System.out.println("Enter your address");
			user.setAddress(sc.next());
			System.out.println("Enter your mobilenumber");
			user.setUmobile(sc.nextLong());
			userArray[i] = user;

		}
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("please Enter userid to deleted ");
		int ch = sc.nextInt();
		int index = 0;

		for (User user : userArray) {

			if (user.getUid() == ch) {
				if (user != null) {

				break;
			}
			}
			index++;

		}
		userArray[index] = null;

	}

	@Override
	public User[] getAllUserDetails() {
		for (User u : userArray) {
			if (u != null) {
				System.out.println("user id:" + u.getUid());
				System.out.println("user name: " + u.getUname());
				System.out.println("user pass: " + u.getUpass());
				System.out.println("user address:" + u.getAddress());
				System.out.println("user mobile number:" + u.getUmobile());

			}

		}
		return userArray;
	}
}