/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ULISES
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("1***********************");
        /**
         * try-cactch
         */
        try{
            String mensajes[] = {"Antonio", "Javier", "Gabriela"};
            for(int i = 0; i < 4; i++){
                System.out.println(mensajes[i]); 
            }
            }catch(ArrayIndexOutOfBoundsException aie){
                System.out.println("Error: Apuntador fuera de rango");
            }
        
        
        System.out.println("2************************");
        Scanner reader = new Scanner(System.in);
        float equis = 0;
        float equis2 = 0;
        /**
         * try-catch
         */
        try{
            System.out.println("Ingresa tu primer numero: ");
            equis = reader.nextInt();
            System.out.println("Ingresa tu segundo numero: ");
            equis2 = reader.nextInt();
            if(equis2 == 0){
                throw new ArithmeticException();
                } float x = equis / equis2;
            System.out.println("El resultado de tu operacion es: " +x);
        }catch (InputMismatchException ime){
            System.out.println("Error no insertaste un numero");
        }catch(ArithmeticException ae){
            System.out.println("Error: División entre 0");
        }finally{
            System.out.println("Apesar de todo, se ejecuta finally");
        }
        
        
        System.out.println("3************************");
        /**
         * try-catch
         */
        try{
            float equis3 = 0;
            float equis4 = 0;
            System.out.println("Ingresa tu primer numero: ");
            equis3 = reader.nextInt();
            System.out.println("Ingresa tu segundo numero: ");
            equis4 = reader.nextInt();
            if(equis4 == 0){
                throw new ArithmeticException();
                } float x = equis3 / equis4;
            System.out.println("El resultado de tu operacion es: " +x);
        }catch (InputMismatchException ime){
            System.out.println("Error no insertaste un numero");
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: Apuntador fuera de rango");
        }catch(ArithmeticException ae){
            System.out.println("Error: División entre 0");
        }catch(Exception e){
            System.out.println("Excepcion general");
        }finally{
            System.out.println("Apesar de todo, se ejecuta finally");
        }
        System.out.println("Fuera del Try-catch");
        
        System.out.println("4************************");
        /**
         * trycatch
         */
        try{
            int x = 0;
            int x2 = 0;
            System.out.println("Ingresa tu primer numero: ");
            x = reader.nextInt();
            System.out.println("Ingresa tu segundo numero: ");
            x2 = reader.nextInt();
            int division = division(x,x2);
            System.out.println("Division = "+division);
        }catch (InputMismatchException ime){
            System.out.println("Error no insertaste un numero");
        }catch(ArithmeticException e){
            System.out.println("Excepcion Aritmetica");  
        }
        
        System.out.println("5************************");
        /**
         * try-catch
         */
        try{
            int m = 0;
            int n = 0;
            System.out.println("Ingresa tu primer numero: ");
            m = reader.nextInt();
            System.out.println("Ingresa tu segundo numero: ");
            n = reader.nextInt();
            int division = division(m,n);
            System.out.println("Division = "+division);
        }catch (InputMismatchException ime){
            System.out.println("Error no insertaste un numero");
        }catch(ArithmeticException e){
            System.out.println("Excepcion Aritmetica");  
        }
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException 
     */
    public static int division(int a, int b) throws ArithmeticException{
    return a / b;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return
     * @throws ArithmeticException 
     */
    public static int division2(int a, int b) throws ArithmeticException{
        /**
         * metodo if
         */
        if(b == 0){
            throw new ArithmeticException();
        }int c = a / b;
        return c;
    }
 }

