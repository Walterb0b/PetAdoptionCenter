public class Dog extends Pet {
    Dog(String name, String type) {
        super(name, type);
    }

    @Override
   public void speak() {
        System.out.println(getName() + " Is barking " + "Woof woof");
    }
    public void sleep() {
        super.sleep();
    }
    public void move() {
        super.move();
    }
}


