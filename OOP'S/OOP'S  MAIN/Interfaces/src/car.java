public class car implements engine,brake,media {

    @Override
    public void type_brake(String brake) {
        System.out.println("I have "+brake+" brakes");
    }

    @Override
    public void type_engine(String type_engine) {
        System.out.println("I have "+type_engine+" Engine");
    }

    @Override
    public void no_of_cylinders(int cylinders) {
        System.out.println("I have "+cylinders+" number of cylinders");
    }

    @Override
    public void type_brake() {
        System.out.println("same method ");
    }
}
