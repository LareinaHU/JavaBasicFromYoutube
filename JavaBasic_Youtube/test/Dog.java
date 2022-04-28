package test;

public class Dog {
    public Dog(String name, int size) {
        this.Name = name;
        this.size = size;
    }

    public Dog(String name, int size, int age) {
        this.Name = name;
        this.size = size;
    }


    public Dog() {}

    public void bark(int _) {}
    public void play() {}




    private String Name;
    private int size;
    int hbj;


    public static void main(String[] args) {
        Dog lwz = new Dog("linghu", 1989);
//        Dog ling = new Dog();/**/
//        ling.size=168;

    }

}

