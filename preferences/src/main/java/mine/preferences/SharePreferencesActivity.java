package mine.preferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import java.util.Map;

public class SharePreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("--  onCreate --");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);



//        System.out.println(PreferenceManager.getDefaultSharedPreferencesName(this));
//        System.out.println(PreferenceManager.getDefaultSharedPreferences(this));
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
//        Map<String, ?> map = sharedPref.getAll();
//
//        System.out.println(map.size());
//
//
//        for (String key : map.keySet()) {
//            System.out.println("key= "+ key );
//            System.out.println("key= "+ key + " and value= " + map.get(key));
//
//        }
//
//
//        sharedPref.edit().putBoolean("dkdk", true).commit();
//
//        map = sharedPref.getAll();
//
//        System.out.println(map.get("dkdk"));








    }





}
