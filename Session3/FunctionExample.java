package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class FunctionExample extends LinearOpMode {

    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;

    ElapsedTime timer;

    @Override
    public void runOpMode() throws InterruptedException {

        leftFront = hardwareMap.dcMotor.get("LF");
        rightFront = hardwareMap.dcMotor.get("RF");
        leftBack = hardwareMap.dcMotor.get("LB");
        rightBack = hardwareMap.dcMotor.get("RB");

        timer = new ElapsedTime();
        waitForStart();

    }
    void moveStraight(final char fb, final int encoderCount, final double holdAngle, final double motorPower) {
        leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        timer.startTime();
        timer.reset();
        while (timer.time() < 0.25 && opModeIsActive()) {
        }
        if (fb == 'f') {
            while (leftBack.getCurrentPosition() < encoderCount && opModeIsActive()) {
                leftFront.setPower(motorPower);
                leftBack.setPower(motorPower);
                rightFront.setPower(-motorPower);
                rightBack.setPower(-motorPower);
            }
        } else {
            while (leftBack.getCurrentPosition() > encoderCount && opModeIsActive()) {
                leftFront.setPower(-motorPower);
                leftBack.setPower(-motorPower);
                rightFront.setPower(motorPower);
                rightBack.setPower(motorPower);
            }
        }
        leftBack.setPower(0.0);
        leftFront.setPower(0.0);
        rightBack.setPower(0.0);
        rightFront.setPower(0.0);
    }

}
