package mine.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

import java.util.Set;

/**
 * Created by Administrator on 2017/4/14.
 */

public class ViewActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        System.out.println("*******  View  on  Create  Menu!  *********");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        System.out.println("*******  View  on  Prepare  Menu!!!  *********");
        


        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        System.out.println("*******  View  onOptionsItemSelected!!  *********");
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onOptionsMenuClosed(Menu menu) {
        System.out.println("*******  View  onOptionsMenuClosed!!  *********");
        super.onOptionsMenuClosed(menu);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  View  onCreate  ***********");

        setContentView(R.layout.activity_task);
    }
    

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        System.out.println("*******  View  onContextItemSelected!!  *********");
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        System.out.println("*******  View  onCreateContextMenu!!  *********");
        super.onCreateContextMenu(menu, v, menuInfo);
    }


    @Override
    protected void onNewIntent(Intent intent) {
        System.out.println("****  View  onNewIntent  *****");
        super.onNewIntent(intent);
    }


    @Override
    protected void onStart() {
        System.out.println("****View**onStart*****");
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        System.out.println("****  View  onRestoreInstanceState  *****");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestart() {
        System.out.println("****View**onRestart*****");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        System.out.println("****View**onResume*****");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("****View**onPause*****");
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        System.out.println("********View***onBackPressed**********");
        super.onBackPressed();
    }


    @Override
    protected void onStop() {
        System.out.println("****View**onStop*****");
        super.onStop();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        System.out.println("****  View   onSaveInstanceState  *****");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        System.out.println("****View**onDestroy*****");
        super.onDestroy();
    }


    public void initLoad(View view) {



    }
}

