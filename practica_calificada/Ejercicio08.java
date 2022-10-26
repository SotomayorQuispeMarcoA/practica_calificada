/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_calificada;

/**
 *
 * @author USER
 */
public class Ejercicio08 {
      
public static void main(String[] args) {
        String[] productos={"plancha","licuadora","lavadora","cocina"};
        double[] precios={85,120,590,700};
        double suma=0,descuento=1;
        for(int i=0;i<precios.length;i++)
            suma+=precios[i];
        if(suma>1200){
            descuento=(17*suma)/100;
            System.out.println("aaaaa");
        }
            
        System.out.println("Productos");
        for(int i=0;i<precios.length;i++)
            System.out.print(productos[i]+" => "+precios[i]+"\n");
        System.out.println("Precio total  => "+suma);
        System.out.println("Descuento de  => "+descuento);
        suma=suma-descuento;
        System.out.println("Monto a pagar => "+suma);
    }
}