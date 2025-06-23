package _15_This_Super_Keywords.PracticeSession;

public class Employee {

    public void show(){
    System.out.println("This is Employee class");
    }
      public class Manager extends Employee {
        @Override
        public void show() {
            super.show();
            System.out.println("This is Manager class.");
        }
    }


}
