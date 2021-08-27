package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class SingleMotor extends OpMode {
    
    DcMotor motor1;
    
    @Override
    public void init(){
        motor1 = hardwareMap.dcMotor.get("m1");
    }
    
    @Override
    public void loop(){
        motor1.setPower(0.25);
    }
}
