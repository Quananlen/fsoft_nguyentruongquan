package unit10_dsa_list.exercise;

import org.w3c.dom.ls.LSOutput;

public class MyArrayListMain {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Quân1");
        Student student2 = new Student(2, "Quân2");
        Student student3 = new Student(3, "Quân3");
        Student student4 = new Student(4, "Quân4");
        Student student5 = new Student(5, "Quân5");
        Student student6 = new Student(6, "Quân5");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);
        studentMyArrayList.add(3, student6);
        System.out.println("size =" + studentMyArrayList.size());
        System.out.println("index  =" + studentMyArrayList.indexOf(student5));
        System.out.println("isHave  =" + studentMyArrayList.contains(student1));
        newMyArrayList = studentMyArrayList.clone();
        studentMyArrayList.remove(4);
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) ((MyArrayList<Student>) studentMyArrayList).elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
//       for (int i = 0; i < newMyArrayList.size(); i++) {
//         System.out.println(newMyArrayList.get(i).getName());
//    }
    }
}

