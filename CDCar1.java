package projects;

import java.util.Map;
import java.util.HashMap;
/**
 * Holds proper methods and values for the CD Car project
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class CDCar1
{
    private static Map<String, Integer> supplies; 
    private static String link;
    /**
     * Puts materials in supplies list
     */
    public CDCar1()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("CD", 4); 
        supplies.put("Paper", 4); 
        supplies.put("Tape", 1); 
        supplies.put("Pencil", 1); 
        supplies.put("GlueGun", 1); 
        supplies.put("Stick", 1); 
        supplies.put("RubberBands", 3); 
        


        link = "https://www.youtube.com/watch?v=ssAdZJXoUP0&ab_channel=SemiHighProduction";
    }

   /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("CD") && name.get("CD") >= 4 
            && name.containsKey("Paper") && name.get("Paper") >= 4 
            && name.containsKey("Tape") && name.get("Tape") >= 1
            && name.containsKey("Pencil") && name.get("Pencil") >= 1
            && name.containsKey("GlueGun") && name.get("GlueGun") >= 1
            && name.containsKey("Stick") && name.get("Stick") >= 1
            && name.containsKey("RubberBands") && name.get("RubberBands") >= 1;
      
        
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
