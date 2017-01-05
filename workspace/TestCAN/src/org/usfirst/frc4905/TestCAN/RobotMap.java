// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4905.TestCAN;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainDT1;
    public static CANTalon driveTrainDT2;
    public static CANTalon driveTrainDT3;
    public static CANTalon driveTrainDT4;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainDT1 = new CANTalon(0);
        LiveWindow.addActuator("DriveTrain", "DT1", driveTrainDT1);
        
        driveTrainDT2 = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "DT2", driveTrainDT2);
        
        driveTrainDT3 = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "DT3", driveTrainDT3);
        
        driveTrainDT4 = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "DT4", driveTrainDT4);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
