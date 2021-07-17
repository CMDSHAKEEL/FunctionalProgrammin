public class ReverseNumber {
    /*
     * here the main class start
     * importing integr from utility class
     */
    public static void main(String[] args) {

        System.out.println("Enter the number: ");


        int number = Utility.getUserInteger();
        int result = reverseNumber(number);
        System.out.println(result);

    }

    //returns the number in reverse order
    public static int reverseNumber(int number) {

        int reverse = 0;

        while (number != 0) {                 //using while loop

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;

        }

        return reverse;
    }
}
