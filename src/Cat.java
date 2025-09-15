public class Cat extends Pet {

    private String name;
    private String type;

    Cat(String type, String name) {
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
