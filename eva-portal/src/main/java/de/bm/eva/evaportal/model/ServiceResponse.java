package de.bm.eva.evaportal.model;

/**
 * @author Marcel Vieren
 */
/* ServiceResponse ist eine Klasse um Fehlercodes und Mitteilugen aus dem Service an den User zu übertragen */
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
