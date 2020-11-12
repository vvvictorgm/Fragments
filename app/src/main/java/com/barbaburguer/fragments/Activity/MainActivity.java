package com.barbaburguer.fragments.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.barbaburguer.fragments.Fragment.ChamadasFragment;
import com.barbaburguer.fragments.Fragment.ConversasFragment;
import com.barbaburguer.fragments.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    private ChamadasFragment chamadasFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContatos);
        buttonConversa = findViewById(R.id.buttonConversas);
        //remover sombra da action bar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();
        chamadasFragment = new ChamadasFragment();

        //configurar um objeto ara o framento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();
    }
    public void Conversas(View view){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

    } public void Chamadas(View view){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, chamadasFragment);
        transaction.commit();

    }

}
