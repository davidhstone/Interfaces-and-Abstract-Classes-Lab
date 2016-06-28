/**
 * Created by davidstone on 6/28/16.
 */
public class Sony extends Remote{

    public Sony()
    {
        super();
    }

    @Override
    public boolean isWaterProof() {
        System.out.println("SonyProof");
        return false;
    }

    @Override
    public String supportsBrands() {
        System.out.println("SonyBrands");
        return null;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("SonyRecharge");
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
