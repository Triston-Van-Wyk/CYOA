public class CYOAObject {
	
	private String name;
	private String chosenOption;
	
	public CYOAObject(String n) {
		name = n;
	}
	
	public String intro() {
		return "You wake up in a strange room. Your memory is fading and you have no recollection of how you got into this room. "
				+ "\nAll that you can remember is your name is " + name + ". It seems like your time has come but taking a glance around this room feels familiar somehow… "
				+ "\nThis gives you a slight hope and you try to move but your head starts throbbing in pain. You stop and immediately reach out and touch it. "
				+ "\nPulling back your hand all you see is your hand covered in blood. You are overflowed with fear and you realize that you don’t have much time… "
				+ "\nYou are slowly phasing in and out of conciseness and need to try and save yourself fast. What do you do?";
	}
	
	public String introOptions() {
		return "\nA: Get up and investigate the room"
				+ "\nB:Grab your phone and call for help"
				+ "\nC:Yell and hope somone hears you"
				+ "\nD:Lay there and accept defeat"
				+ "\nEnter letter to choose path: ";
	}
	
	public String scenario1() {
		return "You stretch out your leg and your head throbs with unmeasurable pain. You try to overcome the pain and slowly raise your leg. As you start raising yourself from the ground, you slip and hit your head. You wail in pain and lay there as you think about how this was a terrible mistake. With one last hopeful attempt, you try again. But this time you manage to get up. You lean yourself against a wall and take a minute to breathe and let the pain settle. While standing there you take a look around. The room is completely empty and yet full of everything. You see things appear and disappear before your eyes, everything besides a cabinet. Hopeful you slowly walk over to it and as it opens you are hoping to find something to help save you. To your surprise, there is a pill bottle and some bandages. You wrap your head in hopes to slow the bleeding. You already feel better but stare at the pill bottle. It is unlabeled and only has one pill. With your mind starting to settle a little bit and you know you need to make a decision:";
	}
	
	public String scenario1Options() {
		return "Take the pill"
				+ "\nLeave the pill and continue to look around";
	}
}
