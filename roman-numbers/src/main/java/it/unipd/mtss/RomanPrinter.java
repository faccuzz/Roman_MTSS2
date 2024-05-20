/*///////////////////////////////////////////////////////////////////
  Davide Facco 2087852
  Marco Scanferla 2075523
///////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;
import it.unipd.mtss.IntegerToRoman;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        int romanHeight = 6;
        StringBuilder romanAscii = new StringBuilder();

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
