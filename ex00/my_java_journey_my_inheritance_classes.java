// class MyFirstClass {

//     public static void main(String[] args) {
//         Human human = new Human();
//         Mammal mammal = new Mammal();
//         System.out.println(human.getName());
//         System.out.println(mammal.getLife());
//         System.out.println(human.getLife());
//     }
// }
class Human extends Mammal {
    private String name;
    public Human(String name) {
        System.out.println("Constructor Human");
        this.name = name;
        this.life = 100;
    }
    public String getName() {
        return name;
    }
}
class Mammal {
    public int life;
    public Mammal() {
        System.out.println("Constructor Mammal");
        this.life = 10;
    }

    public int getLife() {
        return life;
    }
}