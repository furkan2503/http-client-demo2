package no.kristiania.httpclientdemo2;

public class QuerryString {
    private final String value;

    public QuerryString(String queryString){
        int equalsPos = queryString.indexOf('=');
        value = queryString.substring(equalsPos+1);
    }

    public String getParameter(String name) {
        return value;
    }
}

