package com.company;

public class Fiu extends Tata {
    private String CuloareaPielii;
    private double Greutatea;

    Fiu( String NumeleDeFamilie, String CuloareaOchilor, double Inaltimea, String CuloareaParului, String CuloareaPielii , double Greutatea){
        super(NumeleDeFamilie, CuloareaOchilor, Inaltimea, CuloareaParului);
        this.CuloareaPielii=CuloareaPielii;
        this.Greutatea=Greutatea;
    }
    public String getCuloareaPielii(){return this.CuloareaPielii; }
    public double getGreutatea(){return this.Greutatea; }

    public void  setCuloareaPielii( String CuloareaPielii){
        this.CuloareaPielii=CuloareaPielii;
    }
    public void setGreutatea( double Greutatea){
        this.Greutatea=Greutatea;
    }

}
