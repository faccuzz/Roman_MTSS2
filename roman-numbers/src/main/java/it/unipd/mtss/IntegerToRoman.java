/*///////////////////////////////////////////////////////////////////
  Davide Facco 2087852
  Marco Scanferla 2075523
///////////////////////////////////////////////////////////////////*/

package it.unipd.mtss;

public class IntegerToRoman {

    // Funzione per aggiungere una coppia di caratteri al risultato
    static int sub_digit(char num1, char num2, int i, char[] c) {
        c[i++] = num1; // Aggiunge il primo carattere
        c[i++] = num2; // Aggiunge il secondo carattere
        return i; // Ritorna il nuovo indice
    }

    // Funzione per aggiungere un carattere al risultato n volte
    static int digit(char ch, int n, int i, char[] c) {
        for (int j = 0; j < n; j++) {
            c[i++] = ch; // Aggiunge il carattere ch n volte
        }
        return i; // Ritorna il nuovo indice
    }

    // Funzione principale per convertire un numero intero in numero romano
    public static String convert(int number) {
        char c[] = new char[10001]; // Array di caratteri per il risultato
        int i = 0; // Indice per l'array di caratteri

        // Se il numero è minore o uguale a 0, ritorna "Invalid number"
        if (number <= 0) {
            return "Invalid number";
        }

        // Ciclo per convertire il numero in caratteri romani
        while (number != 0) {
            // Gestisce le migliaia
            switch (number / 1000) {
                case 0:
                    break;
                default:
                    i = digit('M', number / 1000, i, c); // Aggiunge 'M' per ogni 1000
                    number = number % 1000; // Aggiorna il numero rimanente
            }

            // Gestisce le cinquecentine
            switch (number / 500) {
                case 0:
                    break;
                default:
                    if (number < 900) {
                        i = digit('D', number / 500, i, c); // Aggiunge 'D' per ogni 500
                        number = number % 500; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('C', 'M', i, c); // Aggiunge 'CM' per 900
                        number = number % 100; // Aggiorna il numero rimanente
                    }
            }

            // Gestisce le centinaia
            switch (number / 100) {
                case 0:
                    break;
                default:
                    if (number < 400) {
                        i = digit('C', number / 100, i, c); // Aggiunge 'C' per ogni 100
                        number = number % 100; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('C', 'D', i, c); // Aggiunge 'CD' per 400
                        number = number % 100; // Aggiorna il numero rimanente
                    }
            }

            // Gestisce le cinquanta
            switch (number / 50) {
                case 0:
                    break;
                default:
                    if (number < 90) {
                        i = digit('L', number / 50, i, c); // Aggiunge 'L' per ogni 50
                        number = number % 50; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('X', 'C', i, c); // Aggiunge 'XC' per 90
                        number = number % 10; // Aggiorna il numero rimanente
                    }
            }

            // Gestisce le decine
            switch (number / 10) {
                case 0:
                    break;
                default:
                    if (number < 40) {
                        i = digit('X', number / 10, i, c); // Aggiunge 'X' per ogni 10
                        number = number % 10; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('X', 'L', i, c); // Aggiunge 'XL' per 40
                        number = number % 10; // Aggiorna il numero rimanente
                    }
            }

            // Gestisce le cinque
            switch (number / 5) {
                case 0:
                    break;
                default:
                    if (number < 9) {
                        i = digit('V', number / 5, i, c); // Aggiunge 'V' per ogni 5
                        number = number % 5; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('I', 'X', i, c); // Aggiunge 'IX' per 9
                        number = 0; // Aggiorna il numero rimanente
                    }
            }

            // Gestisce le unità
            switch (number) {
                case 0:
                    break;
                default:
                    if (number < 4) {
                        i = digit('I', number, i, c); // Aggiunge 'I' per ogni 1
                        number = 0; // Aggiorna il numero rimanente
                    } else {
                        i = sub_digit('I', 'V', i, c); // Aggiunge 'IV' per 4
                        number = 0; // Aggiorna il numero rimanente
                    }
            }
        }

        // Costruisce la stringa finale dal risultato
        StringBuilder roman = new StringBuilder();
        for (int j = 0; j < i; j++) {
            roman.append(c[j]);
        }

        // Ritorna la stringa finale
        return roman.toString();
    }
}
