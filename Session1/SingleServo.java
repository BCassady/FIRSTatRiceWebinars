package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp
public class SingleServo extends OpMode {
    
    Servo servo1;
    ElapsedTime timer;
    
    @Override
    public void init(){
        
        servo1 = hardwareMap.servo.get("s1");
        
        timer = new ElapsedTime();
        
        servo1.setPosition(0);
        
    }
    
    public void loop(){
        servo1.setPosition(1);
        timer.reset();
        while(timer.time()<2){}
        servo1.setPosition(0);
        timer.reset();
        while(timer.time()<2){}
    }
    
}
