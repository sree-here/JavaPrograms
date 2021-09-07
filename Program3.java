class Program3{
	public static void main(String args[]){

String HospitalName[]={"kims","manipal","gongotri","fortis","mallaya","st. jhons","nimhans","sanjaygandhi","rajeevGandhi","indiragandhi","msr","victoria","apollo","colombia asia","narayana hrudayala","narayana nethralaya","healthcare"};
System.out.println(HospitalName.length);
for (int i=17;i<=HospitalName.length;i--){// 16, true, 15
//System.out.println("index"+i); 
	if(i<=0)break;
	System.out.println(HospitalName[i-1]);
	
	}
	}

}