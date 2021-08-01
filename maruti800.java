class car{
	public car(){
		System.out.println("Class Car");
	}	
	public void vehicle(){
		System.out.println("Vehicle Type : Car");
	}
}
class maruti extends car{
	public maruti(){
		System.out.println("Class maruti");
	}
	public void speed(){
		System.out.println("Max : 90Kmph");
	}	
	public void brand(){
		System.out.println("Brand : Mruti");
	}
}
class maruti800 extends maruti{
	public maruti800(){
		System.out.println("Maruti model : 800");
	}
	public void speed(){
		System.out.println("Max : 80Kmph");
	}
	public static void main(String args[]){
		maruti800 obj = new maruti800();
		obj.vehicle();
		obj.brand();
		obj.speed();
	}
}