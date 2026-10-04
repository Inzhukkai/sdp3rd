public class Main {
    public static void main(String[] args){
        Hero ironMan=new IronMan(new FlightPower());
        ironMan.usePower();

        System.out.println();
        System.out.println("Chaning powers:");

        Hero ironManWithLightning=new IronMan(new LightningPower());
        ironManWithLightning.usePower();

        Hero thorWithFlight=new Thor(new FlightPower());
        thorWithFlight.usePower();

    }
}