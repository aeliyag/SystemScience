package projects;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Order - Takes in Material type and count
 * Returns list of projects that contain those materials
 * @author Aeliya Grover
 * @version May 11th 2024
 */

public class Upcycling 
{

    private static Map<String, Integer> supplies;
    private static ArrayList<String> success;
    private static String type;
    private static int numOfparts;
    private static int numOfsuccess;
    private static int numofmaterial;

    /**
     * Reads the materials inputted and returns them for user confirmaiton
     */
    public static void askForMaterials() throws FileNotFoundException
    {
        supplies = new HashMap<String, Integer>();
        File controlFile = new File("/Users/24aeliyag/Desktop/System"
                + "Science/SystemScienceMaterials.txt");
        Scanner controlScan = new Scanner(controlFile); 
        //System.out.println("here");
        numOfparts = controlScan.nextInt();
        System.out.println("----------------------");
        System.out.println("Your materials are as follows: ");
        for (int i = 0; i < numOfparts; i++)
        {
            type = controlScan.next(); 
            numofmaterial = controlScan.nextInt();
            if (numofmaterial != 0)
            {
                System.out.print(type + " ");
                System.out.println(numofmaterial);
            }
            supplies.put(type, numofmaterial);
        }

       
        
        
    }
    /**
     * Goes through each project and checks if it has the materials needed
     * @return ArrayList of projects that work
     */
    public static ArrayList<String> checkProjects()
    {
        success = new ArrayList<String>(); 
        
        Drum test = new Drum();
        Kazoo other = new Kazoo();
        Origami ori = new Origami();
        Scooper scoop = new Scooper();
        WateringCan wateringcan = new WateringCan();
        HangingPlanter planter = new HangingPlanter();
        CDCar1 car1 = new CDCar1();
        CardboardFloatingTable table = new CardboardFloatingTable();
        CardboardDeskCalendar calendar = new CardboardDeskCalendar();
        Drawing draw = new Drawing();
        
        if (test.contains(supplies))
        {
            success.add("Drums: " +test.getLink());
            numOfsuccess++;
        }
        
        if (other.contains(supplies))
        {
            success.add("Kazoo: " +other.getLink());
            numOfsuccess++;
        }

        if (ori.contains(supplies))
        {
            success.add("Origami: " + ori.getLink());
            numOfsuccess++;
        }
        if (scoop.contains(supplies))
        {
            success.add("Scooper: " + scoop.getLink());
            numOfsuccess++;
        }
        if (wateringcan.contains(supplies))
        {
            success.add("Watering Can: " + wateringcan.getLink());
            numOfsuccess++;
        }
        if (planter.contains(supplies))
        {
            success.add("Hanging Planter: " + planter.getLink());
            numOfsuccess++;
        }
        if (car1.contains(supplies))
        {
            success.add("CD Car Version1: " + car1.getLink());
            numOfsuccess++;
        }
        if (table.contains(supplies))
        {
            success.add("Cardboard FLoating Table: " + table.getLink());
            numOfsuccess++;
        }
        if (calendar.contains(supplies))
        {
            success.add("Cardboard Desk Calenar: " + calendar.getLink());
            numOfsuccess++;
        }
        if (draw.contains(supplies))
        {
            success.add("Drawing: " + draw.getLink());
            numOfsuccess++;
        }

        return success;
        

    }

    /**
     * Prints out projects and their links for the user to work on
     */
    public static void printProjects()
    {
        System.out.println("---------------------------");
        System.out.println("Projects found:");

        for (int i = 0; i < numOfsuccess; i++)
        {
            System.out.println("    " + success.get(i));
        }

        System.out.println("---------------------------");


    }
/**
 * Reads the text file, determines what projects match up, prints those projects out
 * @param args
 * @throws FileNotFoundException
 */
    public static void main (String[] args) throws FileNotFoundException
    {
        
        askForMaterials();
        checkProjects(); 
        printProjects();

    }






}