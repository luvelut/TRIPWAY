package fr.iut.projet.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import fr.iut.projet.R;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_activity);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ((EditText)findViewById(R.id.edit_titre_carnet)).setText(String.valueOf(savedInstanceState.getInt("POSITION_X")));
        ((EditText)findViewById(R.id.edit_date_carnet)).setText(String.valueOf(savedInstanceState.getInt("POSITION_X")));
        ((EditText)findViewById(R.id.edit_lieu_carnet)).setText(String.valueOf(savedInstanceState.getInt("POSITION_X")));
    }

    public void clicBoutonValider(View sender){
        Intent monIntent=new Intent(this, CarnetActivity.class);
        startActivity(monIntent);
    }
}
