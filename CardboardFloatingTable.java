package projects;

import java.util.Map;
import java.util.HashMap;

/**
 * Holds proper methods for the Cardboard FLoating table project
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class CardboardFloatingTable
{
    private static Map<String, Integer> supplies; 
    private static String link;

    /**
     * Adds materials to supplies list
     */
    public CardboardFloatingTable()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("CardboardBox", 1); 
        supplies.put("Glue", 1); 
        supplies.put("GlueGun", 1);  // glue or glue gun
        supplies.put("Ruler", 1); 
        supplies.put("BoxCutter", 1); 
        supplies.put("Sissors", 1);  // boxcutter or sissors 
        supplies.put("String", 1); 
        supplies.put("Stick", 1); 
        


        link = "https://www.youtube.com/watch?v=Mn4xueq2Vlc&ab_channel=TatzkreenArt";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true if materials are inside, false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("CardboardBox") && name.get("CardboardBox") >= 1 
            && ( name.containsKey("Glue") && name.get("Glue") >= 1  
            || name.containsKey("GlueGun") && name.get("GlueGun") >= 1)
            && name.containsKey("Ruler") && name.get("Ruler") >= 1 
            && ( name.containsKey("BoxCutter") && name.get("BoxCutter") >= 1  
            || name.containsKey("Sissors") && name.get("Sissors") >= 1)
            && name.containsKey("String") && name.get("String") >= 1 
            && name.containsKey("Stick") && name.get("Stick") >= 1 ;
      
        
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
