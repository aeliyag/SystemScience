package projects;

import java.util.Map;
import java.util.HashMap;
/**
 * Holds proper methods and values for the Drawing project
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class Drawing
{
    private static Map<String, Integer> supplies; 
    private static String link;
    /**
     * Puts materials in supplies list
     */
    public Drawing()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("Pencil", 1); 
        supplies.put("Paper", 1); 
        


        link = "https://www.youtube.com/@ArtofWeiHo";
    }

    /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("Pencil") && name.get("Pencil") >= 1 
            && name.containsKey("Paper") && name.get("Paper") >= 1 ;
      
        
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
