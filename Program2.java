//Calculate and return the sum of the digits of the num member variable

class Calculator {

    // Implement your code here
    public int num;
    public int sumOfDigits(){
        int sum=0;
        while(num>0){
            int digits=num%10;
            sum+=digits;
            num=num/10;
        }
        return sum;
    }
}

class Tester {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();

        // Assign a value to the member variable num of Calculator class
        calculator.num=123;

        // Invoke the method sumOfDigits of Calculator class and display the output
        System.out.println(calculator.sumOfDigits());

    }
}