import javax.swing.*;

/**********************************************************
*
*  This class contains the main() method
*  for the JavaPhone application.
*
* @author T. Brandes
* @version 1.0  02-03-2017
* 
**********************************************************/

class JavaPhoneMain {
  
  // Starts free-standing Java-Program
  public static void main(String[] args) {
      // Create a new object of class JavaPhoneGUI
    JavaPhoneGUI gui = new JavaPhoneGUI();
    gui.setSize(310, 310);
    gui.setVisible(true);
  }

}