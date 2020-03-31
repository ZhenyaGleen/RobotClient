package OperatorRobota;


import java.util.ArrayList;

public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course = 0;

    private ArrayList<RobotLine> lines = new ArrayList<RobotLine>();
    public Robot(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void forward(int distance){
        final double xOld = x;
        final double yOld = y;
        x =+distance*Math.cos(course / 180*Math.PI);
        y=+distance*Math.sin(course / 180*Math.PI);
        lines.add(new RobotLine(xOld,yOld,x,y));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public ArrayList<RobotLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<RobotLine> lines) {
        this.lines = lines;
    }

    public void printCoordinates(){
        System.out.println(x+","+y);
    }
}
