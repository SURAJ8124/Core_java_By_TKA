package _11_Abstraction.Interface.HomeWork.Question3;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Cow implements Animal {

    @Override
    public void sound() {
        System.out.println("MOO MOO Moo");
    }

    @Override
    public void color() {
        System.out.println("My Color is black");

    }
    Cow(){
        System.out.println("I am cow.");
    }
}
