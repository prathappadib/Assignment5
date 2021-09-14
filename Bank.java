import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String arr[][] =new String[6][4];

        for (int i = 0; i < arr.length; i++) {

                System.out.println("Enter the details of branch : "+ i);
                
                for (int j = 0; j < arr[i].length; j++) {
                        
                        System.out.println("Enter the Name of Customer " + j);
                        arr[i][j] = scan.nextLine();
                }
                System.out.println("-----------------------");
        }



        for (int i = 0; i < arr.length; i++) {
                System.out.print("Name of branch  " + i + " : ");

                for (int j = 0; j < arr[i].length; j++) {

                        System.out.print(arr[i][j]+ "  ");
                }

                System.out.println();
                
        }
	}

}
