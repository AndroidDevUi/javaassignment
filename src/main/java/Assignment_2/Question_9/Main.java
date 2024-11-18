package Assignment_2.Question_9;


/**
 * Write a java program that performs the following task :
 * # Create an array of primitive  data type (e.g , int , double , char ).
 * # Use wrapper class (Integer , Double , Character) to convert
 * the primitive data type into their respective wrapper object
 */
public class Main {
    public static void main(String[] args) {


        int[] intArray = {1, 2, 3, 4, 5, 6};
        double[] doublesArray = {12.33, 45.66, 125.67};
        char[] charsArray = {'A', 'B', 'C'};

        Integer[] wrapperInt = new Integer[intArray.length];
        Double[] wrapperDouble = new Double[doublesArray.length];
        Character[] wrapperChar = new Character[charsArray.length];

      for (int i = 0 ; i < intArray.length ; i++){
          wrapperInt[i] = Integer.valueOf(intArray[i]);
      }

        for (int i = 0 ; i < doublesArray.length ; i++){
           wrapperDouble[i] = Double.valueOf(doublesArray[i]);
        }
        for (int i = 0 ; i < charsArray.length ; i++){
           wrapperChar[i] = Character.valueOf(charsArray[i]);
        }

        // TODO -----------


    }
}