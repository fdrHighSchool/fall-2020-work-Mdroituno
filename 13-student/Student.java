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

        return "";
    } //end of getName method


    public String getOsis(){

        return "";
    } //end of getOsis method

    public void setName(String name){
        this.name = name;
       
    } //end of setName method

    public void addGrade(int arr) {


    } //end addGrade method

    public double calculateAverage(){

        return 0.0;
    } //end of calculateAverage method

    public String toString(){
        return "Student: " + this.name + " OSIS: " + this.osis;
    }
}//end class