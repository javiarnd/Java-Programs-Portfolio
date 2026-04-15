package Workshops.Workshop11;

public class AirConditioner {
    String brand;
    int productionYear;
    int temperature;

    AirConditioner(){
        brand = "LG";
        productionYear = 2020;
        temperature = 75;
    }

    AirConditioner(String aBrand, int aYear, int aTemp){
        brand = aBrand;
        productionYear = aYear;
        temperature = aTemp;
    }
    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public void setProductionYear(int aYear) {
        productionYear = aYear;
    }

    public void setTemperature(int aTemp) {
        temperature = aTemp;
    }

    public String getBrand() {
        return brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemp(){
        temperature++;
    }

    public void decreaseTemp(){
        temperature--;
    }
}

class TestAirConditioner {
    public static void main(String[] args) {
        AirConditioner ac1 = new AirConditioner();
        System.out.println("Brand: " + ac1.getBrand());
        System.out.println("Production Year: " + ac1.getProductionYear());
        System.out.println("Temperature: " + ac1.getTemperature());
        ac1.increaseTemp();
        System.out.println("Temperature after increase: " + ac1.getTemperature());
        ac1.decreaseTemp();
        System.out.println("Temperature after decrease: " + ac1.getTemperature());

        AirConditioner ac2 = new AirConditioner("Samsung", 2025, 69);
        System.out.println("Brand: " + ac2.getBrand());
        System.out.println("Production Year: " + ac2.getProductionYear());
        System.out.println("Temperature: " + ac2.getTemperature());
    }
}

