public class CYOAObject {
	
	private String name;
	
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
		return "w";
	}
}
