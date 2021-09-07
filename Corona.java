class Corona{
	public static void getDetailsOfCovidPatients(String name,int age,String from,String admitted,String admittedto,int infectedDays,String alive,String discharge){
		System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"From:"+from+"\n"+"Admitted:"+admitted+"\n"+"Admmitted To:"+admittedto+"\n"+"Infected Days:"+infectedDays+" Days"+"\n"+"Alive:"+alive+"\n"+"Discharge:"+discharge);
	}
	public static void main(String[] args){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~START~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("--------------------------Patient Info 1---------------------------------");
		getDetailsOfCovidPatients("Babu",22,"Bangalore","Yes","NIMHANS",25,"Yes","Done");
		System.out.println("--------------------------Patient Info 2---------------------------------");
		getDetailsOfCovidPatients("Vinod",29,"Gadag","Yes","ST. Jhons",15,"Yes","Done");
		System.out.println("--------------------------Patient Info 3---------------------------------");
		getDetailsOfCovidPatients("Rakshitha",18,"Kolar","Yes","Victoria",05,"Yes","Done");
		System.out.println("--------------------------Patient Info 4---------------------------------");
		getDetailsOfCovidPatients("Pooja",19,"Kolar","Yes","Victoria",25,"Yes","Done");
		System.out.println("--------------------------Patient Info 5---------------------------------");
		getDetailsOfCovidPatients("Sujan",22,"Bangalore","Yes","KIDWAI",36,"Yes","Done");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~END~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}