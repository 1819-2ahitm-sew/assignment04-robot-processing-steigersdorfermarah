package at.htl.robot.gui;

import at.htl.robot.model.Direction;
import at.htl.robot.model.Robot;
import processing.core.PApplet;


public class Main extends PApplet {

    /*
        Marah Steigersdorfer

     */


    int height = 20;
    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.SOUTH;

    Robot robot = new Robot();

        robot.rotateLeft();
        robot.stepForward();

        System.out.println("x = " + robot.getX() );
        System.out.println("y = " + robot.getY() );
        System.out.println("direction = " + robot.getDirection() );

    // Hier die Member-Attribute eintragen

    public static void main(String[] args) {
        PApplet.main("at.htl.robot.gui.Main", args);
    }

    public void settings() {



        size(800, 800);
    }

    public void setup() {
        background(209); //https://processing.org/tutorials/color/


    }

    /**
     * Diese Methode wird iterativ durchlaufen (wie loop() beim Arduino)
     */
    public void draw() {

        line(11,20, 30,40);

        keyPressed();

    }

    /**
     * Erstellen Sie eine eigene Methode, mittels der der Roboter am Bildschirm gezeichnet wird
     * Die Angabe zu Position des Roboters am Spielfeld erhalten Sie aus dem Roboter-Objekt, welches
     * als Parameter übergeben wird.
     *
     * @param robot Objekt des zu zeichnenden Roboters
     */
    public void drawRobot(Robot robot) {

        ellipse(this.x, this.y,radius, radius);

    }

    /**
     * Erstellen Sie eine eigene Methode zum Löschen des Bildschirms
     */
    public void deleteAll() {


    }

    /**
     * In dieser Methode reagieren Sie auf die Tasten
     */
    public void keyPressed() {
        println("pressed " + key + " " + keyCode);

        if (key == 'f' || key == 'F') {
            if (this.direction == Direction.SOUTH) {
                this.x = x + 1;
            } else if (this.direction == Direction.EAST){
                this.y = y + 1;

        }else if (this.direction == Direction.NORTH){
                this.y = y - 1;

        }else if (this.direction == Direction.WEST){
                this.x = x - 1;
        }


        } else if (key == 'l' || key == 'L') {

            if (this.direction == Direction.SOUTH) {
                this.direction = Direction.EAST;

            } else if (this.direction == Direction.EAST){
                this.direction = Direction.NORTH;

            } else if (this.direction == Direction.EAST){
                this.direction = Direction.NORTH;

            }else if(this.direction == Direction.EAST){
                this.direction = Direction.NORTH;

            }else if (this.direction == Direction.NORTH){
                this.direction = Direction.WEST;

            }else if (this.direction == Direction.WEST){
                this.direction = Direction.SOUTH;
            }
        }

    }

//    public void keyTyped() {
//        println("typed " + key + " " + keyCode);
//    }
//
//    public void keyReleased() {
//        println("released " + key + " " + keyCode);
//    }

}
