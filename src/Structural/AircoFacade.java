package Structural;

public class AircoFacade {

    private fan fan = new fan();
    private Heating heating = new Heating();
    private Cooler cooler = new Cooler();

    public void turnOnAirco(String airco){
        System.out.println("Getting menu combo 1");
        fan.off();
        heating.off();
        cooler.nasiveg();
        cooler.large();

        System.out.println("Menu combo 1 ");
        System.out.println("\n");
    }

    public void turnOffAirco(){
        System.out.println("Turining airco off...");
        fan.off();
        heating.off();
        cooler.small();

        System.out.println("Airco is off");
    }
}
