package unit7_adstract_class_interface.exercise.resizeable;

public class MainResizeable {
    public static void main(String[] args) {
        Shape [] array=new Shape[3];
        array[0]= new Circle(10);
        array[1]=new Rectangle(10,20);
        array[2]=new Square(10);
        for( Shape shape : array){
            System.out.println(shape);

        }

    }
}
