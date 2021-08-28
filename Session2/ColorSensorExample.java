package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous
public class ColorSensorExample extends LinearOpMode {

    ColorSensor colorSensor;

    @Override
    public void runOpMode() throws InterruptedException {
        colorSensor = hardwareMap.colorSensor.get("C1");

        waitForStart();

        int redValue = colorSensor.red();
        int blueValue = colorSensor.blue();

        if (redValue > blueValue) {
            telemetry.addData("", "This object is more red than blue.");
        } else if (blueValue > redValue) {
            telemetry.addData("", "This object is more blue than red.");
        } else {
            telemetry.addData("", "This object is equal amounts red and blue.");
        }

        telemetry.update();
    }
}
