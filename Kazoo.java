package projects;

import java.util.Map;
import java.util.HashMap;
/**
 * Holds proper methods and values for the Kazoo
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class Kazoo 
{
    private static Map<String, Integer> supplies; 
    private static String link;

    /**
     * Puts materials in supplies list
     */
    public Kazoo()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("PopsicleSticks", 2); 
        supplies.put("RubberBands", 3); 
        supplies.put("Toothpick", 2); 


        


        link = "https://www.itsalwaysautumn.com/kid-made-drum-set-kazoo-easy-indoor-craft.html";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        
        return name.containsKey("PopsicleSticks") && name.get("PopsicleSticks") >= 2
            && name.containsKey("RubberBands") && name.get("RubberBands") >= 3 
            && name.containsKey("Toothpick") && name.get("Toothpick") >= 2 ;
      
        
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
