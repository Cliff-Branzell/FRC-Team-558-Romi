// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
       /* new DriveDistance(-0.5, 10, drivetrain), //(Speed, Inches, Drive)
        new TurnDegrees(-0.5, 180, drivetrain),  //(Speed, Degrees, Drive)
        new DriveDistance(-0.5, 10, drivetrain),
        new TurnDegrees(0.5, 180, drivetrain));*/

        // Below this line is added for testing.
        new DriveDistance(0.55, 16, drivetrain), // 17.8125
        new TurnDegrees(0.4, 84, drivetrain), // 90
        new DriveDistance(-0.55, 17.5, drivetrain), // 19.75
        new TurnDegrees(0.4, 54, drivetrain), // 60
        new DriveDistance(0.55, 28, drivetrain), // 29.5625
        new TurnDegrees(0.4, 110, drivetrain), // 115
        new DriveDistance(0.55, 18, drivetrain), // 19.75
        new TurnDegrees(0.4, 85, drivetrain), // 90
        new DriveDistance(0.55, 16, drivetrain)); // 19.75

  }
}
