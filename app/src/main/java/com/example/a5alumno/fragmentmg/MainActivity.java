package com.example.a5alumno.fragmentmg;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSwapFrag;
    private Boolean bandeira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bandeira = true;
        //Primero miro que se esté usando el layout que contenga el FrameLayout
        if (findViewById(R.id.fragment_container) != null) {
            Log.i("InfoUtil", "Entramos en LayoutLand que contiene el fragmentContainer");
            // if (savedInstanceState != null) {
            //   Log.i("InfoUtil","Se ha retornado");
            // return;
            //}
            final BlankFragment1 firstFragment = new BlankFragment1();
            final BlankFragment2 secondFragment = new BlankFragment2();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();

            btnSwapFrag = (Button) findViewById(R.id.btnSwapFragment);
            btnSwapFrag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (bandeira) {
                        bandeira = false;
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, secondFragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                    } else {
                        bandeira = true;
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragment_container, firstFragment);
                        transaction.addToBackStack(null);
                        transaction.commit();
                    }
                }
            });
        }

    }
}
