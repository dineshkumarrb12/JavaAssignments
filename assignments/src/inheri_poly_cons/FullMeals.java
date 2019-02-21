package inheri_poly_cons;

public class FullMeals implements MainCourse {
	private int price=90;

	public int packagesize(int quantity) {
		int j=0;
		j=quantity/2;

		if(j==0)
		{
			System.out.println("Your ticket booked. Final Price: "+ j);	
		}
		else
		{
			int k=j+1;
			System.out.println("Your ticket booked. Final Price: " + k);

		}
		return quantity;

	}


	public void calculateprice() {
		// TODO Auto-generated method stub

	}

}
