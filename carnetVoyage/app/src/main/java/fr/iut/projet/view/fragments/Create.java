package fr.iut.projet.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import fr.iut.projet.R;
import fr.iut.projet.modele.Carnet;
import fr.iut.projet.modele.GestionnaireCarnet;
import fr.iut.projet.view.CarnetActivity;
import fr.iut.projet.view.MainActivity;

public class Create extends Fragment {

    private MainActivity monActivite;

    static final String lecarnet="moncarnet";

    public Create() {
        super(R.layout.create);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        monActivite = ((MainActivity) getContext());
        init(view);
    }


    private void init(View v){
        Button b=(Button)v.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //On créer un nouveau carnet
                EditText edit_titre = (EditText) getView().findViewById(R.id.edit_titre_carnet);
                String texte_titre = edit_titre.getText().toString();

                EditText edit_date = (EditText) getView().findViewById(R.id.edit_date_carnet);
                String texte_date = edit_date.getText().toString();

                EditText edit_lieu = (EditText) getView().findViewById(R.id.edit_lieu_carnet);
                String texte_lieu = edit_lieu.getText().toString();

                Carnet carnet=new Carnet(texte_titre,texte_date,texte_lieu);
                Log.d("carnet :", carnet.toString()); //OK LE CARNET EST BIEN CREEE

                /* Euh pour plus tard surement pour sauvegarder tous les carnets au même endroit ?
                GestionnaireCarnet gestionnaire=new GestionnaireCarnet();
                gestionnaire.addCarnet(carnet); */


                //On passe à l'activité suivante
                Intent monIntent=new Intent(getActivity(), CarnetActivity.class);
                monIntent.putExtra(lecarnet,carnet); //On passe le nouveau carnet
                startActivity(monIntent);
            }
        } );
    }
}
