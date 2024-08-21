package projects;

import java.util.Map;
import java.util.HashMap;
/**
 * Holds proper methods and values for the Drum
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class Drum 
{
    private static Map<String, Integer> supplies; 
    private static String link;
    /**
     * Puts materials in supplies list
     */
    public Drum()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("Cans", 1); 
        supplies.put("Balloon", 1);
        supplies.put("RubberBands", 1);
        supplies.put("Dowel", 1);
        supplies.put("Stick", 1);


        link = "https://www.itsalwaysautumn.com/kid-made-drum-set-kazoo-easy-indoor-craft.html";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("Cans") && name.get("Cans") >= 1 
            && name.containsKey("Balloon") && name.get("Balloon") >= 1
             && name.containsKey("RubberBands") && name.get("RubberBands") >= 1 
             && (name.containsKey("Dowel") && name.get("Dowel") >= 1 
             || name.containsKey("Stick") && name.get("Stick") >= 1  ); 
      
        
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
