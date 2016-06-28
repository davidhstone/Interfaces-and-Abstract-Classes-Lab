/**
 * Created by davidstone on 6/28/16.
 */
public class LG extends Remote{


    public LG() {
        super();
    }


    @Override
    public boolean isWaterProof() {
        System.out.println("LGProof");
        return false;
    }

    @Override
    public String supportsBrands() {
        System.out.println("LGBrands");
        return null;
    }

    @Override
    public boolean isRechargeable() {
        System.out.println("LGRecharge");
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
