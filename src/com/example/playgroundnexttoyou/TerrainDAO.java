package com.example.playgroundnexttoyou;

import android.content.Context;

public class TerrainDAO extends DAOBase{
	  public TerrainDAO(Context pContext) {
		super(pContext);
		// TODO Auto-generated constructor stub
	}

	public static final String TABLE_NAME = "Terrain";
	  public static final String KEY = "id";
	  public static final String DEPARTEMENT = "departement";
	  public static final String VILLE = "ville";
	  public static final String ADRESSE = "adresse" ;
	  public static final String FREQUENTATION = "frequentation";

	  public static final String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + " (" + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " + DEPARTEMENT + " TEXT, " + VILLE + " TEXT, " + ADRESSE+"TEXT, "+FREQUENTATION+"INTEGER);";

	  public static final String TABLE_DROP =  "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

	  /**
	   * @param m le métier à ajouter à la base
	   */
	  public void ajouter(Terrain m) {
	    // CODE
	  }

	  /**
	   * @param id l'identifiant du métier à supprimer
	   */
	  public void supprimer(long id) {
	    // CODE
	  }

	  /**
	   * @param m le métier modifié
	   */
	  public void modifier(Terrain m) {
	    // CODE
	  }

	  /**
	   * @param id l'identifiant du métier à récupérer
	   */
	  public Terrain selectionner(long id) {
		return null;
	    // CODE
	  }
	}