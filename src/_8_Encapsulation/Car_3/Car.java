package _8_Encapsulation;

public class Car {
    private String model;
    private int year;
    private int price;

   public int getPrice(){
       return price;
   }
   public int getYear(){
       return year;
   }
   public String getModel(){
       return model;
   }
   public void setModel(String model){
       this.model=model;
   }
   public void setYear(int year){
       this.year=year;
   }
   public void setPrice(int price) {
       if (price > 0) {
           this.price = price;
       }
       else {
       System.out.println("Price is in the negative");

   }
   }
   public void display(){
       System.out.println("Car Model:"+ model);
       System.out.println("Car year:"+year);
       System.out.println("Car Price"+ price);
   }

}
