package employee;

public class Employee {
    private String name;
    private int staj;
    private String education; /*  package local field */
    protected String department;
    public Employee (){

    }
    public Employee (String name){
        this.name = name;

    }
    public Employee (String name, int staj){
        this.name = name;
        this.staj = staj;
    }
    public Employee(String name, int staj, String education){
        this.name = name;
        this.staj = staj;
        this.education=education;
    }

    public String getName() {
        return name;
    }

    public int getStaj() {
        return staj;
    }
    public void setStaj(int staj){
        this.staj = staj;
    }
    public void setEducation(String education) {
        this.education = education;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString(){
        return this.name + " is hired in  " + this.department + " " + this.education + " has staj = "
                + this.staj ;
    }
}
