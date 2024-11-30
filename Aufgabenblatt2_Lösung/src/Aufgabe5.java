import codedraw.CodeDraw;
import java.awt.Color;

/* The goal of the programm was to create a trippy
 animation inspired by multiple moving gears stacked on top of eachother */

public class Aufgabe5 {

    // Declaring the window size outside of a method because I need it in both
    static final int cd_size = 500;

    /* Method for drawing wavy circles made out of lines. Takes as arguments the window it should be drawn in,
    the radius, the number of lines that make up the circle, the number of waves a circle has, the line width,
    a hexadecimal RGB number for the color and a variable for rotation of the drawing. */
    private static void drawWavyCircle(CodeDraw cd, int radius, int numLinesPerCircle,
                                       int numWaves, int LineWidth, int hexColor, double rotation){
        // calculating the center point of the window
        double centerX = (double) cd_size / 2;
        double centerY = (double) cd_size / 2;

        // creating a new color variable made up from the hex number to give setColor
        Color color = new Color(hexColor);
        cd.setColor(color); // set given color
        cd.setLineWidth(LineWidth); // set given line width

        // calculating the amplitude of the waves in pixels as a fraction of the radius
        double waveAmplitude = (double) radius * 0.1;

        /* calculating the direction of the rotation based on if the radius is even or uneven. (To match the requirement
        of two branches */
        if(radius % 2 == 0){
            rotation = -rotation;
        }

        // loop for drawing each of the lines that make up the wavy circle
        for (int i = 1; i <= numLinesPerCircle; i++) {
            /* calculating the angle of each line in radiant. Adding the rotation as a factor of PI so in radiant.
               the first "+ rotation * Math.PI" in "angle" makes the whole circle rotate. the second
               "+ rotation * Math.PI" in "waveOffset" shifts each line’s wave phase, making the sin wave
               move along the perimeter of the circle, creating a trippy effect*/
            double angle = (double) i * (2 * Math.PI / numLinesPerCircle) + rotation * Math.PI;

            double waveOffset = waveAmplitude * Math.sin(numWaves * (angle + rotation * Math.PI)); /*
               basically multiplying the amplitude of the wave with a value between -1 and 1 that changes
               slower or faster depending on numWaves. As explained above, rotation moves the sin wave here
               along the perimeter.
               Note: If there is too much happening for you in the animation, I would recommend removing the rotation
               from the angle calculation.*/
            // calculating the end point for each line
            double endX = centerX + (radius * Math.cos(angle) * (1 + waveOffset / radius));
            double endY = centerY + (radius * Math.sin(angle) * (1 + waveOffset / radius));
            cd.drawLine(centerX, centerY, endX , endY);
        }
    }
    public static void main(String[] args) {
        CodeDraw cd = new CodeDraw(cd_size, cd_size);
        cd.setTitle("Wavy Circle Animation");
        double rotation = 0;
        double rotationSpeed = 0.0007;

        int count = 0; // count for changing the color of the middle circle
        while (true){ // loop for animation
            cd.clear(); // clear window from last frame
            // draw spinning wavy circles
            drawWavyCircle(cd, 195, 150, 8, 4, 0xf2f2f2, rotation);
            drawWavyCircle(cd, 170, 150, 7, 4, 0xd9d9d9, rotation);
            drawWavyCircle(cd, 135, 150, 7, 2, 0xa6a6a6, rotation * 2);
            drawWavyCircle(cd, 120, 150, 6, 2, 0x8c8c8c, rotation * 2);
            drawWavyCircle(cd, 85, 150, 6, 1, 0x404040, rotation * 6);
            drawWavyCircle(cd, 80, 150, 6, 1, 0x393939, rotation * 6);
            // draw the white wavy circle with higher line width and small radius to create intransparent shape

            if((count % 1800) < 900){ // changes the color of the smallest circle approximately every 20 seconds.
                drawWavyCircle(cd, 55, 150, 5, 3, 0xFFFFFF, rotation * 18);
            } else {
                drawWavyCircle(cd, 55, 150, 5, 3, 0x393939, rotation * 18);
            }

            cd.show(); // show frame
            rotation += rotationSpeed; // continue rotation
            count++;
            System.out.println(count);

            if (cd.isClosed()){
                System.out.println("! -- loop ended -- !");
                break;
            }

            try { // needed for Thread.sleep, cannot give further explanation
                Thread.sleep(11); // For smooth animation, app. 90 fps, changes frame every 11 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle the exception if the thread is interrupted
            }
        }
    }
}
