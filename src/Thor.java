public class Thor extends Hero{
    public Thor(Power power){
        super(power);
    }
    @Override
    public void usePower(){
        System.out.println("Thor: ");
        power.usePower();
    }
}
