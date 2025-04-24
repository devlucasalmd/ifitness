package br.edu.ifspcjo.ads.dw2sa.ifitness.domain.model;

public enum ActivityType {
	CAMINHADA ("Caminhada"),
    CICLISMO ("Ciclismo"),
    CORRIDA ("Corrida"),
    NATACAO ("Natação");

    private String type;

    ActivityType(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
