package Helpers;


import com.jayway.jsonpath.JsonPath;
import java.io.IOException;
import java.nio.charset.StandardCharsets;




public class LanguageHelpers {

    public static String getUtteranceFromJSONFile(String sRegion, String sRoom, String sData) {

        try {
            String str = FileHelpers.readFile(DriverHelpers.rootLocation + "/src/test/resources/Lang Json", StandardCharsets.UTF_8);
            String jsonPathExpression = "$.regions[?(@.code == '" + sRegion + "')].rooms[?(@.name=='" + sRoom + "')].utterances[?(@.Key=='" + sData + "')].Value";

            Object jsonresult = JsonPath.parse(str).read(jsonPathExpression);


            return TrimJSONResults(jsonresult.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "OOps";
    }


    public static String getCopyTextFromJSONFile(String sRegion, String sData){


        try {
            String str = FileHelpers.readFile(DriverHelpers.rootLocation + "/src/test/resources/Lang Json", StandardCharsets.UTF_8);
            String jsonPathExpression = "$.regions[?(@.code == '" + sRegion + "')].Copy[?(@.Key=='" + sData + "')].Value";

            Object jsonresult = JsonPath.parse(str).read(jsonPathExpression);


            return TrimJSONResults(jsonresult.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "OOps";
    }

    public static String getUrlFromJSONFile(String sRegion) {

        try {
            String str = FileHelpers.readFile(DriverHelpers.rootLocation + "/src/test/resources/Lang Json", StandardCharsets.UTF_8);

            String jsonPathExpression = "$.regions[?(@.code == '" + sRegion + "')].url";

            Object jsonresult = JsonPath.parse(str).read(jsonPathExpression);

            String rURL = jsonresult.toString();


            rURL = TrimJSONResults(rURL);
            return rURL.replace("\\","");

        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR";
        }


    }


private static String TrimJSONResults(String inString){


     return inString.substring(2,inString.length()-2);



}





}



