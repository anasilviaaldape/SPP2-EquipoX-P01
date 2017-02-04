/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        //Variables
        int opEntrada;
        int opEntrada1, opEntrada2;
        double cantidad, r;
        
        //Menu Pricipal
        System.out.println("Bienvenido a la Ccalculadora de Conversiones!");
        System.out.println(" ");
        System.out.println("MENU:");
        System.out.println("1. Conversión de líquidos");
        System.out.println("2. Conversión de distancias");
        System.out.println("3. Conversión de temperaturas");
        System.out.println("4. Conversión de pesos");
        System.out.println("5. Salir.");
        //Elegir opción
        System.out.println("Elija la opción que desee ejecutar:");
        opEntrada= teclado.nextInt();
         
        
        //Menus secundarios
        switch (opEntrada){
            case 1: 
                System.out.println(" ");
                System.out.println("Bienvenido a la conversión de liquidos");
                switch (pedirTipo()){
                    case 1:
                        System.out.print("Cantidad de litros:");
                        cantidad= teclado.nextDouble();
                        r= cantidad*0.264172;
                        System.out.println(cantidad+ " litros equivalen a " +r+ "galones");
                        break;
                    case 2:
                        System.out.println("Cantidad de galones");
                        cantidad= teclado.nextDouble();
                        r= cantidad/0.264172;
                        System.out.println(cantidad+ " galones equivalen a " +r+"galones");
                        break;
                    default:
                        System.out.println("Adiós :)!");
                }
                break;
                
            case 2:
                System.out.println(" ");
                System.out.println("Bienvenido a la conversión de distancias");
                switch (pedirTipo()){
                    case 1: 
                        System.out.println(" ");
                        System.out.println("Unidades:");
                        System.out.println("1.  Cm -> Pulgadas");
                        System.out.println("2.  Metros -> Pies");
                        System.out.println("3.  Km -> Millas");
                        System.out.print("Elige la conversión que desees ejecutar:");
                        opEntrada2= teclado.nextInt();
                        switch (opEntrada2){
                            case 1:
                                System.out.println(" ");
                                System.out.print("Cantidad de centímetros:");
                                cantidad= teclado.nextDouble();
                                r= cantidad/2.54;
                                System.out.println(cantidad+ " centímetros equivalen a " +r+ " pulgadas");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.println("Cantidad de metros");
                                cantidad= teclado.nextDouble();
                                r= cantidad*3.28084;
                                System.out.println(cantidad+ " metros equivalen a " +r+" pies");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.println("Cantidad de kilometros");
                                cantidad= teclado.nextDouble();
                                r= cantidad*0.621371;
                                System.out.println(cantidad+ " kilometros equivalen a " +r+" millas");
                                break;
                            default:
                                System.out.println("Adiós :)!");
                        }
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("Unidades:");
                        System.out.println("1.  Pulgadas -> Cm");
                        System.out.println("2.  Pies -> Metros");
                        System.out.println("3.  Millas -> Km");
                        System.out.print("Elige la conversión que desees ejecutar:");
                        opEntrada2= teclado.nextInt();
                        switch (opEntrada2){
                            case 1:
                                System.out.println(" ");
                                System.out.print("Cantidad de pulgadas:");
                                cantidad= teclado.nextDouble();
                                r= cantidad*2.54;
                                System.out.println(cantidad+ " pulgadas equivalen a " +r+ " centímetros");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.println("Cantidad de pies");
                                cantidad= teclado.nextDouble();
                                r= cantidad/3.28084;
                                System.out.println(cantidad+ " pies equivalen a " +r+" metros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.println("Cantidad de millas");
                                cantidad= teclado.nextDouble();
                                r= cantidad/0.621371;
                                System.out.println(cantidad+ " millas equivalen a " +r+" kilometros");
                                break;
                            default:
                                System.out.println("Adiós :)!");
                        }
                }
                break;
                
            case 3: 
                System.out.println(" ");
                System.out.println("Bienvenido a la oconversión de temperaturas");
                switch (pedirTipo()){
                    case 1:
                        System.out.print("Cantidad de °C:");
                        cantidad= teclado.nextDouble();
                        r= cantidad*1.8 + 32;
                        System.out.println(cantidad+ " °C equivalen a " +r+ " °F");
                        break;
                    case 2:
                        System.out.println("Cantidad de °F");
                        cantidad= teclado.nextDouble();
                        r= (cantidad-32)*5/9;
                        System.out.println(cantidad+ " °F equivalen a " + r + " °C");
                        break;
                    default:
                        System.out.println("Adiós :)!");
                }
                break;
                
            case 4: 
                System.out.println(" ");
                System.out.println("Bienvenido a la conversión de pesos");
                switch (pedirTipo()){
                    case 1:
                        System.out.print("Cantidad de gramos:");
                        cantidad= teclado.nextDouble();
                        r= cantidad*0.0022046;
                        System.out.println(cantidad+ " gramos equivalen a " +r+ " libras");
                        break;
                    case 2:
                        System.out.println("Cantidad de libras");
                        cantidad= teclado.nextDouble();
                        r= cantidad/0.0022046;
                        System.out.println(cantidad+ " libras equivalen a " +r+" gramos");
                        break;
                    default:
                        System.out.println("Adiós :)!");
                }
                break;
            default:
                    System.out.println("Adios!:)");
               
        }
        
    
    
    
        
    }
    static int pedirTipo(){
        int opEntrada1;
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("Conversiones: ");
        System.out.println("1.    Decimal -> Inglés");
        System.out.println("2.    Inglés -> Decimal");
        System.out.print("Elija el tip de conversión: ");
        opEntrada1= teclado.nextInt(); 
        return opEntrada1;
    }
   
}

        
