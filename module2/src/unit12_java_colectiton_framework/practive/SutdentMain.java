package unit12_java_colectiton_framework.practive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SutdentMain {
    public static void main(String[] args) {
        Student student1=new Student("Quân1",19,"Vũng Tàu");
        Student student2=new Student("Quân2",20,"Vũng Tàu");
        Student student3=new Student("Quân3",21,"Vũng Tàu");
        Map<Integer,Student> studentMap=new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student3);
        studentMap.put(3,student2);
        studentMap.put(4,student1);
        for(Map.Entry<Integer,Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("Hash Set");
        Set<Student> students=new HashSet<>();
        students.add(student1);
        students.add(student3);
        students.add(student2);
        students.add(student1);
         for(Student student:students){
             System.out.println(student.toString());
         }
    }
}
