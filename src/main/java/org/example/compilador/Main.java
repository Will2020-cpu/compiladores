package org.example.compilador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cadena;

        Scanner entrada = new Scanner(System.in);

        cadena = entrada.nextLine();

        if (esHoraMilitar(cadena)){
            System.out.println("Es hora militar");
        }else {
            System.out.println("No es hora militar");
        }
    }

    public static boolean esHoraMilitar(String cadena){
        int i, estado = 0;
        char car;
        for (i = 0; i< cadena.length(); i++){
            car  = cadena.charAt(i);
            switch (estado){
                case 0:
                    if(car == '0' || car == '1'){
                        estado = 1;
                    }else if (car == '2'){
                        estado = 2;
                    }else {
                        return false;
                    }
                    break;
                case 1:
                    if (car >= '0' && car  <= '9'){
                        estado = 3;
                    }else {
                        return false;
                    }
                    break;
                case 2:
                    if(car >= '0' && car <= '3'){
                        estado = 3;
                    }else {
                        return false;
                    }
                    break;
                case 3:
                    if (car == ':') {
                        estado = 4;
                    }else {
                        return false;
                    }
                    break;
                case 4:
                    if(car >= '0' && car <= '5'){
                        estado = 5;
                    }else {
                        return false;
                    }
                    break;
                case 5:
                    if (car >= '0' && car <= '9'){
                        estado = 6;
                    }else {
                        return false;
                    }
                    break;
                case 6:
                    if (car == ':'){
                        estado = 7;
                    }else {
                        return false;
                    }
                    break;
                case 7:
                    if(car >= '0' && car <= '5'){
                        estado = 8;
                    }else {
                        return false;
                    }
                    break;
                case 8:
                    if (car >= '0' && car <= '9'){
                        estado = 9;
                    }else {
                        return false;
                    }
                break;
                default:
                    return false;
            }
        }

        return estado == 9;
    }

}
