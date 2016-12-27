import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by 12045 on 27/12/16.
 */
public class ParseJsonFile {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        try{
        Object obj =parser.parse(new FileReader("/Users/12045/Documents/Data_P/git/Json_P/JsonParseExmpl/src/main/resources/sampleJsonFile.json"));
        JSONObject jsonObject=(JSONObject) obj;

        String name= (String) jsonObject.get("Name");
        String author= (String) jsonObject.get("Author");
        JSONArray companyList= (JSONArray) jsonObject.get("Company List");

        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("\nCompany List: ");
        Iterator<String> itr=companyList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }


    }catch (Exception e){
        e.printStackTrace();
        }
    }


}
