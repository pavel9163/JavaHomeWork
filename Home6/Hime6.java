class Cat {
private int appetite; // аппетит кота
private int hunger; // голод кота

public Cat(int appetite) {
this.appetite = appetite;
this.hunger = 0;
}

public void eat(int food) {
if (food >= appetite - hunger) {
hunger = appetite;
System.out.println("Кот наелся!");
} else {
hunger += food;
System.out.println("Кот поел, но ему еще нужно есть.");
}
}

public int getHunger() {
return hunger;
}
}

public class Main {
public static void main(String[] args) {
int appetite = 100;
int foodInPlate = 25;

Cat cat = new Cat(appetite);
int requiredFood = appetite - cat.getHunger();

if (requiredFood <= foodInPlate) {
cat.eat(requiredFood);
foodInPlate -= requiredFood;
} else {
cat.eat(foodInPlate);
foodInPlate = 0;
}

System.out.println("После обеда сытость кота: " + cat.getHunger());
System.out.println("Еда в тарелке: " + foodInPlate);
}
}
