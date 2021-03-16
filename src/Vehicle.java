public class Vehicle {
    private String companyName;
    private String modelName;
    private int price;
    private int registrationNum;

    Vehicle(String companyName, String modelName, int registrationNum, int price){
        this.companyName = companyName;
        this.modelName = modelName;
        this.registrationNum = registrationNum;
        this.price = price;

    }

    public class Tyre{
        private String tyreCompany;
        private String vehicleType;
        
        Tyre(String tyreCompany, String vehicleType){
            this.tyreCompany = tyreCompany;
            this.vehicleType = vehicleType;
        }

        public String getVehicleType() {
            return vehicleType;
        }

        public String getTyreCompany() {
            return tyreCompany;
        }
    }

    public String getCompanyName() {
        return companyName;
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
}