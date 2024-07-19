class MovieApp{
	public static void main(String[] args){
		//actors
		Actor a1 = new Actor("Christian Bale","M",47,"United Kindom");
		Actor a2 = new Actor("Jim Carrey","M",60,"Canada");
		Actor a3 = new Actor("Leonardo Dicaprio","M",47,"United States");
		Actor a4 = new Actor("Tom Cruise","M",59,"United States");
		Actor a5 = new Actor("Scarlett Johanssom","F",37,"United States");
		Actor a6 = new Actor("Chris Hamsworth","M",38,"Australia");
			
		//movies
		Movie m1 = new Movie("The Dark Knight", 2008, 185, 1004, a1, "Warner Bros");
        Movie m2 = new Movie("Mission: Impossible", 2018, 178, 791, a4, "Paramount Pictures");
        Movie m3 = new Movie("Avengers: Endgame", 2019, 356, 2798, a5, "Marvel Studios");
        Movie m4 = new Movie("John Wick", 2014, 20, 89, a6, "Lionsgate");
        Movie m5 = new Movie("Inception", 2010, 160, 828.3, a3, "Warner Bros");
        Movie m6 = new Movie("Interstellar", 2014, 165, 677.47, a3, "Paramount Pictures");
        Movie m7 = new Movie("The Matrix", 1999, 63, 463.57, a4, "Warner Bros");
        Movie m8 = new Movie("Blade Runner 2049", 2017, 150, 259.24, a1, "Warner Bros");
        Movie m9 = new Movie("Star Wars: Episode VII", 2015, 245, 2068.2, a5, "Lucasfilm");
        Movie m10 = new Movie("Dumb and Dumber", 1994, 17, 247.28, a2, "NewLine Cinema");
	
		Actor[] actors = {a1,a2,a3,a4,a5,a6};
		Movie[] movies = {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
		
		System.out.println("#####################################################################");
		//iii
		for(Movie x : movies){
			if(x.getTitle().equals("Interstellar")){
				x.setWorldWideEarnings(701.27);
			}
		}
		
		//iv
		System.out.println("Highest Grossing Movie:");
		Movie grossTag = null;
		double gross = 5;
		for(Movie x : movies){
			if(x.getWorldWideEarnings() > gross){
				gross = x.getWorldWideEarnings();
				grossTag = x;
			}
		}
		
		if(grossTag != null){
			grossTag.play();
		}
		
		System.out.println("#####################################################################");
		//v
		System.out.println("Movies Released after 2017: ");
		for(Movie x : movies){
			if(x.getYear() > 2017){
				x.play();
			}
		}
		
		System.out.println("#####################################################################\n");
		//vi movies companies = 6
		//Sync movie companies and their earnings by equals company name from movies
		String[] company = {"Warner Bros","Paramount Pictures","Marvel Studios","Lionsgate","Lucasfilm","NewLine Cinema"};
		double[] earns = {0,0,0,0,0,0};

		for(int i=0; i < 6; i++){
			for(Movie x : movies){
				if(x.getProductionCompany().equals(company[i])){
					earns[i] += x.getWorldWideEarnings();
				}
			}
		}
		
		double max = 5; //get max earn value
		for(int i=0; i < 6; i++){
			for(double x : earns){
				if(earns[i] > max){
					max = earns[i];
				}
			}
		}
		// finding highest company by syncing max value from earn arr.
		for(int i=0; i < 6; i++){
			if(earns[i] == max){
				System.out.println("Production Company with the Highest Total Collection:  " + company[i]);
			}
		}
		System.out.println("#####################################################################\n");

		
		
		//vii
		double total = 0;
		
		for(Movie x : movies){
			if(x.getProductionCompany().equals("Warner Bros")){
				total += x.getWorldWideEarnings();
			}
		}
		System.out.println("Total Collection Earned by Warnder Bros:  "+ total);
		
		System.out.println("#####################################################################\n");
		//viii
		System.out.println("Movies acted by the actor Tom Cruise:");
		for(Movie x : movies){
			if(x.getLeadActor().equals(a4)){
				System.out.println(x.getTitle());
			}
		}
		
		System.out.println("\n#####################################################################\n");

		
		//ix
		System.out.println("Actors from United States");
		for(Actor x : actors){
			if(x.getCountry().equals("United States")){
				x.displayInfo();
			}
		}
		
	
	}
}

class Movie{
	private String title;
	private int year;
	private double budget;
	private double worldWideEarnings;
	private Actor leadActor;
	private String productionCompany;
	
	Movie(String title, int year, double budget, double worldWideEarnings, Actor leadActor, String productionCompany){
		this.title = title;
		this.year = year;
		this.budget = budget;
		this.worldWideEarnings = worldWideEarnings;
		this.leadActor = leadActor;
		this.productionCompany = productionCompany;
	}
	
	public String getTitle(){
		return title;
	}
	public int getYear(){
		return year;
	}
	public double getBudget(){
		return budget;
	}
	public double getWorldWideEarnings(){
		return worldWideEarnings;
	}
	public Actor getLeadActor(){
		return leadActor;
	}
	public String getProductionCompany(){
		return productionCompany;
	}
	
	void setWorldWideEarnings(double worldWideEarnings){
		this.worldWideEarnings = worldWideEarnings;
	}
	
	void play(){
		System.out.println(
		"\nMovie: " + title 
		+ "\nProduction Company: " + productionCompany
		+ "\nbudget: $" + budget
		+ "\nWorldwide earnings: $" + worldWideEarnings 
		+ "\nLead Actor: " + leadActor);
	}
}

class Actor{
	private String name;
	private String gender;
	private int age;
	private String country;
	
	Actor(String name, String gender, int age, String country){
		this.name = name;
		this.gender = gender;
		this. age = age;
		this.country = country;
	}
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public int getAge(){
		return age;
	}
	public String getCountry(){
		return country;
	}
    @Override
    public String toString() {
        return name;
    }
	void displayInfo(){
		System.out.println("Name: " + name + "\nGender: " + gender
		+ "\nAge: " + age + "\nCountry: " + country);
	}
}