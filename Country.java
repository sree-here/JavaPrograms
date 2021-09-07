class Country{
	public static String getCountryBypincode(int pincode){
		if(pincode==91){
			System.out.println("91 is India");
			return "India";
		}
		if(pincode==1){
			System.out.println("1 is USA");
			return "USA";
		}
		if(pincode==92){
			System.out.println("92 is Pakistan");
			return "Pakistan";
		}
		return "No Match";
	}
	public static void main(String[] values){
	int pincode=91;
	String getCountry=getCountryBypincode(pincode);
	System.out.println(getCountry);
}
}

