package JavaClass;

import Interface.*;

public class RobotOne extends UserRobot implements RobotWork, InteriorRobot {
    public RobotOne(String name, int id) {
        super(name, id);

    }

    @Override
    public void color() {
        System.out.println("Цвет робота ," + getName() + " синий");
    }

    @Override
    public void clean() {
        System.out.println("Робот ," + getName() + " чистить ковры");
    }

    @Override
    public void charging() {
        System.out.println("Заряд робота ," + getName() + " 80 %");
    }

    @Override
    public void engine() {
        System.out.println("Мотор робота ," + getName() + " 1 лошадных сил");
    }
}
