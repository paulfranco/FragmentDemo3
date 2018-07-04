package co.paulfran.paulfranco.fragmentdemo3;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment {

    private static final String TAG = FragmentA.class.getSimpleName();

    // Beging initialization of the button and text view
    private Button btnAdd;
    private TextView txvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Log.i(TAG, "onCreateView()");

        // Complete initialization of the button and text view
        // Inside the FragmentA.java findViewBYId() method does not exists. for that purpose we need to make use of the ( view )
        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        txvResult = (TextView) view.findViewById(R.id.txvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 


            }
        });



        return view;
    }



}
