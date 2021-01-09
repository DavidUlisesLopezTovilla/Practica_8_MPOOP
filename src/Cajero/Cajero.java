/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ULISES
 */
public class Cajero {
    public static void main(String[] args) {
       /**
        * creacionde objeto
        */
       Cuenta cuenta = new Cuenta();
       double monto1 = 0;
       cuenta.depositar(monto1);
       /**
        * creacion de try-catch
        */
        try {
            cuenta.retirar(monto1);
            cuenta.retirar(monto1);
            cuenta.retirar(monto1);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo insuficiente");
        }
    }
  
}
