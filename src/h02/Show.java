package h02;

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;


    public class Show extends Applet {

        public void init() {setBackground(Color.blue);
        }
        public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.drawString("Mehran", 50, 60 );
        }

    }

