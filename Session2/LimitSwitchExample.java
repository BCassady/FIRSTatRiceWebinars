package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DigitalChannel;

@Autonomous
public class LimitSwitchExample extends LinearOpMode {

    DigitalChannel limitSwitch;

    public void runOpMode() throws InterruptedException {
        limitSwitch = hardwareMap.get(DigitalChannel.class, "LS1");

        limitSwitch.setMode(DigitalChannel.Mode.INPUT);

        waitForStart();

        boolean limitSwitchState = limitSwitch.getState();

        if (limitSwitchState) {
            telemetry.addData("", "Sensor touching magnet.");
        } else {
            telemetry.addData("", "Sensor not touching magnet.");
        }

        telemetry.update();
    }

}
