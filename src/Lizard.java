public class Lizard extends Pet {
private String name;
private String type;

    Lizard(String name, String type) {
        super(name, type);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is hissing: " + "hiss hiss");
    }
    public void sleep() {
        super.sleep();
        }
    public void move() {
        super.move();
    }
    }


