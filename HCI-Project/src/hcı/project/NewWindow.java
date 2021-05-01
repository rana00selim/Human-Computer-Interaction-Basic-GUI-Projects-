package hcı.project;

import static hcı.project.NewJFrame.icon;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NewWindow extends JFrame{
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    
    NewWindow(ImageIcon image){
        DragPanel dragPanel = new DragPanel(image);
        ImageIcon img = icon;
        this.setIconImage(img.getImage());
        this.add(dragPanel);
        this.setTitle("Drag Shape Menu");
        this.setSize(1200, 1000);
        frame.setBackground(new java.awt.Color(176, 226, 255));
        frame.setForeground(new java.awt.Color(176, 226, 255));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
    }
}
