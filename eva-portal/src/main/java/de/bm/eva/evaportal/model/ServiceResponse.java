package de.bm.eva.evaportal.model;

public class ServiceResponse {

    private String fehlertext;

    public ServiceResponse(String fehlertext) {
        super();
        this.fehlertext = fehlertext;
    }

    public String getFehlertext() {
        return fehlertext;
    }

    public void setFehlertext(String fehlertext) {
        this.fehlertext = fehlertext;
    }

}
