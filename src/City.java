// Implement your City class in this file
public class City {
	private String name     = "";   // city's name
	private String state    = "";   // State's name
	private double highTemp = 0.0;  // city's high
	private double lowTemp  = 0.0;  // city's low
	
	public City(String name, String state, double highTemp, double lowTemp){
		this.name     = name;
	    this.state    = state;
	    this.highTemp = highTemp;
	    this.lowTemp  = lowTemp;
	}
	public String getName(){
		return this.name;
	}
	public String getState(){
		return this.state;
	}
	public double getHighTemp(){
		return this.highTemp;
	}
	public void setHighTemp(double highTemp){
	    this.highTemp = highTemp;
	}
	public double getLowTemp(){
		return this.lowTemp;
	}
	public void setLowTemp(double lowTemp){
	    this.lowTemp  = lowTemp;
	}
	public void printInfo(){
		System.out.printf("%s, %s (High = %.2f, Low = %.2f)\n",
				          this.getName(),
				          this.getState(),
				          this.getHighTemp(),
				          this.getLowTemp());
	}

}
   