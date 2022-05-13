public class CYOAObject {
	
	private String name;
	private String chosenOption;
	private static int numWins = 0;
	private int attemptsLeft = 2;
	
	//This is the constructor for the class
	public CYOAObject(String n) {
		name = n;
		attemptsLeft = 2;
	}
	
	//This is used to display  the intro
	public String intro() {
		return "\nYou wake up in a strange room. Your memory is fading and you have no recollection of how you got into this room. "
				+ "\nAll that you can remember is your name is " + name + ". It seems like your time has come but taking a glance around this room feels familiar somehow… "
				+ "\nThis gives you a slight hope and you try to move but your head starts throbbing in pain. You stop and immediately reach out and touch it. "
				+ "\nPulling back your hand all you see is your hand covered in blood. You are overflowed with fear and you realize that you don’t have much time… "
				+ "\nYou are slowly phasing in and out of conciseness and need to try and save yourself fast. What do you do?";
	}
	
	//This is used to print the options after the introduction
	public String introOptions() {
		return "\nA: Get up and investigate the room"
				+ "\nB:Grab your phone and call for help"
				+ "\nC:Yell and hope somone hears you"
				+ "\nD:Lay there and accept defeat"
				+ "\nEnter letter to choose path: ";
	}
	
	//This is used to print the first scenario after A was chosen from intoOptions
	public String scenario1() {
		return "\nYou stretch out your leg and your head throbs with unmeasurable pain. You try to overcome the pain and slowly raise your leg. "
				+ "\nAs you start raising yourself from the ground, you slip and hit your head. You wail in pain and lay there as you think about how this was a terrible mistake. "
				+ "\nWith one last hopeful attempt, you try again. But this time you manage to get up. You lean yourself against a wall and take a minute to breathe and let the pain settle. "
				+ "\nWhile standing there you take a look around. The room is completely empty and yet full of everything. "
				+ "\nYou see things appear and disappear before your eyes, everything besides a cabinet. "
				+ "\nHopeful you slowly walk over to it and as it opens you are hoping to find something to help save you. To your surprise, there is a pill bottle and some bandages. "
				+ "\nYou wrap your head in hopes to slow the bleeding. You already feel better but stare at the pill bottle. It is unlabeled and only has one pill. "
				+ "\nWith your mind starting to settle a little bit and you know you need to make a decision:";
	}
	
	//This is used to print the options after reading though scenario one 
	public String scenario1Options() {
		return "\nA:Take the pill"
				+ "\nB:Leave the pill and continue to look around "
				+ "\nEnter letter to choose path: ";
	}
	
	//This is used to print the death message after picking to take the pill
	public String pillDeath() {
		return "You take the pill and swallow it. You stand there for a few minutes and await said effects. As you look around the room your stomach starts to ache. "
				+ "\nYou look around the room for some water to help calm the pain. But as you try to move your whole body cramps and you die." + deathMessage() ;
	}
	
	//This is used to print the scenario after not taking the pill
	public String noTakePill() {
		return "You really wish to have taken the pill to just see, but glad you didn’t because it could have brought on death faster. Now that you have regained some conscience what do you do?" + noTakePillOptions();
	}
	
	//This is used to print the options after you have not taken the pill
	public String noTakePillOptions() {
		return "\n\nA: Grab your phone and call for help"
				+ "\nB:Yell and hope somone hears you"
				+ "\nC: Lay there and accept defeat";
	}
	
	public String scenario2() {
		return "\nYou look for your phone. You can’t remember what it looks like or if you even had one but you still are hopeful. Then you check your back right pocket and find it there. "
				+ "\nYou grab it and try to call someone but the phone is locked... What password do you try?";
	}
	
	public String scenario2Options() {
		return "\nA: 1234"
				+ "\nB: 9876"
				+ "\nC: 6793"
				+ "\nD: 5913"
				+ "\nEnter letter to choose path: ";
	}
	

	//This displays the death message after you have died.
	public String deathMessage() {
		return "\n\nBetter luck next time… Would you like to play again? Ways found of surviving " + numWins + " out of 2 (enter q to quit or any else to try again)";
	}
	
	//This displays the win message of the game.
	public String winMessage() {
		return "\n\nCongratulations you survived! Would you like to play again and try to escape in another way? Ways found of surviving " + numWins + " out of 2 (enter q to quit or anything else to try again)";
	}
	
	//This is used to get the number of different win endings you have achieved.
	public static int getNumWins() {
		return numWins;
	}
	
	//This changes the number of times you have won by one if numWins < 2
	public static void increaseNumWins() {
		if(numWins < 2) {
			numWins++;
		}
	}
}