package projects;

import java.util.Map;
import java.util.HashMap;

/**
 * Holds proper methods and values for the Hanging Planter
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class HangingPlanter 
{
    private static Map<String, Integer> supplies; 
    private static String link;
    /**
     * Puts materials in supplies list
     */
    public HangingPlanter()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("PlasticJugs", 1); 
        supplies.put("Sharpie", 1); 
        supplies.put("Sissors", 1); 
        


        link = "https://www.youtube.com/watch?v=5l2A_Jb17jg&t=58s&ab_channel=GOODMagazine,"
            + " time 0:56";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("PlasticJugs") && name.get("PlasticJugs") >= 1 
            && name.containsKey("Sharpie") && name.get("Sharpie") >= 1 
            && name.containsKey("Sissors") && name.get("Sissors") >= 1 ;
      
        
    }

    /**
     * returns the link for instrucitons to work on the project
     * @return link to build project
     */
    public String getLink()
    {
        return link;
    }

    
}
