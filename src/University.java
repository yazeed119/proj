import java.util.ArrayList;
import java.util.List;

public class University {

    List<MasterStudent> masterStudents;
    List<MedicalStudent> medicalStudents;
    List<EngineerStudent> engineerStudents;

    int numberOfAdd;
    int numberOfRetrieve;
    int numberOfRemove;

    public University() {
        masterStudents = new ArrayList<>();
        medicalStudents = new ArrayList<>();
        engineerStudents = new ArrayList<>();
        numberOfAdd = numberOfRemove = numberOfRetrieve = 0;
    }

    public void addStudent(Student student,String type) {
        if(type == "master"){
            masterStudents.add((MasterStudent) student);
            numberOfAdd++;
        } else if (type == "medical") {
            medicalStudents.add((MedicalStudent) student);
            numberOfAdd++;
        } else if (type == "engineer") {
            engineerStudents.add((EngineerStudent) student);
            numberOfAdd++;
        }
    }

    public  Student retrieveStudent(int studentId,String type) {
        if(type == "master"){
            for (int i=0;i<masterStudents.size();i++){
                if(masterStudents.get(i).id == studentId){
                    numberOfRetrieve++;
                    return masterStudents.get(i);
                }
            }
        } else if (type == "medical") {
            for (int i=0;i< medicalStudents.size();i++){
                if(medicalStudents.get(i).id == studentId){
                    numberOfRetrieve++;
                    return medicalStudents.get(i);
                }
            }

        } else if (type == "engineer") {
            for (int i=0;i<engineerStudents.size();i++){
                if(engineerStudents.get(i).id == studentId){
                    numberOfRetrieve++;
                    return engineerStudents.get(i);
                }
            }
        }
        return null;
    }

    public void removeStudent(int studentId,String type) {
        if(type == "master"){
            for (int i=0;i<masterStudents.size();i++){
                if(masterStudents.get(i).id == studentId){
                    masterStudents.remove(i);
                    numberOfRemove++;
                }
            }
        } else if (type == "medical") {
            for (int i=0;i<medicalStudents.size();i++){
                if(medicalStudents.get(i).id == studentId){
                    medicalStudents.remove(i);
                    numberOfRemove++;
                }
            }

        } else if (type == "engineer") {
            for (int i=0;i<engineerStudents.size();i++){
                if(engineerStudents.get(i).id == studentId){
                    engineerStudents.remove(i);
                    numberOfRemove++;
                }
            }
        }
    }

    public String report() {
        String report;
        report = "number of student added = " + numberOfAdd + "\n" +
                "number of student removed = " + numberOfRemove + "\n" +
                "number of student Retrieve = " + numberOfRetrieve + "\n";
        return report;
    }
}
