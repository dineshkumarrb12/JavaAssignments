package inheri_poly_cons;

public  class Biriyani implements MainCourse {

	private int price=120;
	private int quantity;
	public Biriyani(int quantity)
	{
		this.quantity=quantity;
	}
	
	/*public int packagesize() {
		return packagesize(quantity);
	}*/
	public int packagesize(int quantity) {
		this.quantity=quantity;
		int packsize=0;
		if(quantity%4==0)
		{
			packsize=quantity/4;
			System.out.println("Your PACKAGE: "+ packsize);	
		}
		else
		{
			packsize=(quantity/4) + 1;
			System.out.println("Your PACKAGE: " + packsize);
		}
		System.out.println(quantity);
		return quantity;
	
	}	
	public void calculateprice() {
		
		double total=(quantity*this.price) + (quantity * tax);
		System.out.println("Your total price is:" + total);

		//1=120	+ 6.5
		//2= 240+13

	}
//

}
