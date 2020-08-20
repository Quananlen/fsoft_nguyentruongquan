package unit12_java_colectiton_framework.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        Student student1 = new Student("Quân1", 18, "Vũng Tàu");
        Student student2 = new Student("Quân2", 19, "Đà Nắng");
        Student student3 = new Student("Quân3", 20, "Hà Nội");
        Student student4 = new Student("Quân4", 21, "Phú Yên");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student student: lists){
            System.out.println(student.toString());
        }
        AgeComparator ageComparator=new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println(" sort of age");
        for(Student age: lists){
            System.out.println(age.toString());
        }
    }
}
