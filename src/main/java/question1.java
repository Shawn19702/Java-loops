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

    public static int getAverage(int[] ints) {
        int length = ints.length;
        int sum = 0;
        for (int i = 0; i < ints.length;i++) {
            sum += ints[i];


        }
        int average = sum / length;
        return average;


    }

    public static String extractAllOddNumbers(int[] numbers) {

int number =0;
int position =0;
String oddNumbers = " ";
while (position < numbers.length) {
number = numbers[position];
position++;
if (number % 2 !=0) { oddNumbers = oddNumbers + number + ", ";
    }

}
  return oddNumbers;
}

    public static String extractAllEvenNumbers(int[] numbers) {

        int number =0;
        int position =0;
        String evenNumbers = " ";
        while (position < numbers.length) {
            number = numbers[position];
            position++;
            if (number % 2 ==0) { evenNumbers = evenNumbers + number + ", ";
            }

        }
        return evenNumbers;
    }

public static boolean contains(String[] names, String element) {
    for (String n : names) {
        if (element == n){
    return true;
         }
}
return false;
}













    public static void main(String[] args) { String element = "d";

        String [] names = {"a", "b", "c"};
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
        System.out.println(contains(names,  element));






    }
}


















