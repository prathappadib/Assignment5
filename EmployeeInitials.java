import java.util.Scanner;

class EmployeeInitials{
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

		char employeeinitials[] = new char[10];

		for (int i= 0; i < employeeinitials.length; i++ ) {
			System.out.println("Enter the initials of employee " + i);

			employeeinitials[i] = scanner.next().charAt(0);

			
		}

		for (int j = 0; j < employeeinitials.length ; j++ ) {

			System.out.print(employeeinitials[j] + " ");
			
		}

	}
}