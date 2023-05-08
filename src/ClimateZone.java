import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Implement your ClimateZone class in this file
public class ClimateZone {
	private ArrayList<City> cityList = null;
	
	public ClimateZone() {
		cityList = new ArrayList<City>();
	 }// end of ClimateZone default constructor
	public ClimateZone(String cityFile) throws IOException {
		cityList = new ArrayList<City>();
		     // 1. open the cityFile
		     FileInputStream myFile = null; // File input stream
		     Scanner myFileReader = null;   // Scanner object
		     String name;
		     String state;
		     double highTemp;
		     double lowTemp;

		     // 2. Try to open city file and read in the data from it
		     System.out.println("Opening file " + cityFile);
		     myFile = new FileInputStream(cityFile);
		     myFileReader = new Scanner(myFile);

			 while(myFileReader.hasNext()) {
		      name     = myFileReader.next();
		      state    = myFileReader.next();
		      highTemp = myFileReader.nextDouble();
		      lowTemp  = myFileReader.nextDouble();

		      // add city to the list
		      this.addCity(name, state, highTemp, lowTemp);
		   }

		   myFileReader.close();
		   myFile.close();
		 }// end of ClimateZone overloaded constructor
	public void addCity( String name, String state, double highTemp, double lowTemp) {
		cityList.add(new City( name, state, highTemp, lowTemp));
	}
	public int getCityCount() {
		return cityList.size();
	}
	public City getCityByName(String name, String state) {
	     // a)- iterate through the ArrayList<City> object and
	     for(City currCity : cityList){
	        // b)- search for a city with a name that is equal to the argument value.
	        if ((currCity.getName().equals( name)) && (currCity.getState().equals( state))){
	        	// c)- If such a city is found, then this method should return a reference to that City object, 
	            return currCity;
	        }
	     }
	     // d)- otherwise this method should return null
	     return null;
	}
	public void printHottestCities( ) {  // determine the two City objects the hottest
	     // 1. determine the two Cities objects with the highest high temps(in descending order).
	     City firstHottestCity = null;
	     City nextHottestCity  = null;
	     double highestTemp = 0.0;

	     // find first hottest city
	     for(City currCity : cityList){
	         if(currCity.getHighTemp() > highestTemp){
	        	 firstHottestCity = currCity; 
	        	 highestTemp = currCity.getHighTemp();
	         }
	     }
	     // find next hottest city  
	     highestTemp = 0.0;
	     for(City currCity : cityList){
	         if((currCity.getHighTemp() > highestTemp) && 
	            (currCity != firstHottestCity)){
	        	 nextHottestCity = currCity;
	        	 highestTemp = currCity.getHighTemp();
	         }
	     }
	     // 2. It should then call the printInfo method on these two City objects.
	     firstHottestCity.printInfo();
	     nextHottestCity.printInfo();
	 }
	public void printColdestCities( ) {  // determine the two City objects the coldest
	     // 1. determine the two Cities objects with the highest low temps(in descending order).
	     City firstColdestCity = null;
	     City nextColdestCity  = null;
	     double lowestTemp = 0.0;

	     // find first hottest city
	     for(City currCity : cityList){
	         if(currCity.getLowTemp() < lowestTemp){
	        	 firstColdestCity = currCity; 
	        	 lowestTemp = currCity.getLowTemp();
	         }
	     }
	     // find next hottest city  
	     lowestTemp = 0.0;
	     for(City currCity : cityList){
	         if((currCity.getLowTemp() < lowestTemp) && 
	            (currCity != firstColdestCity)){
	        	 nextColdestCity = currCity;
	        	 lowestTemp = currCity.getLowTemp();
	         }
	     }
	     // 2. It should then call the printInfo method on these two City objects.
	     firstColdestCity.printInfo();
	     nextColdestCity.printInfo();
	 }
	 public void printAllCities(){
	     for(City currPlayer : cityList){
	        currPlayer.printInfo();
	     }
	 }
}//end of class ClimateZone
