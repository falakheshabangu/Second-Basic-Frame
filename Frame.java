
package ac.za.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class Frame extends JFrame{

    @Override
    public void setTitle(String title) {
        super.setTitle("Falakhe Shabangu");
        setSize(500, 500);
        setForeground(Color.red);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
    }
    
}
