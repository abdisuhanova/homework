import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal[] animals = {(Animal) shark, (Animal) turtle, (Animal) eagle};
        Shark[] sharks = new Shark[1];
        Eagle[] eagles = new Eagle[1];
        Turtle[] turtles = new Turtle[1];
        shark.attack();
        turtle.swim();
        eagle.fly();
        for (Animal a:animals){
            if (a.getClass() == Shark.class) {
                sharks[0] = (Shark) a;
            }else if(a.getClass() == Eagle.class){
                eagles[0] = (Eagle) a;
            }else if(a.getClass() == Turtle.class)
                turtles[0] = (Turtle) a;
        }
    }
}