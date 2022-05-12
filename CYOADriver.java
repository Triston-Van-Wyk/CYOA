import java.util.*;

public class CYOADriver {
	public static void main(String[] args) {

		//Items used run the code
		Scanner scan = new Scanner(System.in);
		boolean con = true;
		
		System.out.print("Enter a name: ");
		String name = scan.next();
		
		CYOAObject story = new CYOAObject(name);
		
		System.out.println(story.intro());
		System.out.print(story.introOptions());
		
		String path = scan.next().toUpperCase();
	
		while (con == true) {
			
			if(path.equals("A")) {
				System.out.println("Path A was selected");
			} else if(path.equals("B")) {
				System.out.println("Path B was selected");
			} else if (path.equals("C")) {
				System.out.println("Path C was selected");
			} else {
				System.out.println("Path D was selected");
			}
			
		}
	}
}
