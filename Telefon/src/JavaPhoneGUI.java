import javax.swing.*;
import java.awt.*;

/**********************************************************
*
*  This class implements a simple phone GUI.
*  When creating a new object of this class
*  the GUI components, such as buttons, labels, etc. are
*  just displayed. They do not yet react on user actions,
*  such as pressing a button, etc.
*
* @author  T.Brandes
* @version 1.0  02-03-2017
* 
**********************************************************/
class JavaPhoneGUI extends JFrame {
  
    // Declare and create key buttons
    JButton key0 = new JButton("0");
    JButton key1 = new JButton("1");
    JButton key2 = new JButton("2");
    JButton key3 = new JButton("3");
    JButton key4 = new JButton("4");
    JButton key5 = new JButton("5");
    JButton key6 = new JButton("6");
    JButton key7 = new JButton("7");
    JButton key8 = new JButton("8");
    JButton key9 = new JButton("9");
    JButton keyStar = new JButton("*");
    JButton keySharp = new JButton("#");
    
    JButton keyHook = new JButton("Hook off");
    
    // ...
  
    // Declare and create other GUI elements
    JTextField display = new JTextField();
    JLabel stateLabel = new JLabel("ready");
    
    // ...
    
    // Declare and create panels
    JPanel keyPanel        = new JPanel();
    JPanel keyDisplayPanel = new JPanel();
    JPanel hookStatePanel = new JPanel();
    // ...

    // Constructor. Assembles and displays the GUI.
    JavaPhoneGUI() {
      // Initialise frame and GUI elements and
      setTitle("JavaPhone");
      setBackground(Color.lightGray);
      stateLabel.setForeground(Color.green);
      setResizable(false);
      display.setEditable(false);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
      // Set layout of all panels and of frame
      keyPanel.setLayout(new GridLayout(4, 3, 20, 20));
      keyDisplayPanel.setLayout(new BorderLayout(20, 20));
      hookStatePanel.setLayout(new BorderLayout(20, 20));
      // ...
      setLayout(new BorderLayout(20, 20));
   
      // Add key buttons to key panel
      keyPanel.add(key1);
      keyPanel.add(key2);
      keyPanel.add(key3);
      keyPanel.add(key4);
      keyPanel.add(key5);
      keyPanel.add(key6);
      keyPanel.add(key7);
      keyPanel.add(key8);
      keyPanel.add(key9);
      keyPanel.add(keySharp);
      keyPanel.add(key0);
      keyPanel.add(keyStar);
      keyPanel.add(key1);
      
      hookStatePanel.add(stateLabel, BorderLayout.NORTH);
      hookStatePanel.add(keyHook, BorderLayout.CENTER);
      

      // Assemble key/display panel
      keyDisplayPanel.add(display, BorderLayout.NORTH);
      keyDisplayPanel.add(keyPanel, BorderLayout.CENTER);
    
      // Assemble hook/state panel
      // ...

      // Add key/display panel and hook/state panel to frame
      add(keyDisplayPanel, BorderLayout.CENTER);
      add(hookStatePanel, BorderLayout.WEST);
    }
}