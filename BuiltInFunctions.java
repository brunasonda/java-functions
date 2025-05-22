public class BuiltInFunctions {
    public static void main(String[] args) {

        String message = "Hola soy un test";
        printMessage(message);
        System.out.println("Longitud es: " + getLength(message));
        System.out.println("En minúsculas: " + convertToLowercase(message));
        System.out.println("Empieza con 'Hola'? " + findPrefix(message, "Hola"));
        System.out.println("Reemplazo de caracteres: " + replaceCharacters(message, 'o', '0'));
        System.out.println("Raíz cuadrada de 25: " + getsSquareRoot(25));
        System.out.println("2 elevado a la potencia de 3: " + getPower(2, 3));
        System.out.println("Número aleatorio: " + getRandomNumber());
        System.out.println("Número máximo entre 3 y 5: " + maxNumber(3, 5));

    }

    /**
         * Function name: printMessage
         * 
         * @param message (String)
         * 
         * Inside the function:
         * 1. Find a java built-in function that prints the message on the console.
         */

    public static void printMessage(String message) {
        System.out.println(message);
    }

        /**
         * Function name: getLength
         * 
         * @param message (String)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the length of a string.
         */

        public static int getLength(String message) {
            return message.length();
        }


        /**
         * Function name: convertToLowercase
         * 
         * @param message (String)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that converts a string to lowercase.
         */

        public static String convertToLowercase(String message) {
            return message.toLowerCase();
        }

        /**
         * Function name: findPrefix
         * 
         * @param message (String)
         * @param prefix (String)
         * @return (boolean)
         * 
         * Inside the function:
         * 1. Find a built-in function that checks if a string starts with a specified prefix.
         */

        public static boolean findPrefix(String message, String prefix) {
            return message.startsWith(prefix);
        }


        /**
         * Function name: replaceCharacters
         * 
         * @param message (String)
         * @param oldChar (char)
         * @param newChar (char)
         * @return (String)
         * 
         * Inside the function:
         * 1. Find a built-in function that replaces all occurrences of a specified character in a string with another character.
         */

        public static String replaceCharacters(String message, char oldChar, char newChar) {
            return message.replace(oldChar, newChar);
        }


        
        /**
         * Function name: getsSquareRoot
         * 
         * @param number (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the square root of a number.
         */

        public static double getsSquareRoot(double number) {
            return Math.sqrt(number);
        }


        /**
         * Function name: getPower
         * 
         * @param base (double)
         * @param exponent (double)
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that calculates the power of a number.
         */

        public static double getPower(double base, double exponent) {
            return Math.pow(base, exponent);
        }


        /**
         * Function name: getRandomNumber
         *
         * @return (double)
         * 
         * Inside the function:
         * 1. Find a built-in function that generates a random number between 0.0 (inclusive) and 1.0 (exclusive).
         */

        public static double getRandomNumber() {
            return Math.random();
        }

        /**
         * Function name: maxNumber
         * 
         * @param number1 (int)
         * @param number2 (int)
         * @return (int)
         * 
         * Inside the function:
         * 1. Find a built-in function that returns the larger of two numbers.
         */

            public static int maxNumber(int number1, int number2) {
                return Math.max(number1, number2);
            }
        }