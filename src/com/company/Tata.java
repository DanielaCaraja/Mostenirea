
package com.company;

public class Tata {
    private String NumeleDeFamilie;
    private String CuloareaOchilor;
    private double Inaltimea;
    private String CuloareaParului;


    Tata( String NumeleDeFamilie, String CuloareaOchilor, double Inaltimea, String CuloareaParului){
        this.NumeleDeFamilie=NumeleDeFamilie;
        this.CuloareaOchilor=CuloareaOchilor;
        this.Inaltimea=Inaltimea;
        this.CuloareaParului=CuloareaParului;
    }
    public String getNumeleDeFamilie() { return this.NumeleDeFamilie; }
    public String getCuloareaOchilor() { return this.CuloareaOchilor; }
    public double getInaltimea(){ return this.Inaltimea; }
    public String getCuloareaParului(){ return this.CuloareaParului; }

    public void setCuloareaOchilor(String CuloareaOchilor) {
        this.CuloareaOchilor = CuloareaOchilor;
    }

    public void setNumeleDeFamilie(String NumeleDeFamilie) {
        this.NumeleDeFamilie = NumeleDeFamilie;
    }

    public void setInaltimea(double Inaltimea) {
        this.Inaltimea = Inaltimea;
    }

    public void setCuloareaParului(String CuloareaParului) {
        this.CuloareaParului = CuloareaParului;
    }
}