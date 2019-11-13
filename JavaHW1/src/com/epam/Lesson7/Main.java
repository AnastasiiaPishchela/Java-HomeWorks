package com.epam.Lesson7;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotDancer robotDancer = new RobotDancer();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();

//        robot.work();
//        robotDancer.work();
//        coffeRobot.work();
//        robotCoocker.work();

        Robot[] robots = {new Robot(),
        new RobotDancer(),
        new CoffeRobot(),
        new RobotCoocker()};

        for (Robot rob : robots) {
            rob.work();
        }
    }
}
