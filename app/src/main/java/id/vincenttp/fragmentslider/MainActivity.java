package id.vincenttp.fragmentslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    boolean wasOpen = false;
    Fragment fragmentSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_open);

        fragmentSlider = new SlideFragment();

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //new CDialog(this).show();
        if (wasOpen){
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
            transaction.remove(fragmentSlider);
            transaction.commit();
            wasOpen = false;
        }else {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
            transaction.add(R.id.container, fragmentSlider);
            transaction.commit();
            wasOpen = true;
        }
    }
}
