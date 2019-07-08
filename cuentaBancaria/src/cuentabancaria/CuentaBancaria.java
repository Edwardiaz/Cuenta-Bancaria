
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author educacion
 */
public class CuentaBancaria { 

    private String nombreCliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;

    public CuentaBancaria() { 
    }

    public CuentaBancaria(CuentaBancaria cb) {
        
        this.nombreCliente = cb.nombreCliente;
        this.numeroCuenta = cb.numeroCuenta;
        this.interes = cb.interes;
        this.saldo = cb.saldo;
    }
     
    
    
    public CuentaBancaria(String nombreCliente, String numeroCuenta, double interes, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese los sieguietes campos: ");
        System.out.println("Cliente: ");
        cuenta.setNombreCliente(sc.next());
        System.out.println("Cuenta: ");
        cuenta.setNumeroCuenta(sc.next());
        System.out.println("Interes");
        cuenta.setInteres(sc.nextDouble());
        System.out.println("Saldo: ");
        cuenta.setSaldo(sc.nextDouble());
        
        if(null!=cuenta){
            System.out.println("Nombre cliente: "+cuenta.getNombreCliente());
            System.out.println("Nombre cuenta: "+cuenta.getNumeroCuenta());
            System.out.println("Nombre interes: "+cuenta.getInteres());
            System.out.println("Nombre saldo: "+cuenta.getSaldo());
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

}
