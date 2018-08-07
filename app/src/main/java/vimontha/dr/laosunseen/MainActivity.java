package vimontha.dr.laosunseen;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vimontha.dr.laosunseen.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new MainFragment();

        getSupportFragmentManager().beginTransaction()

                .add(R.id.fragment_container, fragment)
                .commit();
    }
}
