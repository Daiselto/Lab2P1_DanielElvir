/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_danielelvir;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Lab2P1_DanielElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        boolean continuar=true;
        while(continuar){
        System.out.println("1. Clasificando Numeros");
        System.out.println("2. Aproximando PI");
        System.out.println("3. MCD");
        System.out.println("4. Salir del programa");
        System.out.println("Ingrese una opcion");
        int opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    boolean positivo=true;
                    
                    System.out.println("Ingrese el numero que desea evaluar:");
                    int clasificado=leer.nextInt();
                    while(positivo){
                    if (clasificado<0){
                        System.out.println("Solo puede ingresar numeros positivos");
                        positivo=false;
                    }else
                        positivo=false;
                    }// fin del while para validar
                        int contador_ciclo=1;
                        int contador_cero=0;
                        boolean par=true;
                        boolean impar=true;
                        boolean primo=true;
                        boolean no_primo=true;
                        while(contador_ciclo<=clasificado){
                            if(clasificado%contador_ciclo==0){
                                contador_cero ++;
                            }
                            contador_ciclo ++;
                        }       
                
                        if(contador_cero==2&&clasificado%2==0){
                             impar=false;
                             no_primo=false;
                        }else if(contador_cero==2&&clasificado%2==1){
                            par=false;
                            no_primo=false;
                        }else if(contador_cero>2&&clasificado%2==0){
                            impar=false;
                            primo=false;
                        }else if(contador_cero>2&&clasificado%2==1){
                            par=false;
                            primo=false;
                        }
                        
                        if(par==true&&primo==true){
                            System.out.println("El numero ingresado es par y primo");
                        }else if(par==true&&no_primo==true){
                            System.out.println("El numero es ingresado es par");
                        }else if(impar==true&&no_primo==true){
                            System.out.println("El numero ingresado es impar");
                        }else if(impar==true&&primo==true){
                            System.out.println("El numero ingresado es impar y primo");
                        }
                    continuar=true;
                break;
                case 2:
                    boolean validar=true;
                    System.out.println("Ingrese la precisión del calculo:");
                    int numero=leer.nextInt();
                    while(validar){
                        if(numero<0){
                            System.out.println("Solo numeros positivos");
                            validar=false;
                        }else
                            validar=false;
                    }
                    int contador_i=1;
                    double sumatorio=1;
                    while(numero>=contador_i){
                        double potencia=Math.pow(contador_i, 2);
                        System.out.println(potencia);
                        double numerador=4*potencia;
                        System.out.println(numerador);
                        double denominador=(4*potencia)-1;
                        System.out.println(denominador);
                        double fraccion=(numerador)/(denominador);
                        System.out.println(fraccion);
                        sumatorio=(fraccion*sumatorio);
                        contador_i++;
                    }
                    sumatorio*=2;
                    System.out.println("PI:" + sumatorio);
                break;
                case 3: 
                    boolean negativo=true;
                    System.out.println("Ingrese A:");
                    int valorA=leer.nextInt();
                    System.out.println("Ingrese B");
                    int valorB=leer.nextInt();
                    
                    
                        if(valorA<=0||valorB<=0){
                            System.out.println("Solo numeros positivos");
                            negativo=false;
                        }else
                            negativo=true;   
                    if(negativo){
                        int mayor = 0;
                    int menor = 0;
                    if (valorA > valorB) {
                        mayor = valorA;
                        menor = valorB;
                    } else if (valorB > valorA) {
                        mayor = valorB;
                        menor = valorA;
                    }
                    int resta = 0;
                    while (mayor != menor) {
                        if (mayor > menor) {
                            mayor = mayor - menor;
                        } else if (menor > mayor) {
                            menor = menor - mayor;
                        }
                    }

                    resta = mayor;

                    System.out.println("El MCD de " + valorA + " y " + valorB + " es " + resta);
                    }
                    
                    
                continuar=true;
                break;
                case 4:
                    continuar=false;
                break;
                
                default:
                    if(opcion!=5){
                        System.out.println("Error");
                    }//If del error
            }
            }//fin del switch principal
            
        }// fin del while principal
        // TODO code application logic here
    }// fin del main
    
