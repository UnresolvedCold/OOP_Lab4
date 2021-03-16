public class Showroom {
    private Bike[] bikes;
    private Car[] cars;
    private int	currentAccountBalance;	
    private static int	MAX_BIKES=15;	
    private static int	MAX_CARS=10;	
    private int	numBikes;
    private int	numCars;
    private int	showroomId;

    Showroom(int showroomId){
        this.showroomId = showroomId;
        this.numCars = 10;
        this.numBikes =15;
        this.currentAccountBalance = 10000;
        cars = new Car[MAX_CARS];
        bikes = new Bike[MAX_BIKES];
    }

    void addBike(Bike bikeToAdd){
        if(numBikes+1<=MAX_BIKES){
            bikes[numBikes] = bikeToAdd;
            numBikes++;
        }
    }

    void addCar(Car carToAdd){
        if(numCars+1<=MAX_CARS){
            cars[numCars] = carToAdd;
            numCars++;
        }
    }

    boolean buyBike​(String companyName, String modelName, int maxPrice)
    {
        boolean f = false;
        if(this.currentAccountBalance >= maxPrice)
        {
            this.currentAccountBalance = this.currentAccountBalance - maxPrice;
            Bike ob = new Bike();
            addBike(ob);
            f = true;
        }
        return f;
    }

    public void removeBike(int bikeIdx){
        int pivot = 0 ;
        for(int i=0;i<numBikes+pivot;i++){
            if(bikes[i].getRegistrationNum() == bikeIdx){
                pivot++;
                numBikes--;
                continue;
            }
            
            bikes[i-pivot] = bikes[i];
        }
    }

    public void removeCar(int carIdx){
        int pivot = 0 ;
        for(int i=0;i<numCars+pivot;i++){
            if(cars[i].getRegistrationNum() == carIdx){
                pivot++;
                numCars--;
                continue;
            }
            
            cars[i-pivot] = cars[i];
        }
    }

    Car sellCar(int carIdx){
       
        Car c;
        for(int i=0;i<numCars;i++){
            if(cars[i].getRegistrationNum() == carIdx){
                c = cars[i];
            }
        }

        currentAccountBalance += c.getPrice();
        removeCar(carIdx);
        return c;
    }

    Bike sellBike(int bikeIdx){
       
        Bike c;
        for(int i=0;i<numBikes;i++){
            if(bikes[i].getRegistrationNum() == bikeIdx){
                c = bikes[i];
            }
        }

        currentAccountBalance += c.getPrice();
        removeCar(bikeIdx);
        return c;
    }   

    public Bike[] getBikes() {
        return this.bikes;
    }

    public void setBikes(Bike[] bikes) {
        this.bikes = bikes;
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getCurrentAccountBalance() {
        return this.currentAccountBalance;
    }

    public void setCurrentAccountBalance(int currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    public int getNumBikes() {
        return this.numBikes;
    }

    public void setNumBikes(int numBikes) {
        this.numBikes = numBikes;
    }

    public int getNumCars() {
        return this.numCars;
    }

    public void setNumCars(int numCars) {
        this.numCars = numCars;
    }

    public int getShowroomId() {
        return this.showroomId;
    }

    public void setShowroomId(int showroomId) {
        this.showroomId = showroomId;
    }



}
