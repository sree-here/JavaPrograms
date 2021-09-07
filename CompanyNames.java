class CompanyNames{
	public static void compName(String[] Name){
		for(int i=0;i<Name.length;i++){
			System.out.println(Name[i]);
		}		
	}
	public static void compBrands(String[] Brands){
		for(int i=0;i<Brands.length;i++){
			System.out.println(Brands[i]);
		}
	}
	public static String mobBrands(String[] mobileBrands){
		for(int i=0;i<mobileBrands.length;i++){
			System.out.println(mobileBrands[i]);
		}
		return mobileBrands[0];
	}		
	public static String IplTeams(String[] Teams){
		for(int i=0;i<Teams.length;i++){
			System.out.println(Teams[i]);
		}
		return Teams[3];
	}

}