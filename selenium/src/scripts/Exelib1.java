package scripts;

import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Exelib1 {
	
	public static void main(String[] args) {
		
Lib1 L=new Lib1();

L.launch();
L.login();
L.rec();
Sleeper.sleepTightInSeconds(4);
L.Logout();
	}

}
