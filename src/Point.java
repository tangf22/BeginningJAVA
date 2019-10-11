/*
Class object point coordinates integer x and y
do not have a main method
 */


public class Point {
    private int x; //fields: define objects
    private int y;

    public Point() //constructor: allows to assign value to variables, have to be public**, same name as class**
    { //nothing inside ( ) ->default value is 0, 0
        x = 1;
        y = 1; //redefining the default that was 0, 0

    }
    public Point(int x1, int y1) //constructor
    {
        x = x1;
        y = y1; //can only be used in expression newPoint
    }

    //create method; can't be "static" anymore because we're making an object reference
    public void modify(int value) {
        x = x * 3;
        y = y * 3;
    }

    public void setX(int x1) //methods, aka behaviors: need accessors and mutators
    {
        x = x1; //mutators -change values
    }

    public void setY(int y1)
    {
        y = y1;
    }

    public int getX(int x)
    {
        return this.x;
    }

    public int getY(int x)
    {
        return y; //accessors -call value
    }

    public int translateX(int addX) {
        x = x + addX;

        return x;
    }

    public int translateY(int addY) {
        y = y + addY;

        return y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow((x - p2.x), 2) + (Math.pow((y - p2.y), 2)));
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void newPoint(int x1,int y1)
    {
        x=x1;
        y=y1;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}









//    public int distance ()
//    {
//
//    }
    //create a distance method
    //double distance = Math.sqrt(Math.pow((p1.x-p2.x), 2) + (Math.pow((p1.y-p2.y),2)));
    //add a translate method (add or subtract to x and/or y)


