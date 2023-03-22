public class Multi {
    public static void main(String[] args) {
        Maruti800 car = new Maruti800();
        car.type();
        car.brand();
        car.speed();
    }
}

class Vehical{
    public void type(){
        System.out.println("Car");
    }
}

class Maruti extends Vehical{

    public void brand(){
        System.out.println("Maruti");
    }
}

class Maruti800 extends Maruti{
    public void speed(){
        System.out.println("80 KMph");
    }
}
