public class StudentDriver{
    public static void main(String[] args) {
        Student student1 = new Student("Hans", "123456789");
        System.out.println(student1);
        student1.setName("Joshua");
        System.out.println(student1);
        student1.addGrade(100);
        student1.displayGrades();
        student1.addGrade(85);
        student1.displayGrades();

        Student student2 = new Student("Doe", "987654321");
        System.out.println(student2);
        student2.setName("John");
        System.out.println(student2);
        student2.addGrade((95));
        student2.displayGrades();

        Student student3 = new Student("Bobby", "052879527");
        System.out.println(student3);
        student3.fillArray();
        student3.displayGrades();

        System.out.println(student1.calculateAverage());
        System.out.println(student2.calculateAverage());
        System.out.println(student3.calculateAverage());



    }//end main method
}