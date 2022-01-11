// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class Train extends SubsystemBase {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	private final WPI_TalonSRX talon7 = new WPI_TalonSRX(7);
	private final WPI_TalonSRX talon8 = new WPI_TalonSRX(8);
	private final WPI_TalonSRX talon9 = new WPI_TalonSRX(9);
	private final WPI_TalonSRX talon10 = new WPI_TalonSRX(10);
	private final DifferentialDrive drive = new DifferentialDrive((WPI_TalonSRX) talon7, (WPI_TalonSRX) talon9);
	// private final DifferentialDrive drive = new DifferentialDrive((WPI_TalonSRX) talon8, (WPI_TalonSRX) talon10);


	/**
	*
	*/
	public Train() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

		talon7.setSafetyEnabled(false);
		talon7.configReverseSoftLimitEnable(false);
		talon7.configForwardSoftLimitEnable(false);
		talon7.setInverted(true);

		talon8.setSafetyEnabled(false);
		talon8.configReverseSoftLimitEnable(false);
		talon8.configForwardSoftLimitEnable(false);
		talon8.setInverted(true);

		talon9.setSafetyEnabled(false);
		talon9.configReverseSoftLimitEnable(false);
		talon9.configForwardSoftLimitEnable(false);
		talon9.setInverted(false);

		talon10.setSafetyEnabled(false);
		talon10.configReverseSoftLimitEnable(false);
		talon10.configForwardSoftLimitEnable(false);
		talon10.setInverted(true);

		talon8.follow(talon7);
		talon10.follow(talon9);
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run

	}

	@Override
	public void simulationPeriodic() {
		// This method will be called once per scheduler run when in simulation

	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void teleopDrive(double move, double turn) {
		// System.out.println(move);
		drive.arcadeDrive(move, -turn * 0.75);
	}

}
