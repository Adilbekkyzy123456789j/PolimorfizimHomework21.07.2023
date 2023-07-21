public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Turtle turtle = new Turtle();
        Shark shark = new Shark();
        Eagle eagle = new Eagle();


        animal.walking();

        Animal[] animals = new Animal[]{new Eagle(), new Shark(), new Turtle()};
        for (Animal animal1 : animals) {
            if (animal1 instanceof Turtle) {
                ((Turtle) animal1).swim();


            }

        }
        Animal[] animals1 = new Animal[]{new Eagle(), new Shark(), new Turtle()};
        for (Animal animal1 : animals) {
            if (animal1 instanceof Eagle) {
                ((Eagle) animal1).fly();

            }
        }
        Animal[] animals2 = new Animal[]{new Eagle(), new Shark(), new Turtle()};
        for (Animal animal1 : animals) {
            if (animal1 instanceof Shark) {
                ((Shark) animal1).attack();

            }
        }
    }
}
