import java.awt.*;
import java.applet.*;

public class Kirby extends Applet{
    public void paint(Graphics g){
        Kirby(g);
        Kirby2(g);
    }
//Draw Kirby
    public static void Kirby(Graphics g){
        //Feet
        Expo.setColor(g,Expo.red);
        Expo.fillOval(g,270,600,10,25);
        Expo.fillOval(g,320,600,10,25);
        
        //Body and Hands
        Expo.setColor(g,Expo.pink);
        Expo.fillCircle(g,300,540,60);
        Expo.fillOval(g,230,530,25,10);
        Expo.fillOval(g,370,530,25,10);
        
        //Eyes
        Expo.setColor(g,Expo.black);
        Expo.fillOval(g,290,520,5,17);
        Expo.fillOval(g,310,520,5,17);
        
        //Eyes 2
        Expo.setColor(g,Expo.white);
        Expo.fillOval(g,290,512,3,8);
        Expo.fillOval(g,310,512,3,8);
        
    }
    
    public static void Kirby2(Graphics g){
        //Feet
        Expo.setColor(g,Expo.blue);
        Expo.fillOval(g,830,600,10,25);
        Expo.fillOval(g,770,600,10,25);
        
        //Body and Hands
        Expo.setColor(g,Expo.lightBlue);
        Expo.fillCircle(g,800,540,60);
        Expo.fillOval(g,730,530,25,10);
        Expo.fillOval(g,870,530,25,10);
        
        //Eyes
        Expo.setColor(g,Expo.black);
        Expo.fillOval(g,790,520,5,17);
        Expo.fillOval(g,810,520,5,17);
        
        //Eyes 2
        Expo.setColor(g,Expo.white);
        Expo.fillOval(g,790,512,3,8);
        Expo.fillOval(g,810,512,3,8);
    }
}