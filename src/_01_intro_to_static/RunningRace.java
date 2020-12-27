package _01_intro_to_static;

public class RunningRace {
	    static int nextBibNumber = 1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    RunningRace (String name, int speed, int bibNumber){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	        //create two athletes
	    	RunningRace Paul = new RunningRace("Paul", 5, nextBibNumber);
	    	Paul.bibNumber=nextBibNumber;
	    	nextBibNumber+=1;
	    	RunningRace Leet = new RunningRace ("Leet",6, nextBibNumber);
	    	Leet.bibNumber=nextBibNumber;
	    	System.out.println(Paul.name);
	    	System.out.println(Paul.bibNumber);
	    	System.out.println(Paul.speed);
	    	System.out.println(Leet.name);
	    	System.out.println(Leet.bibNumber);
	    	System.out.println(Leet.speed);
	        //print their names, bibNumbers, and the location of their race. 
	    }
	}

