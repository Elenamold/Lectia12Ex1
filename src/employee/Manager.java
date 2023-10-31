package employee;

public class Manager extends Employee implements Training, Interview {
    boolean canAttendTraining;
    public Manager(String name){
        super(name);
        department = "Management Department";
    }
    public Manager(String name, int staj){
        super(name,staj);
        department = "Management Department";
    }
    @Override
    public boolean canAttendTraining() {
        return true;
    }

    @Override
    public boolean canConductInterview() {
        return true;
    }

}
