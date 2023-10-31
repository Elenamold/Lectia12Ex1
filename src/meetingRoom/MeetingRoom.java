package meetingRoom;

import employee.Interview;
import employee.Training;

import java.util.List;

public class MeetingRoom {
    List<Training> trainers ;
    public MeetingRoom(List<Training> lll){
        this.trainers = lll;
    }
    public void afisaLista (List<Training> trainers){
        for (Training element : trainers) {
            System.out.println (element.toString());
            System.out.println (element.canAttendTraining());
        }
    }

}

