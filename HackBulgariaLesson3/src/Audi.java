
public class Audi extends Car implements Mileage{
	private String brand;
	private int mileage;
	public Audi(){
		brand = "Audi";
		setMileage(0);
	}
	public Audi(int mileage){
		brand = "Audi";
		setMileage(mileage);
	}
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}
	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
