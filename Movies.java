class Movies{
	public static String getMovieByActors(String hero, String heroin){
		if(hero.equals("yash") && heroin.equals("srinidhi")) {
			return"kgf";
		}
		return"No Match";
	}
	public static void main(String args[]){
		System.out.println(getMovieByActors("yash","ram"));
		
	}
	
}