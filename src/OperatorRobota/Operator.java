package OperatorRobota;

public class Operator {
    private String firstName;
    private String lastName;
    private Robot robot;

    public Operator(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return firstName;
    }
    public Robot getRobot(){
        return robot;
    }
    public void setRobot(Robot robot){
        this.robot = robot;
    }
}
