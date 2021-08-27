package JavaClass;

public class Test {
    public static void main(String[] args) {

        RobotOne robotOne = new RobotOne("Jhon", 1);

        robotOne.color();
        robotOne.clean();
        robotOne.charging();
        robotOne.engine();

        System.out.println();

        RobotTwo robotTwo = new RobotTwo("Djek", 2);

        robotTwo.color();
        robotTwo.clean();
        robotTwo.charging();
        robotTwo.engine();

        System.out.println();

        RobotThree robotThree = new RobotThree("Alex", 3);

        robotThree.color();
        robotThree.clean();
        robotThree.charging();
        robotThree.engine();
    }
}
