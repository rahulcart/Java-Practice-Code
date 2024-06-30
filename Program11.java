//Find the count of the highest occurring character in the string passed to the method and return the count.

class Tester {

    public static int findHighestOccurrence(String str){
        //Implement your code here and change the return value accordingly
        int maxCount = 0;
        char maxChar = '\0';
        for(char ch:str.toCharArray()){
            int count = 0;
            for (char innerCh : str.toCharArray()) {
                if (ch == innerCh) {
                    count++;
                }
            }if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }
        return maxCount;
    }

    public static void main(String args[]){
        String str = "success";
        System.out.println(findHighestOccurrence(str));
    }
}