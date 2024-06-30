//Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.

class Tester{
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        String str="my name is rahul";
        String a=str.replace(" ","");
        char str1[]=a.toCharArray();
        int sum=0;
        for (int i = 0; i < a.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str1[i] == str1[j]) {
                    break;
                }
            }
            if(j==i){
                str1[sum++]=str1[i];
            }
        }
        return str1;
    }

    public static void main(String args[]){
        String str = "object oriented programming";
        System.out.println(removeDuplicatesandSpaces(str));
    }
}