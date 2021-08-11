package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class DriveForward extends LinearOpMode {

    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;
    
    public void runOpMode() throws InterruptedException {
        
        leftFront = hardwareMap.dcMotor.get("LF");
        rightFront = hardwareMap.dcMotor.get("RF");
        leftBack = hardwareMap.dcMotor.get("LB");
        rightBack = hardwareMap.dcMotor.get("RB");
        
        leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        waitForStart();
        
        while(leftBack.getCurrentPosition() < 2000){
            leftFront.setPower(0.5);
            leftBack.setPower(0.5);
            rightFront.setPower(-0.5);
            rightBack.setPower(-0.5);
        }
        
        leftFront.setPower(0);
        leftBack.setPower(0);
        rightFront.setPower(0);
        rightBack.setPower(0);
        
    }
}
