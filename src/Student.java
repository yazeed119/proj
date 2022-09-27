import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Student {
    int id;
    String name;
    String dateOfBirth;

    public int getAge(String dateOfBirth){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        return year - Integer.parseInt(dateOfBirth.substring(0,3));
    }

    public void printInformation(String studentType) {
        System.out.println(studentType + " : " + "id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "\n");
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if(this.id == student.id && this.name == student.name && this.dateOfBirth == student.dateOfBirth){
            return true;
        }
        return false;

    }
}