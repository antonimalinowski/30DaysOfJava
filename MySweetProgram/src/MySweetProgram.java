import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Say hi: ");
		String s = in.nextLine();
		System.out.println(s);
		in.close();
	}
}
