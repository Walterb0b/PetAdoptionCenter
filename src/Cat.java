public class Cat extends Pet {

    Cat(String name, String type) {
        super(name, type);
    }


    @Override
    public void sleep() {
        super.sleep();
    }
        public void speak() {
            System.out.println(getName() + " Is Meowing " + "Meow Meow");
        }
        public void move() {
        super.move();
        
    }
}
