//Student(int[] marks)
//
//Initialize the value of the instance variable marks with the value passed to the constructor.
//
//Initialize the grade with the same size as marks array.
//
//findGrade()
//
//Find the corresponding grade for each marks present in the marks array based on the below details and update the grade array.
//        Assumption: The minimum marks can be 0 and maximum marks can be 100.
//

class Student{
    private int[] marks;
    private char[] grade;
    public Student(int[] marks) {
        if(marks>0){
            this.marks=marks;
            this.grade=new char[marks.length];}

    }
    public void findGrade(){
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 0) {
                int mark = marks[i];
                if (mark > 0 && mark <= 100) {
                    if (mark >= 92) {
                        grade[i] = 'E';
                    } else if (mark >= 85 && mark < 92) {
                        grade[i] = 'A';
                    } else if (mark >= 70 && mark < 85) {
                        grade[i] = 'B';
                    } else if (mark >= 65 && mark < 70) {
                        grade[i] = 'C';
                    } else {
                        grade[i] = 'D';
                    }
                }
            }
        }

    }
    public int[] getMarks(){return marks;}
    public char[] getGrade(){return grade;}
    public void setMarks(int[] marks){this.marks=marks;}
    public void setGrade(char[] grade){this.grade=grade;}
}


public class Tester {
    public static void main(String[] args) {
        int[] marks = {79, 87, 97, 65, 78, 99, 0};
        Student student = new Student(marks);
        student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
        char[] grades = student.getGrade();
        for (int index = 0; index < grades.length; index++) {
            System.out.print(grades[index] + " ");
        }
    }
}