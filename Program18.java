//Find out all the possible permutations of the characters in the string passed to the method findPermutations(). Implement the logic inside findPermutations() method and return a string array containing all the permutations.
//
//        Assumption: The length of the string will be 3.
//
//E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.

class Tester{
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        String[] permutations = new String[6];
        int index=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==i){
                    continue;
                    for(int k=0;k<3;k++){
                        if(k==i || k==j){
                            continue;
                            permutations[index++]=""+str.charAt(i)+str.charAt(j)+str.charAt(k);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}


