package mine.myparcel;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;

/**
 * Created by Administrator on 2017/4/21.
 */

public class MyMessenger {

    Messenger messenger = null;

    public MyMessenger(Handler handler) {
        System.out.println(" my Messenger");
        messenger = new Messenger(handler);
    }

    public void go() {


//        messenger.send();


    }
}
