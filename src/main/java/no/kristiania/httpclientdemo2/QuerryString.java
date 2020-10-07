package no.kristiania.httpclientdemo2;

import java.util.HashMap;
import java.util.Map;

public class QuerryString {
    private Map<String, String> parameters = new HashMap<>();

    public QuerryString(String querryString){
        for (String parameter : querryString.split("&")) {
            int equalsPos = parameter.indexOf('=');
            String value = parameter.substring(equalsPos+1);
            String parameterName = parameter.substring(0, equalsPos);
            parameters.put(parameterName, value);

        }
    }

    public String getParameter(String name) {
        return parameters.get(name);
    }
}

