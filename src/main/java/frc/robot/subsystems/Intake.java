package frc.robot.subsystems;

import frc.robot.RobotMap.CAN_IDs;
import harkerrobolib.subsystems.HSIntake;
import harkerrobolib.wrappers.HSTalon;

public class Intake extends HSIntake {

    private static Intake intake;

    private Intake()
    {
        super(new HSTalon(CAN_IDs.INTAKE_LEFT), new HSTalon(CAN_IDs.INTAKE_RIGHT));
    }

    public static Intake getInstance()
    {
        if(intake == null);
            intake = new Intake();
        return intake;
    }

    @Override
    protected void initDefaultCommand() {

    }
}