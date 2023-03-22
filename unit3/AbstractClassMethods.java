public class Another extends Bike{

    public static void main(String[] args) {
        Bike another = new Another();
        another.run();
    }

    @Override
    void run() {
        System.out.println("Running");
    }
}

abstract class Bike{
    abstract void run();

}
