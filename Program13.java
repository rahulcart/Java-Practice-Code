//Find and return the average salary, number of salaries greater than the average salary and number
//of salaries lesser than the average salary from the salary array passed to the findDetails() method.
//Return a double array containing average salary in index position 0, number of salaries greater than
//the average salary in index position 1 and number of salaries lesser than the average salary in index
//position 2. Implement the logic inside findDetails() method.

class Tester{
    public static double[] findDetails(double[] salary) {
        //Implement your code here and change the return value accordingly
        double sum=0,ave=0;
        int count1=0,count2=0;
        int size= salary.length;
        for(double sal :salary){
            sum+=sal;
        }ave=sum/size;
        double ave1=(int)ave;
        for(double sal1 : salary){
            if(ave1>sal1){count1++;}
            else if (ave1<sal1) {count2++;
            }
        }
        double[] val={ave,count2,count1};
        return val;

    }

    public static void main(String[] args) {
        double[] salary = { 23500.0, 23500.0, 23500.0, 23500.0};
        double[] details = findDetails(salary);

        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
