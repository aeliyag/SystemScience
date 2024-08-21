package projects;

import java.util.Map;
import java.util.HashMap;

/**
 * Holds proper methods and values for the Cardboard Desk Calendar project 
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class CardboardDeskCalendar
{
    private static Map<String, Integer> supplies; 
    private static String link;

    /**
     * Puts materials in supplies list
     */
    public CardboardDeskCalendar()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("CardboardBox", 1); 
        supplies.put("Glue", 1); 
        supplies.put("Sissors", 1); 
        supplies.put("Pencil", 1); 
        supplies.put("GlueGun", 1); 
        supplies.put("Paper", 1); 
        


        link = "https://www.youtube.com/watch?v=CrngKvTJagk&ab_channel=TatzkreenArt";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {   
        return name.containsKey("CardboardBox") && name.get("CardboardBox") >= 1 
            && name.containsKey("Glue") && name.get("Glue") >= 1 
            && name.containsKey("Sissors") && name.get("Sissors") >= 1
            && name.containsKey("Pencil") && name.get("Pencil") >= 1
            && name.containsKey("GlueGun") && name.get("GlueGun") >= 1
            && name.containsKey("Paper") && name.get("Paper") >= 1;
      
        
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
