package com.modeling.sofka;

import com.modeling.sofka.planets.Cosmos;
import com.modeling.sofka.planets.Planet;

import java.util.Scanner;

public class MainPlanet {
    public static void main(String[] args) {


        double G = 6.67 * (Math.pow(10, -11));

        Scanner sc = new Scanner(System.in);
        Cosmos planet = new Planet();
        int count = 1;

        System.out.println("=== === === === === === === === === === === === === === === === === ");
        System.out.println("===Calcula la atraccion gravitacional de dos cuerpos planetarios===");
        System.out.println("=== === === === === === === === === === === === === === === === === ");
        System.out.println("*Cuerpo celeste 1");
        planet.setId(count);
        System.out.println("Ingrese el nombre del planeta: ");
        String p1 = planet.setName(sc.next());
        System.out.println("Ingrese la masa: ");
        double m1 = planet.setMass(Double.parseDouble(sc.next()));
        System.out.println("Ingrese la densidad: ");
        planet.setDensity(Double.parseDouble(sc.next()));
        System.out.println("Ingrese la distancia al sol: ");
        double sd1 = planet.setDistanceSun(Double.parseDouble(sc.next()));
        count +=  1;
        planet.createPlanet();
        System.out.println(planet.toString());

        planet.setId(count);
        System.out.println("Ingrese el nombre del planeta2: ");
        String p2 = planet.setName(sc.next());
        System.out.println("Ingrese la masa: ");
        double m2 = Double.parseDouble(sc.next());
        System.out.println("Ingrese la densidad: ");
        planet.setDensity(Double.parseDouble(sc.next()));
        System.out.println("Ingrese la distancia al sol: ");
        double sd2 = planet.setMass(Double.parseDouble(sc.next()));
        planet.createPlanet();
        System.out.println(planet.toString());

        mayor(sd1, sd2);
        menor(sd1, sd2);
        distance(mayor(sd1, sd2) , menor(sd1,sd2));

        System.out.println("La distancia entre los dos planetas es de: " + distance(sd1, sd2));
        System.out.println("la atraccion gravitacional entre : " + p1 + " y " + p2 + " es de: " +
                gravitationalAttraction(G, m1, m2) / distance(sd1, sd2) + "N");
    }

    public static double mayor(double sd1, double sd2){
        if(sd1 > sd2){
            return sd1;
        }else {
            return sd2;
        }
    }
    public static double menor(double sd1, double sd2){
        if(sd1 < sd2){
            return sd1;
        }else {
            return sd2;
        }
    }

    /**
     *
     * @param sd1 distancia del planeta 1 al sol
     * @param sd2 distancia del planeta 2 al sol
     * @return la diferencia real entre los dos planetas
     */
    public static double distance(double sd1, double sd2){
        double dif = sd1 - sd2;
        return dif;
    }



    /**
     *
     * @param G formula de la ley gravitacional
     * @param m1 masa del primer cuerpo
     * @param m2 masa del segundo cuerpo
     * @return
     */
    public static double gravitationalAttraction(double G, double m1, double m2){
       return(G * m1 * m2)  ;
    }
}
