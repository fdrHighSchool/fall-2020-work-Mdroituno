public class StudentDriver{
    public static void main(String[] args) {
        Student student1 = new Student("Hans", "123456789");
        System.out.println(student1);
        student1.setName("Joshua");
        System.out.println(student1);

        Student student2 = new Student("Doe", "987654321");
        System.out.println(student2);
        student2.setName("John");
        System.out.println(student2);

        Student student3 = new Student("Bobby", "052879527");
        System.out.println(student3);

    }//end main method
}