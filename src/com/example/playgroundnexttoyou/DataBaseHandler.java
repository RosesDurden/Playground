package com.example.playgroundnexttoyou;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHandler extends SQLiteOpenHelper {
	
	  public DataBaseHandler(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	public static final String TERRAIN_KEY = "id";
	public static final String TERRAIN_DEPARTEMENT = "departement";
	public static final String TERRAIN_VILLE = "ville";
	public static final String TERRAIN_ADRESSE = "adresse" ;
	public static final String TERRAIN_FREQUENTATION = "frequentation";
	    
	  public static final String TERRAIN_TABLE_NAME = "Terrains";
	  public static final String TERRAIN_TABLE_CREATE =
	    "CREATE TABLE " + TERRAIN_TABLE_NAME + " (" +
	    		TERRAIN_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
	    		TERRAIN_DEPARTEMENT + " TEXT, " +
	    		TERRAIN_DEPARTEMENT + "INTEGER ," + 
	    		TERRAIN_ADRESSE + "TEXT, "+
	    		TERRAIN_FREQUENTATION + "INTEGER);";

	  @Override
	  public void onCreate(SQLiteDatabase db) {
	    db.execSQL(TERRAIN_TABLE_CREATE);
	  }

	  public static final String TERRAIN_TABLE_DROP = "DROP TABLE IF EXISTS " + TERRAIN_TABLE_NAME + ";";

	  @Override
	  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    db.execSQL(TERRAIN_TABLE_DROP);
	    onCreate(db);
	  }

	}