import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		System.out.println("Queue: ");
		names.add("Santiago");
		names.add("Christof");
		names.add("Bernard");
		names.add("Bernie");
		names.add("Bernard");
		System.out.println(names.removeFirst());
		System.out.println(names.remove(3));
		System.out.println("\n");
		names.clear();
		names.add("Marty");
		names.add("Carter");
		System.out.println(names.remove());
		System.out.println("\n");
		
		System.out.println("Stack: ");
		names.push("Santiago2");
		names.push("Christof2");
		names.push("Bernard2");
		System.out.println(names.pop());
		System.out.println(names.pop());
		System.out.println("\n");
		names.clear();
		names.push("Marty2");
		names.push("Carter2");
		System.out.println(names.pop());
	}
}
