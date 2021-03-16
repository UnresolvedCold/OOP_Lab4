public class Vehicle {

	private String companyName;
	private String modelName;
	private int price;
	private int registrationNum;
	

	Vehicle(String companyName, String modelName, int registrationNum, int price){
		this.registrationNum = registrationNum;
		this.companyName = companyName;
		this.modelName = modelName;
		this.price = price;
	}

    public class Tyre{
		private String tyreCompany;
		

		private String vehicleType;
		
		
		Tyre(String tyreCompany, String vehicleType)
		{
			this.vehicleType = vehicleType;
			this.tyreCompany = tyreCompany;
			
		}
		
		public String getTyreCompany() {
			return tyreCompany;
		}
		
		public String getVehicleType() {
			return vehicleType;
		}
	}
	

	
	public String getModelName() {
		return modelName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getRegistrationNum() {
		return registrationNum;
	}
	
    public String getCompanyName() {
		return companyName;
	}
	

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

}