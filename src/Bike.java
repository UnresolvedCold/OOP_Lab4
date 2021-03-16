public class Bike extends Vehicle{
	private Vehicle.Tyre[] tyres;
	
	Bike(String companyName, String modelName, int registrationNum, int price, String tyreCompany)
	{
		super(companyName, modelName, registrationNum, price);
		tyres = new Vehicle.Tyre[2];
		for(int i=0;i<2;i++)
		{
			tyres[i] = new Vehicle.Tyre(tyreCompany, "Bike");
		}
	}
	
	public Vehicle.Tyre[] getTyres() {
		return tyres;
	}
	
	public void changeTyres(Vehicle.Tyre[] tyres)
	{
		for(int i=0;i<2;i++)
		{
			this.tyres[i] = tyres[i];
		}

	}

    public void setTyres(Vehicle.Tyre[] tyres) {
        this.tyres = tyres;
    }

}