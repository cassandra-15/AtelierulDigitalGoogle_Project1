package Cafenea;

public class Magazin {
    public static void main(String[] args) {
        Coffe coffe=new Coffe.UserBuilder("Espresso",10).build();
        Coffe coffe1=new Coffe.UserBuilder("Espresso",10).typeEspresso("Macchiato").hasMilk(true).hasSugar(true).build();
        Coffe coffe2=new Coffe.UserBuilder("Cappucino",6).hasMilk(true).build();
        Coffe coffe3=new Coffe.UserBuilder("Americano",5).hasSugar(true).build();
        Coffe coffe4=new Coffe.UserBuilder("Flat White",10).hasMilk(true).hasSugar(true).build();
        System.out.println(coffe+"\n"+coffe1+"\n"+coffe2+"\n"+coffe3+"\n"+coffe4);
    }
}
