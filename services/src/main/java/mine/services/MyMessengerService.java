package mine.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/21.
 */

public class MyMessengerService extends Service {


    public Messenger messenger = null;

    public MyMessengerService() {
        super();
        System.out.println("*********MyMessengerService constructor*********");
        ToolClass.showProcess();


    }

    @Override
    public void onCreate() {
        System.out.println("*********service onCreate*********");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        System.out.println("*********service onDestroy*********");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        System.out.println("*********service onStartCommand*********");
        System.out.println("start id  is " + startId);
//        ids.add(new Integer(startId));


        ToolClass.showProcess();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onLowMemory() {
        System.out.println("*********service onLowMemory*********");

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("*********service onBind*********");
        IncomingHandler incomingHandler = new IncomingHandler();
        incomingHandler.showLooper();
        messenger = new Messenger(incomingHandler);
        return messenger.getBinder();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        System.out.println("*********service onUnbind*********");
        stopSelf();
        return super.onUnbind(intent);
    }


    @Override
    public void onRebind(Intent intent) {
        System.out.println("*********service onRebind*********");
        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        System.out.println("*********service onTaskRemoved*********");
        super.onTaskRemoved(rootIntent);
    }




    class IncomingHandler extends Handler {

        public void showLooper() {
            System.out.println(getLooper());
        }

        @Override
        public void handleMessage(Message msg) {
            System.out.println(" ~ IncomingHandler  handleMessage() ~ ");
            System.out.println(msg.what);
            ToolClass.showProcess();
        }
    }



}
