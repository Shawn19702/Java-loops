
public class question1 {
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }


    public static int getSecondIndex(String[] names) {
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        return (names[0]);
    }

    public static String getLastElement(String[] names) {
        return (names[2]);
    }

    public static String getSecondToLastElement(String[] names) {
        return (names[1]);

    }

    public static int getSum(int[] ints) {
        int sum = 0;
        int i;
        for (i = 0; i < ints.length; i++)
            sum += ints[i];
        return sum;

    }

    // int sum = 0;
    // looping ints array length
    // concentrate sum to int [i]  means sum is equal to sum + ints[i]
    // return sum


    public static int getAverage(int[] ints) {
        int length = ints.length;
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];


        }
        int average = sum / length;
        return average;


    }
    // int length is equal to ints.length array
    // int sum is equal to 0
    // loop through ints length
    // concentrate sum to int [i]  means sum is equal to sum + ints i
    // int average is equal to sum divided by length because that how you get average
    // return average

    public static String extractAllOddNumbers(int[] numbers) {

        int number = 0;
        int position = 0;
        String oddNumbers = " ";
        while (position < numbers.length) {
            number = numbers[position];
            position++;
            if (number % 2 != 0) {
                oddNumbers += number + ", ";
            }

        }
        return oddNumbers;
    }
    // int number = 0
    // int position = 0
    // Create empty String
    // use int position to loop through numbers array
    // int number is equal to position int index number in loop
    // if number is divided by 2 and has reminder of zero
    // concentrate odd number string to number means  oddnumber = oddnumber + number
    // return odd numbers

    public static String extractAllEvenNumbers(int[] numbers) {

        int number = 0;
        int position = 0;
        String evenNumbers = " ";
        while (position < numbers.length) {
            number = numbers[position];
            position++;
            if (number % 2 == 0) {
                evenNumbers = evenNumbers + number + ", ";
            }

        }
        return evenNumbers;
    }
    // int number = 0
    // int position = 0
    // Create empty String
    // use int position to loop through numbers array
    // int number is equal to position int index number in loop
    // if number is divided by 2 and has reminder of zero
    // concentrate odd number string to number means  oddnumber = oddnumber + number
    // return odd numbers

    public static boolean contains(String[] names, String element) {
        for (int x = 0; x < names.length; x++) {
            if (element == names[x]) {
                return true;
            }
        }
        return false;
    }

    // make a for loop to loop through string array names
    // if string element is equal to name with the index of x int in the loop
    // return true
    // if it is not return false
    public static int getIndexbyElement(String[] names, String element) {
        int x;
        for (x = 0; x < names.length; x++) {
            if (element == names[x]) {
                return x;
            }
        }
        return names.length - 1;

    }

    // make a for loop to loop through string array names
    // if string element is equal to name with the index of x int in the loop
    // return the value of x will which will be the value of the index
    // return the value names.length -1 because indexes start a 0 not 1

    public static void printOddNumbersInRange(int start, int end) {
        for (int x = start; x < end; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    // loop through ints start and end
    // if the increment of in the range doesn't have a reminder of zero when divided by 2
    // print out int x in the loop

    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String string = "";
        for (int x = 0; x < n; x++) {
            string += str + " ";
        }
        return string;
    }

    // make empty string
    //looping through int n
    // when done looping int n concatenate the empty string with string str means string = string + str
    // return the empty string with the concatenation

    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = str.substring(0, 3);
        int i = 0;
        do {
            System.out.println(firstThree);
            i++;
        }
        while (i < n);
        return firstThree;
    }

    // substring indexes 0 to 3
    // do  system out print substring and increase i by one
    // while i is less than int n
    // return the first three substring


    public static int wordsInAStringCounter(String str) {

        String wordCounter[] = str.split(" ");
        return wordCounter.length;

        /*when the " " or space comes with the string it will create a split so we are returning the number of splits in
       the String str

        */

    }

    public static int VowelsCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'a' || Character.toLowerCase(str.charAt(i)) == 'e' || Character.toLowerCase(str.charAt(i)) == 'i'
                    || Character.toLowerCase(str.charAt(i)) == 'o' || Character.toLowerCase(str.charAt(i)) == 'u') {

                count++;
            }
        }
        return count;
        // looping through srt string 
        // if a character is equal to a vowel it is stored in count ++ start from 0 
        // return count

    }







    public static void main(String[] args) {
String s = "Shawn was just made a vowel counter";
        String [] names = {"a", "b", "c", "d"};
        int [] ints = {1, 2, 3};
        int [] numbers = {3, 5,7, 6, 8,10};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println(extractAllOddNumbers(numbers));
        System.out.println(extractAllEvenNumbers(numbers));
        System.out.println(contains(names , "d"));
        System.out.println(getIndexbyElement(names,  "d"));
      printOddNumbersInRange(0 , 20);
           System.out.println(printGivenStringTimesNumberGiven("Shawn", 3));
          System.out.println(repeatFirstThreeLetters("Shawn", 3));
         System.out.println(wordsInAStringCounter("Shawn just finished question 15"));
        System.out.println(VowelsCounter(s));





        }
}










