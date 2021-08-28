package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

@Autonomous
public class TouchSensorExample extends LinearOpMode {

    TouchSensor touchSensor;

    @Override
    public void runOpMode() throws InterruptedException {
        touchSensor = hardwareMap.touchSensor.get("T1");

        waitForStart();

        boolean isPressed = touchSensor.isPressed();

        if (isPressed) {
            telemetry.addData("", "Button is pressed.");
        } else {
            telemetry.addData("", "Button isn't pressed.");
        }

        telemetry.update();
    }

}
