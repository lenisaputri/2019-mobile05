package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_pushups(View view) {
        Fragment fragment= getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof HandstandFragment || fragment instanceof DipsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_placeholder, new PushupsFragment(), "PUSHUPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void click_dips(View view) {
        Fragment fragment= getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof HandstandFragment || fragment instanceof PushupsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_placeholder, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void click_handstand(View view) {
        Fragment fragment= getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if (fragment == null || fragment instanceof PushupsFragment || fragment instanceof DipsFragment) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
            fragmentTransaction.replace(R.id.fragment_placeholder, new HandstandFragment(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
