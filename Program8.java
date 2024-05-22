//Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
// Note: Assume that the input string does not have any space.

class Tester{

    public static String moveSpecialCharacters(String str){
        //Implement your code here and change the return value accordingly
        String sum1="",sum2="",sum3;
        for(int i=0;i<str.length();i++){
            char val=str.charAt(i);
            if(val>64 && val<91){sum1+=val;}
            else if(val>96 && val<123){sum1+=val;}
            else{sum2+=val;}
        }
        sum3=sum1+sum2;
        return sum3;
    }

    public static void main(String args[]){
        String str = "WelcometoInfosys";
        System.out.println(moveSpecialCharacters(str));
    }

}