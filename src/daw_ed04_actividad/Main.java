/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        final String nombre_cliente = "Pepe Fernández";
        
        
        cuenta1 = new CCuenta(nombre_cliente,"1023-2464-90-1232256789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual );

         System.out.println("El cliente de la cuenta es: " +nombre_cliente);
        
        opera(cuenta1, 100, 100);
    }

    public static void opera(CCuenta cuenta1, float cantRetirar, float cantIngresar) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
