package mine.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/4/14.
 */

public class ActionModeActivity extends AppCompatActivity implements ActionMode.Callback {


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        System.out.println("**********  ContextMenuActivity  onCreate  ***********");

        setContentView(R.layout.activity_task);

//        registerForContextMenu(findViewById(R.id.textView));


    }


    @Override
    protected void onStop() {
        unregisterForContextMenu(findViewById(R.id.textView));
        super.onStop();
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        System.out.println("*******Menu*********");
//        getMenuInflater().inflate(R.menu.menu_opts, menu);
//
//
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        System.out.println("******Prepare*Menu********");
//
//        System.out.println(menu.size());
////        System.out.println(menu.getItem(0).setTitle("DD"));
////        System.out.println(menu.findItem(R.id.itemOne).setTitle("One"));
//
//
//        return super.onPrepareOptionsMenu(menu);
//    }

//    @Override
//    public void onOptionsMenuClosed(Menu menu) {
//        super.onOptionsMenuClosed(menu);
//    }


//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        System.out.println("*******  ContextMenuActivity  onCreateContextMenu!!  *********");
//
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_item, menu);
//
//        super.onCreateContextMenu(menu, v, menuInfo);
//    }


//    @Override
//    public void openContextMenu(View view) {
//        System.out.println("*******  ContextMenuActivity  openContextMenu  *********");
//        super.openContextMenu(view);
//    }

//    @Override
//    public void closeContextMenu() {
//        System.out.println("*******  ContextMenuActivity  closeContextMenu  *********");
//        super.closeContextMenu();
//    }

//    @Override
//    public void onContextMenuClosed(Menu menu) {
//        System.out.println("*******  ContextMenuActivity  onContextMenuClosed  *********");
//        super.onContextMenuClosed(menu);
//    }

//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        System.out.println("*******  ContextMenuActivity  onContextItemSelected  *********");
////        return super.onContextItemSelected(item);
//        return true;
//    }


    public void initLoad(View view) {

        startActionMode(this);
//        view.setSelected(true);


    }


    @Override
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        System.out.println("*******  onCreateActionMode  *********");
        MenuInflater inflater = mode.getMenuInflater();
        inflater.inflate(R.menu.menu_opts, menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        System.out.println("*******  onPrepareActionMode  *********");
        mode.setTitle("title");
        mode.setSubtitle("subTitle");

//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.w1);
//        mode.setCustomView(imageView);
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        System.out.println("*******  onActionItemClicked  *********");
        mode.finish();
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode mode) {
        System.out.println("*******  onDestroyActionMode  *********");
    }

}

