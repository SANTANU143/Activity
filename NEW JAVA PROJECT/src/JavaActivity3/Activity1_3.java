package JavaActivity3;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds=1000000000;
		
		double EarthSeconds =31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		/*
		double Earth_Age=seconds/EarthSeconds;
		double Mercury_Age= seconds/EarthSeconds/MercurySeconds;
		double Venus_Age=seconds/EarthSeconds/VenusSeconds;
		double Mars_Age=seconds/EarthSeconds/MarsSeconds;
		double Jupiter_Age=seconds/EarthSeconds/JupiterSeconds;
		double Saturn_Age=seconds/EarthSeconds/SaturnSeconds;
		double Uranus_Age=seconds/EarthSeconds/UranusSeconds;
		double Neptune_Age=seconds/EarthSeconds/NeptuneSeconds;
		
		System.out.println("Earth Age=" +Earth_Age);
		System.out.println("Mercury Age= "+Mercury_Age);
		System.out.println("Venus Age= " +Venus_Age);
		System.out.println("Mars Age= "+Mars_Age);
		System.out.println("Jupiter Age= "+Jupiter_Age);
		System.out.println("Saturn Age= "+Saturn_Age);
		System.out.println("Uranus Age= "+Uranus_Age);
		System.out.println("Naptune Age= " +Neptune_Age);
		*/
		
		System.out.println("Earth_Age- " + seconds / EarthSeconds);
		System.out.println("Mercury_Age- " + seconds / EarthSeconds / MercurySeconds);
        System.out.println("Venus_Age- " + seconds / EarthSeconds / VenusSeconds);
        System.out.println("Mars_Age- " + seconds / EarthSeconds / MarsSeconds);
        System.out.println("Jupiter_Age- " + seconds / EarthSeconds / JupiterSeconds);
        System.out.println("Saturn_Age- " + seconds / EarthSeconds / SaturnSeconds);
        System.out.println("Uranus_Age- " + seconds / EarthSeconds / UranusSeconds);
        System.out.println("Neptune_Age- " + seconds / EarthSeconds / NeptuneSeconds);
		 

	}

}
