//Find the next 15 leap years from the year passed as parameter to the findLeapYears() method. Include the year passed as parameter if it is a leap year. Implement the logic inside findLeapYears() method and return an int array containing all the leap years.
//Test the functionalities using the main method of the Tester class.
//        [Hint: Any year which is divisible by 4 and not by 100 are leap years. Otherwise, any year which is divisible by 400 is also a leap year]


class Tester {
    public static int[] findLeapYears(int year){
        int[] my={};
        if(year>1999) {
            my = new int[15];
            int k = 0;
            for (int i = 0; i < 100; i++) {
                if (year % 4 == 0) {
                    my[k] = year;
                    k++;
                    if (k == 15) {
                        break;
                    }
                }
                year++;
            }
            return my;
        }

    }
    public static void main(String[] args) {
        int year = 1000;
        int[] leapYears;
        leapYears = findLeapYears(year);
        for (int index = 0; index < leapYears.length; index++) {
            System.out.println(leapYears[index]);
        }
    }
}