public class main {
    public static void main(String[] args) {

        animal animal = new animal();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();

        human human = new human();

        car seat = new car();
        seat.setColour("white");
        seat.setModel("leon FR");
        seat.setPrice(600);
        seat.setProducer("Seat company");

        car renault = new car();
        renault.setColour("silver");
        renault.setModel("clio");
        renault.setPrice(200);
        renault.setProducer("Renault company");

        car ford = new car();
        ford.setColour("red");
        ford.setModel("focus RS");
        ford.setPrice(800);
        ford.setProducer("Ford company");

        human.addMyCar(seat);

        System.out.println("________________________");
        human.getSalary();

        System.out.println("________________________");

        System.out.println(seat.toString());
        System.out.println(animal.toString());

    }
}
