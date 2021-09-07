class City{
	public static String cityBypincode(int pincode){
		if(pincode==563130){
			System.out.println("Malur pincode is"+pincode);
			return "Malur";
		}
		if(pincode==563131){
			System.out.println("Mulbagal pincode is"+pincode);
			return "Mulbagal";
		}
		if(pincode==560069){
			System.out.println("Bangalore pincode is"+pincode);
			return "Bangalore";
		}
	return "NA";
	}
	public static void main(String[] values)
	{
		String getCity=cityBypincode(563130);
		System.out.println(getCity);
	}
}