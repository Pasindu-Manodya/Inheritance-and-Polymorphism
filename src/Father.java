public class Father {
    String surname = "Mapatuna";
    String vehicle = "Premio";

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    public void newCar(){
        System.out.println("BMW will be bought");
    }
    public void newCar(int price){
        for (int i = 1; i <= 2; i++){
            System.out.println("premio will be sold");
        }
    }
}
