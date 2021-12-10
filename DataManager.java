
/**
 * The DataManager class should never depend on the GUI, but rather the reverse. 
 * So the DataManager methods should not use the GUI directly.  If you want data
 * to get from the user to the manager, have the GUI get the data, and call the manager 
 * with the data that the GUI got from a text field or other data structure.
 * @author ralexander
 *
 */
public class DataManager

{

     String Dtext="";

     //Empty constructor

     DataManager()

     {   

     }

     //implement the method getHello()

     public String getHello()

     {

          return "Hello";

     }

     //implement the method getHello()

     public String getHowdy()

     {

          return "Howdy";

     }

     //implement the method getChineese()

     public String getChineese()

     {

          return "Chineese";

     }

     //implement the method setText(String)

     public void setText(String text)

     {

          this.Dtext=text;

     }

}