package unit7_adstract_class_interface.practice.animal_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chiken : cuc cuc";
    }

    public String howToEat() {
        return " counld be fried";
    }
}
