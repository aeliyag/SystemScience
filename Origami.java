package projects;

import java.util.Map;
import java.util.HashMap;
/**
 * Holds proper methods and values for the Origami
 * @author Aeliya Grover
 * @version May 11th 2024
 */
public class Origami
{
    private static Map<String, Integer> supplies; 
    private static String link;
    /**
     * Puts materials in supplies list
     */
    public Origami()
    {
        supplies = new HashMap<String, Integer>();
        supplies.put("Paper", 1); 
        


        link = "https://www.youtube.com/c/origamitutorials";
    }

   /**
     * Takes in the list of materials and determins if there is enough materials to work on project
     * @param name
     * @return true enough materials; false otherwise
     */
    public boolean contains(Map<String, Integer> name)
    {
        return name.containsKey("Paper") && name.get("Paper") >= 1 ;
      
        
    }

    /**
     * returns the link for instrucitons to work on the project
     * @return link
     */
    public String getLink()
    {
        return link;
    }

    
}
