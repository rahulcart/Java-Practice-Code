//Teacher(String teacherName, String subject, double salary)
//Initialize the values of all the instance variables appropriately with the values passed
//Create a Tester class. Create 4 objects of Teacher class. Create an array of type Teacher store
// the created objects and display the details of the teachers.

class Teacher {
    private String teacherName;
    private String subject;
    private double salary;
    public Teacher(String teacherName,String subject,double salary) {
        this.teacherName=teacherName;
        this.subject=subject;
        this.salary=salary;
    }

    public String getTeacherName(String teacherName) {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName=teacherName;
    }

    public String getSubject(String subject) {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject=subject;
    }

    public double getSalary(double salary) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }

    public void displayDetails() {
        System.out.print("Teacher Name :"+teacherName);
        System.out.print(", subject :"+subject);
        System.out.print(", Salary :"+salary);
        System.out.println();
    }
}




public class Program2{
    public static void main(String[] args) {
        Teacher object1=new Teacher("John","Math",65363);
        Teacher object2=new Teacher("rahul","Science",32828);
        Teacher object3=new Teacher("Manoj","Arts",29929);
        Teacher object4=new Teacher("Ajay","SST",73828);
        Teacher[] teachers={object1,object2,object3,object4};
        for (Teacher i : teachers) {
            i.displayDetails();
        }

    }
}
