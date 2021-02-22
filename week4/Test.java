package week4;

public class Test {
   
    public static void printForties(Student [] student)
    {
       for(int i = 0; i < student.length; i++){
            if(student[i].mark >= 40 || student[i].mark <= 49){
                System.out.format("%s (%s)\n", student[i].mark, student[i].name);
            }
        }
    }
}
