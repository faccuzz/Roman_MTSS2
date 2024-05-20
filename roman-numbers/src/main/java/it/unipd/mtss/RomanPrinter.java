/*///////////////////////////////////////////////////////////////////
  Davide Facco 2087852
  Marco Scanferla 2075523
///////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;
import it.unipd.mtss.IntegerToRoman;

public class RomanPrinter {

    /*
    * PRE: num >= 0
    * POST: ritorna l'ascii art del numero romano corrispondente a num
    * */
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    /*
    * PRE: romanNumber è una stringa contenente un numero romano
    * POST: ritorna l'ascii art di romanNumber
    * */
    private static String printAsciiArt(String romanNumber){
        int romanHeight = 6;
        StringBuilder romanAscii = new StringBuilder();

        /*
        * Questo for cicla per ciascuna riga dell'ascii art in maniera tale che
        * se il numero romano contiene più caratteri riesca a stamparli
        * uno di fianco all'altro
        * */
        for(int i = 0; i < romanHeight; i++){
            for(int j = 0; j < romanNumber.length(); j++){
                switch(romanNumber.charAt(j)) {
                    case 'I':
                        romanAscii.append(printI(i));
                        break;
                    case 'V':
                        romanAscii.append(printV(i));
                        break;
                    case 'X':
                        romanAscii.append(printX(i));
                        break;
                    case 'L':
                        romanAscii.append(printL(i));
                        break;
                    case 'C':
                        romanAscii.append(printC(i));
                        break;
                    case 'D':
                        romanAscii.append(printD(i));
                        break;
                    case 'M':
                        romanAscii.append(printM(i));
                        break;
                }
            }
            romanAscii.append("\n");
        }
        return romanAscii.toString();
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano I
    * */
    private static String printI(int i){
        switch(i){
            case 0:
                return "  _____ ";
            case 1:
                return " |_   _|";
            case 2:
                return "   | |  ";
            case 3:
                return "   | |  ";
            case 4:
                return "  _| |_ ";
            case 5:
                return " |_____|";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano V
    * */
    private static String printV(int i){
        switch(i){
            case 0:
                return " __      __";
            case 1:
                return " \\ \\    / /";
            case 2:
                return "  \\ \\  / / ";
            case 3:
                return "   \\ \\/ /  ";
            case 4:
                return "    \\  /   ";
            case 5:
                return "     \\/    ";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano X
    * */
    private static String printX(int i){
        switch(i){
            case 0:
                return " __   __";
            case 1:
                return " \\ \\ / /";
            case 2:
                return "  \\ V / ";
            case 3:
                return "   > <  ";
            case 4:
                return "  / . \\ ";
            case 5:
                return " /_/ \\_\\";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano L
    * */
    private static String printL(int i){
        switch(i){
            case 0:
                return "  _      ";
            case 1:
                return " | |     ";
            case 2:
                return " | |     ";
            case 3:
                return " | |     ";
            case 4:
                return " | |____ ";
            case 5:
                return " |______|";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano C
    * */
    private static String printC(int i){
        switch(i){
            case 0:
                return "   _____ ";
            case 1:
                return "  / ____|";
            case 2:
                return " | |     ";
            case 3:
                return " | |     ";
            case 4:
                return " | |____ ";
            case 5:
                return "  \\_____|";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano D
    * */
    private static String printD(int i){
        switch(i){
            case 0:
                return "  _____  ";
            case 1:
                return " |  __ \\ ";
            case 2:
                return " | |  | |";
            case 3:
                return " | |  | |";
            case 4:
                return " | |__| |";
            case 5:
                return " |_____/ ";
            default:
                return "";
        }
    }

    /*
    * PRE: i è il numero della riga dell'ascii art
    * POST: ritorna la i-esima riga dell'ascii art del numero romano M
    * */
    private static String printM(int i){
        switch(i){
            case 0:
                return "  __  __ ";
            case 1:
                return " |  \\/  |";
            case 2:
                return " | \\  / |";
            case 3:
                return " | |\\/| |";
            case 4:
                return " | |  | |";
            case 5:
                return " |_|  |_|";
            default:
                return "";
        }
    }
}
