public class Car extends Vehicle{
	private Vehicle.Tyre[] tyres;
	
	Car(String companyName, String modelName, int registrationNum, int price, String tyreCompany)
	{
		super(companyName, modelName, registrationNum, price);
		tyres = new Vehicle.Tyre[4];
		for(int i=0;i<4;i++)
		{
			tyres[i] = new Vehicle.Tyre(tyreCompany, "Car");
		}
	}
	
	public Vehicle.Tyre[] getTyres() {
		return tyres;
	}
	
	public void changeTyres(Vehicle.Tyre[] tyres)
	{
		for(int i=0;i<4;i++)
		{
			this.tyres[i] = tyres[i];
		}
	}
    public void setTyres(Vehicle.Tyre[] tyres) {
        this.tyres = tyres;
    }


}