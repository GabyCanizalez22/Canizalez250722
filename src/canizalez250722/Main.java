/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canizalez250722;

/**
 *
 * @author Gaby Martinez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("50 grados centigrados a farhrenteit " + celsius_a_fahrenheit()+ "f"); 
   System.out.println("50 grados centigrados a farhrenteit " + celsius_a_kelvin()+ "k"); 
   System.out.println ("50 grados centigrados a farhrenteit " + celsius_a_rankie()+ "r"); 
   System.out.println("30 grados fahrenheit a celsius "  + fahrenheit_a_celsius() + "c");
   System.out.println("30 grados fahrenheit a kelvin " + fahrenheit_a_kelvin() + "k");
   System.out.println("30 grados fahrenheit a rankie " + fahrenheit_a_rankie ()+ "r");
   System.out.println("1 gradokelvin a celsius" + kelvin_a_celsius ()+ "c");
   System.out.println("1 grado kelvin a fahrenheit" + kelvin_a_fahrenheit()+ " F");
   System.out.println("1 grado kelvin a rankie " + kelvin_a_rankie ()+ "r");
   System.out.println("1 grado rankie a celsius" + rankie_a_celsius () + "c");
   System.out.println("1 grado rankie a fahrenheit" + rankie_a_fahrenheit()+ "F");
   System.out.println("1 grado rankie a kelvin " + rankie_a_kelvin () + "K");

    }
    
    public static double celsius_a_fahrenheit(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9) / 5)+32;
    
    } 
    public static double celsius_a_kelvin(){
        double grados_centigrados  = 50.0;
        return grados_centigrados + 273;
        
    }
    public static double celsius_a_rankie(){
        double grados_centigrados = 50.0;
        return ((grados_centigrados * 9)) / 5 +491.67;
    }
    public static double fahrenheit_a_celsius(){
        double grados_fahrenheit= 30.0;
        return (( grados_fahrenheit - 32)) *5 / 9;
    }
    public static double fahrenheit_a_kelvin(){
        double grados_fahrenheit = 30.0;
        return ((grados_fahrenheit - 32 ) *5 / 9) + 273.15;
    }
    
   public static double fahrenheit_a_rankie(){
       double grados_fahrenheit = 30.0;
       return ((grados_fahrenheit  -32 ) * 5 / 9 ) + 491.61;
   }
   
   public static double kelvin_a_celsius(){
       double grados_kelvin = 1.0;
       return (grados_kelvin) - 273.15;  
   }
   public static double kelvin_a_fahrenheit(){
       double grados_kelvin = 1.0;
       return((grados_kelvin -273.15)*9 /5)+32;
   }
   public static double kelvin_a_rankie(){
       double grados_kelvin = 1.0;
       return (grados_kelvin * 9)/5;
   }
   
   public static double rankie_a_celsius(){
       double grados_rankie = 1.0;
       return (grados_rankie - 491.67 ) * 5 / 9;
   }
   public static double rankie_a_fahrenheit(){
       double grados_rankie = 1.0;
       return (grados_rankie) - 459.67;
   }
   public static double rankie_a_kelvin(){
       double grados_rankie = 1.0;
       return ((grados_rankie)*5 )/9;
   }
}
