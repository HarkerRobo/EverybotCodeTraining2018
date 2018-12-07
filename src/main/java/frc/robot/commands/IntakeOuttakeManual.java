package frc.robot.commands;

import frc.robot.Robot;
import harkerrobolib.commands.IndefiniteCommand;

public class IntakeOuttakeManual extends IndefiniteCommand {

    public IntakeOuttakeManual() {
        requires(Robot.intake);
    }

}