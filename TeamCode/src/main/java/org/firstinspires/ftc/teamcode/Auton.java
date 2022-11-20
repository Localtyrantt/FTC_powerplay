package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcontroller.external.samples.RobotHardware;

@Autonomous(name="Concept: Hardware Class", group="Robot")
public class Auton extends LinearOpMode {
    // Create a RobotHardware object to be used to access robot hardware.
    // Prefix any hardware functions with "robot." to access this class.
    org.firstinspires.ftc.teamcode.AprilTagAutonomousInitDetectionExample apriltag = new AprilTagAutonomousInitDetectionExample(this);
    org.firstinspires.ftc.teamcode.Hardware hardware = new Hardware(this);
    org.firstinspires.ftc.teamcode.FieldNav fieldnav = new FieldNav(this);
    @Override
    public void runOpMode() {
        double turn = 0;
        double arm = 0;
        double handOffset = 0;
        // initialize all the hardware, using the hardware class. See how clean and simple this is?
        hardware.init();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        if (fieldnav.image == 0 || apriltag.tagOfInterest.id == apriltag.LEFT){

        } else if (fieldnav.image == 0 || apriltag.tagOfInterest.id == apriltag.MIDDLE){

        } else if (fieldnav.image == 0 || apriltag.tagOfInterest.id == apriltag.RIGHT){

        }
        if (fieldnav.image == 1 || apriltag.tagOfInterest.id == apriltag.LEFT){

        } else if (fieldnav.image == 1 || apriltag.tagOfInterest.id == apriltag.MIDDLE){

        } else if (fieldnav.image == 1 || apriltag.tagOfInterest.id == apriltag.RIGHT){

        }
        if (fieldnav.image == 2 || apriltag.tagOfInterest.id == apriltag.LEFT){

        } else if (fieldnav.image == 2 || apriltag.tagOfInterest.id == apriltag.MIDDLE){

        } else if (fieldnav.image == 2 || apriltag.tagOfInterest.id == apriltag.RIGHT){

        }
        if (fieldnav.image == 3 || apriltag.tagOfInterest.id == apriltag.LEFT){

        } else if (fieldnav.image == 3 || apriltag.tagOfInterest.id == apriltag.MIDDLE){

        } else if (fieldnav.image == 3 || apriltag.tagOfInterest.id == apriltag.RIGHT){

        }
    }
}