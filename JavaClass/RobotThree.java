package JavaClass;

import Interface.*;

public class RobotThree extends UserRobot implements RobotWork, InteriorRobot {
    public RobotThree(String name, int id) {
        super(name, id);

    }

    @Override
    public void color() {
        System.out.println("Цвет робота ," + getName() + " белый");
    }

    @Override
    public void clean() {
        System.out.println("Робот ," + getName() + " моет посуду");
    }

    @Override
    public void charging() {
        System.out.println("Заряд робота ," + getName() + " 95 %");
    }

    @Override
    public void engine() {
        System.out.println("Мотор робота ," + getName() + " 1 лошадных сил");
    }
}

