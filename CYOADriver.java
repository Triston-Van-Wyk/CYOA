import java.util.*;

public class CYOADriver {
	public static void main(String[] args) {

		//Items used run the code
		Scanner scan = new Scanner(System.in);
		boolean con = true;
		boolean phoneWin = false;
		boolean yellWin = false;
		boolean phoneWinsection = false;
		int codeChosen;
		int numWins = 0;
		
		
		System.out.print("Enter a name: ");
		String name = scan.next();
		
		CYOAObject story = new CYOAObject(name);
	
		while (con == true) {
			//Resets needed variables
			phoneWinsection = false;
			story.resetAttemptsLeft();
			codeChosen = 0;
			
			//Used to start the game
			System.out.println(story.intro());
			System.out.print(story.introOptions());
			
			String path = scan.next().toUpperCase();
			
			//Go to the cabinet and path
			if(path.equals("A")) {
				System.out.println(story.scenario1());
				System.out.print(story.scenario1Options());
				path = scan.next().toUpperCase();
				
				//takes you to pill death 
				if(path.equals("A")) {
					System.out.print(story.pillDeath(numWins));
					path = scan.next().toLowerCase();
					if(path.equals("q")) {
						con = false;
					}
				//Runs the other code to choose the start options again
				} else {
					System.out.println(story.noTakePill());
					path = scan.next().toUpperCase();
					
					//Insert code underneath to run the other situations:
					if(path.equals("A")) {
						System.out.println(story.scenario2());
						System.out.print(story.scenario2Options());
						
						while ((story.getAttemptsLeft() > 0) && (phoneWinsection==false)) {
							
							path = scan.next().toUpperCase();
							
							//Determines which phone code was chosen and acts upon that
							if(path.equals("C")) {
								phoneWinsection = true;
							} else if (path.equals("A")) {
								story.decreaseAttemptsLeft();
								codeChosen = 0;
								
								if(story.getAttemptsLeft() > 0) {
									System.out.println(story.tryAgainMessage(0));
									System.out.print(story.scenario2Options().substring(8));
								}
							} else if (path.equals("B")) {
								story.decreaseAttemptsLeft();
								codeChosen = 1;
								
								if(story.getAttemptsLeft() > 0) {
									System.out.println(story.tryAgainMessage(1));
									System.out.print(story.scenario2Options().substring(0,8) + story.scenario2Options().substring(16));
								}
							} else {
								story.decreaseAttemptsLeft();
								codeChosen = 3;
								
								if(story.getAttemptsLeft() > 0) {
									System.out.println(story.tryAgainMessage(1));
									System.out.print(story.scenario2Options().substring(0,16) + story.scenario2Options().substring(24));
								}
							}
						}
						
						//Decides if you won using the phone or not
						if(phoneWinsection == false) {
							
							System.out.print(story.phoneDeath(numWins, codeChosen));
							path = scan.next().toLowerCase();
							if(path.equals("q")) {
								con = false;
							}
							
						} else {
							if((numWins < 2) && (phoneWin == false)) {
								numWins ++;
							}
							phoneWin = true;
							System.out.print(story.phoneWin(numWins));
							path = scan.next().toLowerCase();
							if(path.equals("q")) {
								con = false;
							}
						}
						//Simulates you choosing path B
					} else if (path.equals("B")) {
						if((numWins < 2) && (yellWin == false)) {
							numWins ++;
						}
						yellWin = true;
						System.out.print(story.scenario3(numWins));
						path = scan.next().toLowerCase();
						if(path.equals("q")) {
							con = false;
						}
						//Simulates you choosing path C
					} else {
						System.out.print(story.scenario4(numWins));
						path = scan.next().toLowerCase();
						if(path.equals("q")) {
							con = false;
						}
					}
				}
				
			//Grab your phone and call for help path
			} else if(path.equals("B")) {
				System.out.println(story.scenario2());
				System.out.print(story.scenario2Options());
				
				while ((story.getAttemptsLeft() > 0) && (phoneWinsection==false)) {
					
					path = scan.next().toUpperCase();
					
					//Determines which phone code was chosen and acts upon that
					if(path.equals("C")) {
						phoneWinsection = true;
					} else if (path.equals("A")) {
						story.decreaseAttemptsLeft();
						codeChosen = 0;
						
						if(story.getAttemptsLeft() > 0) {
							System.out.println(story.tryAgainMessage(0));
							System.out.print(story.scenario2Options().substring(8));
						}
					} else if (path.equals("B")) {
						story.decreaseAttemptsLeft();
						codeChosen = 1;
						
						if(story.getAttemptsLeft() > 0) {
							System.out.println(story.tryAgainMessage(1));
							System.out.print(story.scenario2Options().substring(0,8) + story.scenario2Options().substring(16));
						}
					} else {
						story.decreaseAttemptsLeft();
						codeChosen = 3;
						
						if(story.getAttemptsLeft() > 0) {
							System.out.println(story.tryAgainMessage(3));
							System.out.print(story.scenario2Options().substring(0,24) + story.scenario2Options().substring(32));
						}
					}
				}
				
				//Decides if you have won or not
				if(phoneWinsection == false) {
					
					System.out.print(story.phoneDeath(numWins, codeChosen));
					path = scan.next().toLowerCase();
					if(path.equals("q")) {
						con = false;
					}
					
				} else {
					if((numWins < 2) && (phoneWin == false)) {
						numWins ++;
					}
					phoneWin = true;
					System.out.print(story.phoneWin(numWins));
					path = scan.next().toLowerCase();
					if(path.equals("q")) {
						con = false;
					}
				}
				
			//Yell in hopes someone will hear your call for help
			} else if (path.equals("C")) {
				if((numWins < 2) && (yellWin == false)) {
					numWins ++;
				}
				yellWin = true;
				System.out.print(story.scenario3(numWins));
				path = scan.next().toLowerCase();
				if(path.equals("q")) {
					con = false;
				}
				
			//Used to write death message of scenario 4
			} else {
				System.out.print(story.scenario4(numWins));
				path = scan.next().toLowerCase();
				if(path.equals("q")) {
					con = false;
				}
			}
			
		}
		
		//Prints a message if you found both ways to win
		if(numWins == 2) {
			System.out.println("\n\nWow you found all of the survival endings! Geat work!");
		}
		System.out.println("\nThanks for playing!");
		scan.close();
	}
}