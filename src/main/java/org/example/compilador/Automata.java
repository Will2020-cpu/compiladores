package org.example.compilador;

public class Automata {
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

    public static boolean esTipoDeDato(String cadena){
        int estado = 0;
        char car;

        for (int i = 0; i<cadena.length(); i++){
            car = cadena.charAt(i);
            switch (estado){
                case 0:
                    if(car == 'i'){
                        estado = 1;
                    } else if (car == 'l') {
                        estado = 3;
                    }else if (car == 's'){
                        estado = 11;
                    }
                    else {
                        return false;
                    }
                    break;
                case 1:
                    if (car == 'n'){
                        estado = 2;
                    }else {
                        return false;
                    }
                    break;
                case 2:
                    if(car == 't'){
                        estado = 6;
                    }
                    break;
                case 3:
                    if (car == 'o'){
                        estado = 4;
                    }else {
                        return false;
                    }
                    break;
                case 4:
                    if (car == 'n'){
                        estado = 5;
                    }else {
                        return false;
                    }
                    break;
                case 5:
                    if (car == 'g'){
                        estado = 6;
                    }else {
                        return false;
                    }
                    break;
                case 6:
                    if (car == ' '){
                        estado = 7;
                    }else {
                        return false;
                    }
                    break;
                case 7:
                    if ((car >= 'a' && car <= 'z') || (car == '_') || (car > 'A' && car <= 'Z')){
                        estado = 8;
                    }else {
                        return false;
                    }
                    break;
                case 8:
                    if ((car >= 'a' && car <= 'z') || (car == '_') || (car > 'A' && car <= 'Z') || (car >= '0' && car <= '9')){
                        estado = 8;
                    }else if(car == '='){
                        estado = 9;
                    }
                    else {
                        return false;
                    }
                    break;
                case 9:
                    if(car >= '0' && car <= '9'){
                        estado = 9;
                    }else if (car == ';'){
                        estado = 10;
                    }else {
                        return false;
                    }
                    break;
                case 11:
                    if (car == 'h'){
                        estado = 12;
                    }else {
                        return false;
                    }
                break;
                case 12:
                    if (car == 'o'){
                        estado = 13;
                    }else {
                        return false;
                    }
                break;
                case 13:
                if  (car == 'r'){
                    estado = 14;
                }else {
                    return false;
                }
                break;
                case 14:
                    if (car == 't'){
                        estado = 6;
                    }else {
                        return false;
                    }
                break;
            }
        }

        return estado == 10;
    }
}
