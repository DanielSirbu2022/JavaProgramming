package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    //Constructor
    public CydeoStudent(String studentName){
        this.studentName=studentName;
    }

    public static String schoolName;
    //Static block
static {
    schoolName="Cydeo School";
}


//Main Method
}
  class CydeoStudentObject{
      public static void main(String[] args) {

          CydeoStudent student1 = new CydeoStudent("Daniel");
          CydeoStudent student2 = new CydeoStudent("Muhtar");

          System.out.println(student1.schoolName);
          System.out.println(student2.schoolName);


      }

  }