//reverseEachWord(String str)
//Reverse each word in the string passed to the method without changing the order of the words and return the modified string.
//Note: There should not be any extra blank/white space(s) in the output string.


class Tester {
    public static String reverseEachWord(String str){
        //Implement your code here and change the return value accordingly
        String sum="";
        Strng str1=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            sum=str.charAt(i);
        }
        return sum;
    }

    public static void main(String args[]){
        String str = "all cows eat grass";
        System.out.println(reverseEachWord(str));
    }
}