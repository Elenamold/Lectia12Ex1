package employee;

public class Programer extends Employee implements Training, Interview {
    boolean canAttendTraining;

    public Programer(String name) {
        super(name);
        this.department = "Software Department";
    }
    public Programer(String name, int staj){
        super(name, staj);
        this.department = "Software Department";
    }
    @Override
    public boolean canAttendTraining() {
      canAttendTraining = true;
      return canAttendTraining;
    }

    @Override
    public boolean canConductInterview() {
        return false;
    }
}
