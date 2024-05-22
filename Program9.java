//checkPalindrome(String str)
//Check whether the string passed to the method is a palindrome or not.
// Return true if the string is palindrome, else return false.

class Tester{
    public static boolean checkPalindrome(String str){
        //Implement your code here and change the return value accordingly
        String sum="";
        Strng str1=str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            sum+=ch;
        }
        if(sum.equals(sum)){
            return true;}else{return false;}

    }

    public static void main(String args[]){
        String str = "radar";
        if(checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}