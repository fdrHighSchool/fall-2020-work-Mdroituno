import java.util.Arrays;

public class Student {
    // instance variables
 
    private String name;
    private String osis;
    private int[] grades;

    // constructor
    public Student(String n, String o){
        this.name = n;
        this.osis = o;
        grades = new int[10];
    }//end constructor method
    
    // other methods


    public String getName(){

        return this.name;
    } //end of getName method


    public String getOsis(){

        return this.osis;
    } //end of getOsis method

    public void displayGrades() {
        System.out.println(Arrays.toString(this.grades));;
    }

    public void setName(String name){
        this.name = name;
       
    } //end of setName method
    
    public void fillArray() {
        for(int i = 0; i < this.grades.length; i++){
         this.grades[i] = (int) (Math.random() * 46 + 55);
        }//end col for loop
    } //end fillArray method
    
    public void addGrade (int grade){
        int i = 0;
        while (this.grades[i] != 0) {
            i++;
    }
        this.grades[i] = grade;
    }

    public double calculateAverage(){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < this.grades.length; i++){
            if(this.grades[i] != 0){
                sum += this.grades[i];
                count++;
            }//end if statement
        }// end for loop
        return sum/count;
    } //end of calculateAverage method

    public String toString(){
        return "Student: " + this.name + " OSIS: " + this.osis;
    }
}//end class