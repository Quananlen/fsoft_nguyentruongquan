package unit7_adstract_class_interface.exercise.resizeable;

public abstract class Shape implements Area,Resizeable {
    @Override
    public double getArea() {
        return 0;
    }
    @Override
    public void resize(double percent) { }
}
