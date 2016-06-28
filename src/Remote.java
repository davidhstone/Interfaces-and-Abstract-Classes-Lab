import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by davidstone on 6/28/16.
 */
public abstract class Remote implements WaterProof, Rechargeable, Universal{
    //needsBatteries and supportsUsb
    boolean mNeedsBatteries;
    boolean mSupportUsb;

    public Remote (boolean needsBatteries, boolean supportUsb) {

        mNeedsBatteries = needsBatteries;
        mSupportUsb = supportUsb;
    }

    public Remote (){
        mNeedsBatteries = true;
    }

    public boolean ismNeedsBatteries() {
        return mNeedsBatteries;
    }

    public void setmNeedsBatteries(boolean mNeedsBatteries) {
        this.mNeedsBatteries = mNeedsBatteries;
    }

    public boolean ismSupportUsb() {
        return mSupportUsb;
    }

    public void setmSupportUsb(boolean mSupportUsb) {
        this.mSupportUsb = mSupportUsb;
    }

    public void powerButtonPressed(){
        System.out.println();
    }

    public void numberButtonPressed(int number){
        System.out.println("Changing channel to " + number);
    }
//channelUp, channelDown, volumeUp, volumeDown
    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();
}
