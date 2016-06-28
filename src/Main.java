import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Remote> remotes = new ArrayList<>();

        remotes.add(new Samsung());
        remotes.add(new LG());
        remotes.add(new Sony());

        for (Remote remote : remotes) {
            //   animal.says();
         //   System.out.println(remote.isWaterProof());
         //   System.out.println(remote.isRechargeable());
         //   System.out.println(remote.supportsBrands());

            remote.numberButtonPressed(5);
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
        }
    }
    //HASHBROWN NO RED SQUIGGLIES!!!
}
