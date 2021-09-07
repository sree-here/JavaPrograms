class Temperature{
	public static String getFeelingsByTemp(int temp){
		if(temp<=10){
			return "freezingly cold!!";
		}
		/*if(temp<=10 && temp>0){
			return "Freezing!!";
		}
		if(temp<0 && temp>10){
			return "cold!!";
		}
		if(temp<10 && temp>20){
			return " A Bit cold";*/
		}
		if(temp<20&& temp>30){
			return "modarate";
		}
		if(temp<30 && temp>40){
			return "Hot!!";
		}
		if(temp<40 && temp>50){
			return "Too Hot!!";
		}
		if(temp<50 && temp>60){
			return "Burning!!";
		}
		if(temp<60 && temp>70){
			return "BURRRRNNNIIINNNG";
		}
		if(temp<70 && temp>80){
			return "Almost boiling point";
		}
		if(temp>80){
			return "Boiling point temp";
		}
		return "Invalid";
	}
	public static void main(String args[]){
		int temp=22;
		System.out.println(getFeelingsByTemp(temp));
	} 
}