package employee;

public class Consultant extends Employee implements Training{

    public Consultant(String name){
        super(name);
    }

    @Override
    public boolean canAttendTraining() {
        return false;
    }
}
