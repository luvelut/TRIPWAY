package fr.iut.projet.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import fr.iut.projet.R;

public class AddTextActivity extends AppCompatActivity {


    static final String KEY_DONNEE ="madonnee";

    //objet graphique
    private Button btnValider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_text_activity);
        initActivity();

    }

    //METHODE INIT APPELEE A LA CREATION DE L'ACTIVITE

    private void initActivity() {
        //récupération des objets graphiques
        btnValider = (Button)findViewById(R.id.btn_valider_texte);

        //initialisation des clics sur les boutons
        createOnClicValider();

    }

    //SAUVEGARDE LEGERE

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        //On sauvegarde le texte de l'EditTexte dans le Bundle
        EditText texte = (EditText) findViewById(R.id.texte_a_ajouter);
        outState.putString("TEXTE_X", texte.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        //On récupère le texte qui est dans le Bundle
        super.onRestoreInstanceState(savedInstanceState);
        ((EditText)findViewById(R.id.texte_a_ajouter)).setText(String.valueOf(savedInstanceState.getString("TEXTE_X")));
    }

    //GESTION DU CLIC SUR LE BOUTON VALIDER

    private void createOnClicValider(){
        btnValider.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicValider();
            }
        });
    }

    private void clicValider(){
        EditText texte = (EditText) findViewById(R.id.texte_a_ajouter);
        Intent monIntent=new Intent();
        monIntent.putExtra(KEY_DONNEE,texte.getText().toString()); //enregistre la donnee rentrée par l'utilisateur
        setResult(Activity.RESULT_CANCELED, monIntent); //permet de revenir à l'activité d'où on vient (pour ne pas perdre le carnet)
        finish();
    }



}
