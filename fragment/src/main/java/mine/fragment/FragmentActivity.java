package mine.fragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import layout.BlankFragment;

public class FragmentActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        System.out.println("on fragment interaction");
        System.out.println( uri.toString());
    }
}
