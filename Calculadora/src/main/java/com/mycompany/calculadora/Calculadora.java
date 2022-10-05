/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    // atributo
        private int resultado = 0;
 
        // método somar
        public double somar( int n1, int n2 ){
 
            resultado = n1 + n2;
            return resultado;
        }
 
        // método subtrair
        public double subtrair( int n1, int n2 ){
 
            resultado = n1 - n2;
            return resultado;
        }        
 
        // método multiplicar
        public double multiplicar( int n1, int n2 ){
 
            resultado = n1 * n2;
            return resultado;
        }
 
        // método dividir
        public double dividir( int n1, int n2 ){
 
            resultado = n1 / n2;
            return resultado;
        }
}
