package mine.services;

import android.os.Binder;


/**
 * Created by Administrator on 2017/4/21.
 */

public class MyBinder extends Binder {

    public MyBinder() {
        System.out.println("~my Binder constractor~");
        System.out.println(this);
    }


    public void showClass() {
        System.out.println("IBind showClass");
    }

}
