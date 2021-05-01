package hcı.project;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class DragPanel extends JPanel{
 
 ImageIcon image2 = new ImageIcon("circle.png");
 final int WIDTH = image2.getIconWidth()*8;
 final int HEIGHT = image2.getIconHeight()*8;
 Point imageCorner;
 Point prevPt;
 ImageIcon image;
 
 DragPanel(ImageIcon image){
  this.image = image;
  imageCorner = new Point(500,500);
  ClickListener clickListener = new ClickListener();
  DragListener dragListener = new DragListener();
  this.addMouseListener(clickListener);
  this.addMouseMotionListener((MouseMotionListener) dragListener);
 }
 
 public void paintComponent(Graphics g) {
  super.paintComponent(g);
  image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
 }
 
 private class ClickListener extends MouseAdapter{

  public void mousePressed(MouseEvent e) {
   prevPt = e.getPoint();
  }
 }
 
 private class DragListener extends MouseMotionAdapter{

  public void mouseDragged(MouseEvent e) {

   Point currentPt = e.getPoint();

   imageCorner.translate(

     (int)(currentPt.getX() - prevPt.getX()),
     (int)(currentPt.getY() - prevPt.getY())
   );
   prevPt = currentPt;
   repaint();
  }
 }
}

