package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.Rev2mDistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous
public class DistanceSensorExample extends LinearOpMode {

    DistanceSensor distanceSensor;
    DistanceUnit distanceUnit;

    @Override
    public void runOpMode() throws InterruptedException {
        distanceSensor = hardwareMap.get(DistanceSensor.class, "D1");

        waitForStart();

        double distance = distanceSensor.getDistance(DistanceUnit.INCH);

        if (distance < 6) {
            telemetry.addData("", "I am very close to something.");
        } else if (distance < 12) {
            telemetry.addData("", "I am kind of close to something.");
        } else {
            telemetry.addData("", "I am not very close to anything.");
        }

        telemetry.update();
    }

}
