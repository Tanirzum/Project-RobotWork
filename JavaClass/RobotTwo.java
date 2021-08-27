package JavaClass;

import Interface.*;

public class RobotTwo extends UserRobot implements RobotWork, InteriorRobot {
    public RobotTwo(String name, int id) {
        super(name, id);

    }

    @Override
    public void color() {
        System.out.println("Цвет робота ," + getName() + " красний");
    }

    @Override
    public void clean() {
        System.out.println("Робот ," + getName() + " чистить туфли");
    }

    @Override
    public void charging() {
        System.out.println("Заряд робота ," + getName() + " 50 %");
    }

    @Override
    public void engine() {
        System.out.println("Мотор робота ," + getName() + " 1 лошадных сил");
    }
}
