package co.paulfran.paulfranco.fragmentdemo3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private FragmentManager manager;
    private EditText etFirstNumber, etSecondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);
    }


    public void sendDataToFragment(View view) {

        // Add FragmentA into the inside the container layout containerFragmentA
        FragmentA framentA = new FragmentA();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA, framentA, "fragA");
        transaction.commit();

    }
}