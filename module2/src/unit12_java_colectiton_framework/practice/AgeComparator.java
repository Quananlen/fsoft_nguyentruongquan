cotpackage unit12_java_colectiton_framework.practice;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        if(student1.getAge() > student2.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
