package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TankDrive extends OpMode {

    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftBack;
    DcMotor rightBack;
    double leftJoystick = 0;
    double rightJoystick = 0;
    
    @Override
    public void init(){
        leftFront = hardwareMap.dcMotor.get("LF");
        rightFront = hardwareMap.dcMotor.get("RF");
        leftBack = hardwareMap.dcMotor.get("LB");
        rightBack = hardwareMap.dcMotor.get("RB");
        
    }
    
    @Override
    public void loop(){
        leftJoystick = gamepad1.left_stick_y;
        rightJoystick = gamepad1.right_stick_y;
        
        leftFront.setPower(-leftJoystick);
        leftBack.setPower(-leftJoystick);
        rightFront.setPower(rightJoystick);
        rightBack.setPower(rightJoystick);
        
    }
    
}
