package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class reverse_grab_sequence extends CommandGroup {
  public reverse_grab_sequence() {
    addSequential(new forward_grab(),1);
    addSequential(new ShootingPiston(),1);
    addSequential(new invert_lift(),1);
    addSequential(new reverse_grab(),1);
    addSequential(new invertshotpis(),1);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }                                                                                                                           
                                                                                                                                                                                                                                                          
  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.piston.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}