package unit10_dsa_list.exercise;

public class MyLinkedListMain {
    public static void main(String[] args) {
         class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
        MyLinkedlist<Student> studentMyLinkedlist = new MyLinkedlist<>();
        Student student1 = new Student(1, "Quân1");
        Student student2 = new Student(2, "Quân2");
        Student student3 = new Student(3, "Quân3");
        Student student4 = new Student(4, "Quân4");
        Student student5 = new Student(5, "Quân5");
        studentMyLinkedlist.addFirst(student1);
        for(int i=0 ;i<studentMyLinkedlist.size();i++){
            Student student = (Student) studentMyLinkedlist.get(i);
            System.out.println(student.getName());
        }
    }
}

