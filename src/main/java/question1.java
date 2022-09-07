public class question1 {
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }


    public static int getSecondIndex(String[] names) {
        return names.length - 2;
    }

    public static String getFirstElement(String[] names) {
        String[] letters = {"a", "b", "c"};
        return (letters[0]);
    }

    public static String getLastElement(String[] names) {
        String[] letters = {"a", "b", "c"};
        return (letters[2]);
    }

    public static String getSecondToLastElement(String[] names) {
        String[] letters = {"a", "b", "c"};
        return (letters[1]);

    }

    public static int getSum(int[] ints) {
        int[] arr = {1, 2, 3};
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;

    }

    public static int getAverage(int[] ints) {
        int[] arr = {1, 2, 3};
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        int average = sum / length;
        return average;


    }

    public static int extractAllOddNumbers(int[] numbers) {

int i;
        for (i=0; i < numbers.length -1; i++){
            if (numbers[i] % 2!= 0) {
System.out.print(numbers[i] + " ");



            }
    }        return numbers[i];

    }
    public static int extractAllEvenNumbers(int[] numbers) {
    int i;
for (i=0; i < numbers.length - 1; i++){
if ( numbers[i] % 2==0){System.out.print(numbers[i] + " ");
}

    }
        return numbers[i];
}

public static boolean contains(String[] names, String element) {
    boolean x = false; boolean y = true;
    if ( names.equals(element)){
        return y;
    }else {
        return x; }
}















    public static void main(String[] args) { String element = ("d");
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























