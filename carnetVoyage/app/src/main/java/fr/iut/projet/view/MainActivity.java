package fr.iut.projet.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import fr.iut.projet.R;
import fr.iut.projet.view.fragments.Create;
import fr.iut.projet.view.fragments.Home;
import fr.iut.projet.view.fragments.Logs;
import fr.iut.projet.view.fragments.Map;

public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView menu = findViewById(R.id.bottom_navigation);

        buttonClicOnNavHome();

        menu.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    buttonClicOnNavHome();
                    break;
                case R.id.nav_logs:
                    buttonClicOnNavLogs();
                    break;
                case R.id.nav_create:
                    buttonClicOnNavCreate();
                    break;
                case R.id.nav_map:
                    buttonClicOnNavMap();
                    break;
            }
            return true;
        });

    }

    private void buttonClicOnNavHome() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.afficheurfragment,new Home(), null)
                .commit();
    }

    private void buttonClicOnNavMap() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.afficheurfragment,new Map(), null)
                .commit();
    }

    private void buttonClicOnNavLogs() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.afficheurfragment,new Logs(), null)
                .commit();
    }

    private void buttonClicOnNavCreate(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.afficheurfragment,new Create(), null)
                .commit();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        
    }

    public void clicBoutonCreate(View sender){
        Intent monIntent=new Intent(this, CreateActivity.class);
        startActivity(monIntent);
    }
}