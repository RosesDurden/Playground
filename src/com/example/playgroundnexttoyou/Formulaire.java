package com.example.playgroundnexttoyou;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Formulaire extends Activity {
	
	public TextView departement;
	public TextView ville;
	public TextView adresse;
	public TextView frequentation;
	public Button valider; 
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulaire);
        
        departement = (TextView)findViewById(R.id.departement);
        departement.setText("Département : ");
        ville = (TextView)findViewById(R.id.ville);
        ville.setText("Ville : ");
        adresse = (TextView)findViewById(R.id.adresse);
        adresse.setText("Adresse : ");
        frequentation = (TextView)findViewById(R.id.frequentation);
        frequentation.setText("Frequentation : ");
        
    }
}
