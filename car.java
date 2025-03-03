public class Car{//defining the class name

   public String car_brand;//defining the car brand
   public String car_model;//defining the car name

   public String car_color;//defining the car color
   
   public String car_fuel;//defining the car fuel type
   public int mileage;//defining the car mileage

//creating the constuter to assign the value to the variables
public Car(String car_brand, String car_model , String car_color,String car_fuel, int mileage ){
   this.car_brand=car_brand;
   this.car_model=car_model;
   this.car_color=car_color;
   
   this.car_fuel=car_fuel;
   this.mileage=mileage;

}
//creating the methods
public void start(){
   System.out.println("The car has been started.");
}
public void stop(){
   System.out.println("The car has been stopped.");
}
public void service(){
   System.out.println("The car has been in service.");
}
public static void main(String[] args) { //creating the objects
   Car car_1= new Car("Audi","Q8","Red","Petrol",20);
         System.out.println("Car brand is "+car_1.car_brand+", Car model is "+car_1.car_model+", Car color is "+car_1.car_color+", Car fuel type is "+car_1.car_fuel+", Car mileage is "+car_1.mileage+".");

   car_1.start();
   car_1.stop();
   car_1.service();
    Car car_2= new Car("BMW","M4","Blue","Petrol",10);
         System.out.println("Car brand is "+car_2.car_brand+", Car model is "+car_2.car_model+", Car color is "+car_2.car_color+", Car fuel type is "+car_2.car_fuel+", Car mileage is "+car_2.mileage+".");

   car_2.start();
   car_2.stop();
   car_2.service();
       Car car_3= new Car("Benz","G-WAGON","Black","Diesel",15);
         System.out.println("Car brand is "+car_3.car_brand+", Car model is "+car_3.car_model+", Car color is "+car_3.car_color+", Car fuel type is "+car_3.car_fuel+", Car mileage is "+car_3.mileage+".");

   car_3.start();
   car_3.stop();
   car_3.service();


}
}