class Mobile{
	public static float getTotalPrice(String brand,String color,String model,float price,int quantity,int imei,String country){
		System.out.println("Brand of Mobile:"+brand+"\n"+"Color:"+color+"\n"+"Model"+model+"\n"+"Price:"+price+"rs"+"\n"+"Quantity:"+quantity+" nos"+"\n"+"IMEI:"+imei+"\n"+"Country:"+country);
		float totalPrice=price*quantity;
		return totalPrice;
	}
	public static void main(String[] args){
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Price="+getTotalPrice("Iphone","Red","6S",65000,5,456456456,"India"));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Price="+getTotalPrice("Iphone","White","12 Pro",95000,8,456113446,"India"));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Price="+getTotalPrice("Samsung","Black","S20",90000,11,123456456,"South Korea"));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Price="+getTotalPrice("One-Plus","Grey","8",45000,15,156458956,"India"));
		System.out.println("----------------------------------------------------------------");
		System.out.println("Total Price="+getTotalPrice("Iphone","Space Grey","12 Pro Max",125000,7,896456456,"India"));
		System.out.println("----------------------------------------------------------------");
		}
		
}