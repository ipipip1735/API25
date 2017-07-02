package mine.services;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

import java.util.Set;

/**
 * Created by Administrator on 2017/4/14.
 */

public class MessengerActivity extends AppCompatActivity implements ServiceConnection {
    public Intent intent = null;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        System.out.println("*******  Example  on  Create  Menu!  *********");
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        System.out.println("*******  Example  on  Prepare  Menu!!!  *********");
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  Example  onCreate  ***********");

        setContentView(R.layout.activity_main);
        if (bundle == null) {
            System.out.println("Example bundle is empty");
        } else {
            System.out.println(bundle.size());
            Set<String> keySet = bundle.keySet();
            for (String i : keySet) {
                System.out.println(i);
            }
        }


        ToolClass.showProcess();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("****  Example  onNewIntent  *****");
        super.onNewIntent(intent);
    }


    @Override
    protected void onStart() {
        System.out.println("****Example**onStart*****");
        super.onStart();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        System.out.println("****  Example  onRestoreInstanceState  *****");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        System.out.println("****Example**onRestart*****");
        super.onRestart();
    }



    @Override
    public void onBackPressed() {
        System.out.println("********Example***onBackPressed**********");
        super.onBackPressed();
    }


    @Override
    protected void onStop() {
        System.out.println("****Example**onStop*****");
        super.onStop();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        System.out.println("****  Example   onSaveInstanceState  *****");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("****Example**onDestroy*****");
        super.onDestroy();
    }



    @Override
    protected void onResume() {
        System.out.println("****Example**onResume*****");
        super.onResume();


    }

    @Override
    protected void onPause() {
        System.out.println("****Example**onPause*****");
        super.onPause();

    }


    public void startService(View view) {
        System.out.println("-=-=-=  start service  =-=-=-");
        intent = new Intent(this, MyService.class);
//        intent.setAction("myService").setPackage(getPackageName());

    }

    public void stopService(View view) {
        System.out.println("-=-=-=  stop service  =-=-=-");
        stopService(intent);
    }

    public void bindService(View view) {

        Message message = new Message();
        System.out.println("-=-=-=  bind service  =-=-=-");

       intent = new Intent(this, MyMessengerService.class);

//        Intent intent = new Intent(this, MyIntentService.class);
//        Intent intent = new Intent(this, MyFrontService.class);

        bindService(intent, this, Service.BIND_AUTO_CREATE);
        ToolClass.showProcess();




    }

    public void unbindService(View view) {

        System.out.println("-=-=-=  unbind service  =-=-=-");

//        Intent intent = new Intent(this, MyIntentService.class);
//        Intent intent = new Intent(this, MyFrontService.class);

        unbindService(this);


    }






    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        System.out.println("*********service onServiceConnected************");
        System.out.println(name);
        System.out.println(service);
        ToolClass.showProcess();
        Messenger messenger = new Messenger(service);

        System.out.println("messenger is " + messenger);

        Message message = Message.obtain();
        message.what = 663;

        try {
            messenger.send(message);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        System.out.println("*********onService Dis connected************");
        ToolClass.showProcess();
        System.out.println(name);
    }









}