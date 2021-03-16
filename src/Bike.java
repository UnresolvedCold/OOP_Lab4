public class Bike extends Vehicle {
    private Tyre[] tyres;
    Bike(String companyName, modelName, registrationNum,
    int price, String tyreCompany){
        this.companyName = companyName;
        this.modelName = modelName;
        this.registrationNum = registrationNum;
        this.price = price;
        this.tyreCompany = tyreCompany;
    }

    void changeTyres(Tyre[] tyres){

    }
}
