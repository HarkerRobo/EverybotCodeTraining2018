package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import frc.robot.RobotMap.CAN_IDs;
import harkerrobolib.subsystems.HSIntake;
import harkerrobolib.wrappers.HSTalon;

public class Intake extends HSIntake {

    private static Intake intake;
    private static final boolean LEFT_INVERTED = false;
    private static final boolean RIGHT_INVERTED = false;
    private static final NeutralMode NEUTRAL_MODE = NeutralMode.Brake;
    private static final int PEAK_TIME = 1;
    private static final int PEAK_CURRENT = 0; // Placeholder value
    private static final int CONT_CURRENT = 0; // Placeholder value

    private Intake() {
        super(new HSTalon(CAN_IDs.INTAKE_LEFT), new HSTalon(CAN_IDs.INTAKE_RIGHT));
    }

    public static Intake getInstance() {
        if(intake == null);
            intake = new Intake();
        return intake;
    }

    @Override
    protected void initDefaultCommand() {

    }

    public void talonInit() {
        invertTalons(LEFT_INVERTED, RIGHT_INVERTED);
        setNeutralModes(NEUTRAL_MODE);
        setCurrentLimits(PEAK_TIME, PEAK_CURRENT, CONT_CURRENT);
    }

}