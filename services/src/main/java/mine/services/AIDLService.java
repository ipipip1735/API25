package mine.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2017/4/21.
 */

public class AIDLService extends Service {



    public AIDLService() {
        super();
        System.out.println("*********AIDLService constructor*********");
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

        System.out.println("******** service onBind **********");

        MyBind myBind = new MyBind();
        return myBind;
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


    class MyBind extends IMyAidlInterface.Stub {

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            System.out.println("basic Types");
        }

        public int show(int i) {
            return i;
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            System.out.println(code);
            System.out.println(data);
            System.out.println(reply);
            System.out.println(flags);
            return super.onTransact(code, data, reply, flags);
        }
    }




}
