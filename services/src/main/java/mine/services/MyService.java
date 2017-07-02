package mine.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/21.
 */

public class MyService extends Service {


    private ArrayList<Integer> ids = new ArrayList<Integer>();

    public MyService() {
        super();
        System.out.println("*********MyService constructor*********");
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
        MyBinder myBinder = new MyBinder();
        return myBinder;
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




}
