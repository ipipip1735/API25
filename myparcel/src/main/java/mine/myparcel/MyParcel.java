package mine.myparcel;

import android.os.Parcel;

/**
 * Created by Administrator on 2017/4/21.
 */

public class MyParcel {

    Parcel mParcel = Parcel.obtain();

    public MyParcel() {
        System.out.println("my parcel");

    }

    public void opareteData() {
        mParcel.writeInt(115);
        mParcel.writeInt(1155);

        mParcel.setDataPosition(0);
        System.out.println( mParcel.readInt());
        mParcel.setDataPosition(4);
        System.out.println( mParcel.readInt());
    }

}
