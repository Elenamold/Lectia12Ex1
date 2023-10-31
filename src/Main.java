import employee.Training;
import employee.Employee;
import employee.Manager;
import employee.Programer;
import meetingRoom.MeetingRoom;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Sirbu");
        manager1.setStaj(10);
        manager1.setEducation("Bacalaur");

        Programer programer1 = new Programer("Popescu");
        programer1.setStaj(5);
        programer1.setEducation("Masterat");

        System.out.println("Exercitiu 1");
        System.out.println(manager1.toString() );
        System.out.println("can attend trainings " + manager1.canAttendTraining());
        System.out.println("can conduct interview " + manager1.canConductInterview());



        System.out.println("Exercitiu 2");
        List<Training> trainers = Arrays.asList(programer1, manager1, new Manager("Margina",20));
        MeetingRoom meetingRoom = new MeetingRoom(trainers);
        meetingRoom.afisaLista(trainers);



        System.out.println("Exercitiu 3");
        List<Employee> employees = Arrays.asList(programer1, manager1);
        for ( Employee element : employees ) {
            System.out.println(element.toString());
            if (element instanceof Programer) {
                Programer pr = (Programer) element;
                System.out.println("can attend trainings " + pr.canAttendTraining());
                System.out.println("can conduct interview " + pr.canConductInterview());
            } else if (element instanceof Manager) {
                Manager mngr = (Manager) element;
                System.out.println("can attend trainings " + mngr.canAttendTraining());
                System.out.println("can conduct interview " + mngr.canConductInterview());
            }
        }
        for ( Employee element : Arrays.asList(programer1, manager1, new Manager("Ivanov") ) ){
            System.out.println(element.toString());
            if (element instanceof Programer) {
                Programer pr = (Programer) element;
                System.out.println("can attend trainings " + pr.canAttendTraining());
                System.out.println("can conduct interview " + pr.canConductInterview());
            } else if (element instanceof Manager) {
                Manager mngr = (Manager) element;
                System.out.println("can attend trainings " + mngr.canAttendTraining());
                System.out.println("can conduct interview " + mngr.canConductInterview());
            }
        }


    }
}