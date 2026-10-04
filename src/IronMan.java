public class IronMan extends Hero{
    public IronMan(Power power){
        super(power);
    }
    @Override
    public void usePower(){
        System.out.println("Iron Man: ");
        power.usePower();
    }
}
