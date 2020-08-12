package unit7_adstract_class_interface.exercise.colorable;

public class MainColorable {
    public static void main(String[] args) {
           Shape []array=new Shape[2];
           array[0]=new Circle(10);
           array[1]=new Square(10);
           for(Shape shape : array){
               System.out.println(shape);
               if(shape instanceof Square){
                  shape.howToColor();
               }
               System.out.println(shape);
           }
    }
}
