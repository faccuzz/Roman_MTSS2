/*///////////////////////////////////////////////////////////////////
  Davide Facco 2087852
  Marco Scanferla 2075523
///////////////////////////////////////////////////////////////////*/
package it.unipd.mtss;
public class IntegerToRoman {

    static int sub_digit(char num1, char num2, int i, char[] c) {
        c[i++] = num1;
        c[i++] = num2;
        return i;
    }

    static int digit(char ch, int n, int i, char[] c) {
        for (int j = 0; j < n; j++) {
            c[i++] = ch;
        }
        return i;
    }

    public static String convert(int number) {
        char c[] = new char[10001];
        int i = 0;

        if (number <= 0) {
            return "Invalid number";
        }

        while (number != 0) {
            switch (number / 1000) {
                case 0:
                    break;
                default:
                    i = digit('M', number / 1000, i, c);
                    number = number % 1000;
            }

            switch (number / 500) {
                case 0:
                    break;
                default:
                    if (number < 900) {
                        i = digit('D', number / 500, i, c);
                        number = number % 500;
                    } else {
                        i = sub_digit('C', 'M', i, c);
                        number = number % 100;
                    }
            }

            switch (number / 100) {
                case 0:
                    break;
                default:
                    if (number < 400) {
                        i = digit('C', number / 100, i, c);
                        number = number % 100;
                    } else {
                        i = sub_digit('C', 'D', i, c);
                        number = number % 100;
                    }
            }

            switch (number / 50) {
                case 0:
                    break;
                default:
                    if (number < 90) {
                        i = digit('L', number / 50, i, c);
                        number = number % 50;
                    } else {
                        i = sub_digit('X', 'C', i, c);
                        number = number % 10;
                    }
            }

            switch (number / 10) {
                case 0:
                    break;
                default:
                    if (number < 40) {
                        i = digit('X', number / 10, i, c);
                        number = number % 10;
                    } else {
                        i = sub_digit('X', 'L', i, c);
                        number = number % 10;
                    }
            }

            switch (number / 5) {
                case 0:
                    break;
                default:
                    if (number < 9) {
                        i = digit('V', number / 5, i, c);
                        number = number % 5;
                    } else {
                        i = sub_digit('I', 'X', i, c);
                        number = 0;
                    }
            }

            switch (number) {
                case 0:
                    break;
                default:
                    if (number < 4) {
                        i = digit('I', number, i, c);
                        number = 0;
                    } else {
                        i = sub_digit('I', 'V', i, c);
                        number = 0;
                    }
            }
        }

        StringBuilder roman = new StringBuilder();
        for (int j = 0; j < i; j++) {
            roman.append(c[j]);
        }

        return roman.toString();
    }
}



