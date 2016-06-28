/**
 * Created by davidstone on 6/28/16.
 */
public class Samsung extends Remote {

    public Samsung(){
        super();
    }

    @Override
    public boolean isWaterProof() {
        String isWaterProof = "SamsungProof";
        return false;
    }

    @Override
    public String supportsBrands() {
        System.out.println("SamsungBrands");
        return null;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("SamsungCharge");
        return false;

    }

    public void channelUp(){

    }

    public void channelDown(){

    }

    public void volumeUp(){

    }

    public void volumeDown(){

    }
}
