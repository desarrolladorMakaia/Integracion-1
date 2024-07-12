package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        //Given  =  Teniendo o lo necesario para el test
        int numberA = 3;
        int numberB = 3;

        //When =  Cuando
        int result = example.sumar(numberA, numberB);

        // Then = Entonces
        assertNotNull(result);    // verifica que la respuesta no sea nula}
        assertEquals(6, result);  // valor esperado y valor actual
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void chequearPositivo(){
        //Given
        int number = 4;

        //When
        boolean result = example.chequearPositivo(number);

        //Then
        assertTrue(result);
    }

    @Test
    public void testChequearPositivoError(){
        //given
        int number = -4;

        //Then
        assertThrows(IllegalArgumentException.class,() ->{
            example.chequearPositivo(number);
        });

    }

    @Test
    public void contarLetrasA(){

        String cadena = "juanmanuel";

        int result = example.contarLetrasA(cadena);

        assertNotNull(result);
        assertEquals(2,result);

    }




}
