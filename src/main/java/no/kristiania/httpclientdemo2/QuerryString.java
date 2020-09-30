package no.kristiania.httpclientdemo2;

public class QuerryString {
    private final String value;
    private final String parameterName;

    public QuerryString(String queryString){
        int equalsPos = queryString.indexOf('=');
        value = queryString.substring(equalsPos+1);
        parameterName = queryString.substring(0, equalsPos);
    }

    public String getParameter(String name) {

        if (name.equals(parameterName)){
            return value;
        }
        return null;
    }
}

