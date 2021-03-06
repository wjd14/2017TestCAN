// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4905.Andromeda3.subsystems;



import org.usfirst.frc4905.Andromeda3.RobotMap;
import org.usfirst.frc4905.Andromeda3.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController rightController = RobotMap.driveTrainRightController;
    private final SpeedController leftController = RobotMap.driveTrainLeftController;
    private final RobotDrive robotDrive2 = RobotMap.driveTrainRobotDrive2;
    private final Encoder rightQuadrature = RobotMap.driveTrainRightQuadrature;
    private final Encoder leftQuadrature = RobotMap.driveTrainLeftQuadrature;
    private final Ultrasonic ultrasonic = RobotMap.driveTrainUltrasonic;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    double lspeed = 0.7;
    double rspeed = 0.7;
    double range;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    		setDefaultCommand(new ArcadeDrive());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveRobot(Joystick driveGamePad){
    	
    	double leftStickSpeed = driveGamePad.getRawAxis(1);
    	double rightStickSpeed = driveGamePad.getRawAxis(4);
    	
    	robotDrive2.arcadeDrive(leftStickSpeed, rightStickSpeed, false);
    
    }
    
    public void stop(){
    	
    	robotDrive2.arcadeDrive(0,0);
    	
    }
   
    public void initDrive(double left, double right, double target){
    	
    	rightQuadrature.reset();
    	leftQuadrature.reset();
    	
    	lspeed = left;
    	rspeed = right;
    }
    
    public void execDrive(){
    	
    	robotDrive2.tankDrive(lspeed, rspeed);
   
    }
    
   
    
    public boolean isDoneDrive(double target){
    	
    	if(Math.abs(rightQuadrature.getDistance()) < Math.abs(target) && Math.abs(leftQuadrature.getDistance()) < Math.abs(target)){
    		
    		return false;
    		
    	}else{
    		
    		return true;
    		
    	}
    	
    }
    
    public double getRange(){
    	
    	range = ultrasonic.getRangeInches();
    	
    	return range;
    }
    
    
    public boolean isAtTarget(double target){
    	
    	range = getRange();
    	
    	if(range < target){
    		
    		return true;
    		
    	}else if(range > target){
    		
    		return false;
    	}else{
    		
    		return true;
    		
    	}
    	
    	
    }
    
}

