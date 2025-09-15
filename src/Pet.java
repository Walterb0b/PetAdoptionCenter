public class Pet {
    private String name;
    private String type;


    //Constructor
    Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    //Getters
    public String getName() {return name;}
    public String getType() {return type;}

    //Setters
    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}

    //To string
    @Override
    public String toString(){
        return name + " " + "(" + type +")";
    }

    public void speak(){
        System.out.println(name + " is speaking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }


}
