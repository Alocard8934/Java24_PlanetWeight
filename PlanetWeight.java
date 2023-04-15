package JAVA24;

public class PlanetWeight {
    public static void main(String[] args) {
        System.out.print("Your weight on planet Earth will be: ");
        double weight = 80;
        System.out.println(weight);
        
        System.out.print("Your weight on Mercury will be: ");
        double mercury = weight*.378;
        System.out.println(mercury);
        
        System.out.print("Your weight on the Moon will be: ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.print("Your weight on Jupiter will be: ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
    }
}
