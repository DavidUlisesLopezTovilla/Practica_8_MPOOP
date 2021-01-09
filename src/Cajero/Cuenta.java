/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ULISES
 */
public class Cuenta {
    /**
     * definicion de scaner reader
     */
    Scanner reader = new Scanner(System.in);
    private double saldo;
    
    /**
     * constructor
     */
    public Cuenta() {
        this.saldo = 0;
    }
    
    /**
     * get saldo
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * 
     * @param monto
     * @return 
     */
    public double depositar(double monto){
        try{
            System.out.println("Ingresa un monto a depositar: ");
            monto = reader.nextDouble();
            System.out.println("Depositando: " + "$" + monto + " pesos");
            saldo += monto;
        }catch(InputMismatchException ime){
            System.out.println("Error no insertaste un monto correcto");
        }
        return monto;
    }
    
    /**
     * 
     * @param monto
     * @return
     * @throws SaldoInsuficienteException 
     */
    public double retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Ingrese un monto a retirar: ");
        monto = reader.nextDouble();
        System.out.println("Retirando: " + "$" + monto + " pesos");
        if(saldo<monto)
            throw new SaldoInsuficienteException(); 
        else{
             saldo -= monto;
        }
        System.out.println("Nuevo saldo es: " + saldo + " pesos");
        return monto;
    } 
} 
