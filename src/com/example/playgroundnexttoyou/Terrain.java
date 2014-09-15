package com.example.playgroundnexttoyou;

public class Terrain {
	private long id;
	  private String departement;
	  private String ville;
	  private String adresse;
	  private int frequentation;
	  
	  public Terrain(long id, String departement, String ville, String adresse, int frequentation) {
	    super();
	    this.id = id;
	    this.departement = departement;
	    this.ville = ville;
	    this.adresse = adresse;
	    this.frequentation = frequentation;
	  }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getFrequentation() {
		return frequentation;
	}

	public void setFrequentation(int frequentation) {
		this.frequentation = frequentation;
	}
	  
	}
	  