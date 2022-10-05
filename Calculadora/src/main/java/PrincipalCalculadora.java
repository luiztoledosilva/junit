/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.mycompany.calculadora.Calculadora;
 import javax.swing.JOptionPane;
 
public class PrincipalCalculadora{
 
    public static void main( String args[] ){
 
        int x, y;
        String sX, sY;
 
        sX = JOptionPane.showInputDialog( null, "Digite o primeiro número:",
        "Primeiro número", JOptionPane.QUESTION_MESSAGE );
 
        x = Integer.parseInt( sX );
 
        sY = JOptionPane.showInputDialog( null, "Digite o segundo número:",
        "Segundo número", JOptionPane.QUESTION_MESSAGE );
 
        y = Integer.parseInt( sY );    
 
        // instanciação de um objeto da classe calculadora
        Calculadora calc = new Calculadora();
 
        JOptionPane.showMessageDialog(null, "somar: " +  calc.somar( x, y ) );
        JOptionPane.showMessageDialog(null, "subtrair: " +  calc.subtrair( x, y ) );
        JOptionPane.showMessageDialog(null, "multiplicar: " +  calc.multiplicar( x, y ) );
        JOptionPane.showMessageDialog(null, "dividir: " +  calc.dividir( x, y ) );    
 
        System.exit( 0 );
    }
}