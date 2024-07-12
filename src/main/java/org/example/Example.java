package org.example;

import java.util.List;

public class Example {

    //1. Metodo para sumar dos numeros

    public int sumar(int a, int b){
        return a + b;
    }


    //2. Metodo que lanza una excepcion si el argumento es negativo
    public boolean chequearPositivo(int numero){
        if (numero < 0 ){
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        return true;
    }

    //3. Metodo que cuente el numero de letras en una cadena
    public int contarLetrasA(String cadena){
        return (int) cadena.chars()
                .filter(letra -> letra == 'a')
                .count();
    }

    //4. Metodo que me retorne un Boolean si la lista contiene el elemento
    public boolean contieneElemento(List<String> lista, String elemento){
        return lista.contains(elemento);
    }

    //5. Metodo para revertir una cadena
    public String revertirCadena(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

}
