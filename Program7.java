//Calculate and return the sum of all the even numbers present in the numbers array passed to the method calculateSumOfEvenNumbers.
// Implement the logic inside calculateSumOfEvenNumbers() method.

class Tester {

    public static int calculateSumOfEvenNumbers(int[] numbers){
        //Implement your code here and change the return value accordingly
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {68,79,86,99,23,2,41,100};
        System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
    }
}