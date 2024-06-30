//Validate that num1 should be less than num2
//
//If the validations are successful
//
//populate all the 2 digit positive numbers between num1 and num2 into the provided numbers array if
//
//sum of the digits of the number is a multiple of 3
//
//number is a multiple of 5
//
//Return the numbers array

class Tester{
    public static int[] findNumbers(int num1, int num2) {
        // Implement your code here
        int[] numbers = new int[6];
        int k=0;
        for (int i = num1; i <=num2; i++) {
            if (num1<=num2) {
                int sum = num1 + num2;
                if (num1>0 && (num1 % 3 == 0 && num1 % 5 == 0)) {
                    if(number[k]<7){
                        numbers[k] = num1;
                        k++;
                    }
                }
                num1++;
            }
        }

        return numbers;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int[] numbers = findNumbers(num1, num2);
        if (numbers[0] == 0) {
            System.out.println("There is no such number!");
        } else {
            for (int index = 0; index <= numbers.length - 1; index++) {
                if (numbers[index] == 0) {
                    break;
                }
                System.out.println(numbers[index]);
            }
        }

    }
}