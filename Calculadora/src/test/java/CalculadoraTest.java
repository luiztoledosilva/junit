/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testSomar() {
        System.out.println("somar");
        int n1 = 5;
        int n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0);
    }
 
    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        int n1 = 5;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 2;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0);
    }
 
    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int n1 = 2;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0);
    }
 
    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 5;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 2.5;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0);
    }
}
