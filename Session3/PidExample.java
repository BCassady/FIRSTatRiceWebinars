package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

@Autonomous
public class PidExample extends LinearOpMode {

    DcMotorEx shooterMotor1;
    PIDFCoefficients pid;

    public void runOpMode() throws InterruptedException {
        shooterMotor1 = hardwareMap.get(DcMotorEx.class, "shooter1");

        // Tuning steps
        // 1. Increase P until oscillation around target
        // 2. Increase d to reduce the amount of oscillation
        // 3. The value should hover slightly below the target, increase I to bring the value back to target
        final PIDFCoefficients newPIDF = new PIDFCoefficients(1000.0, 10.0, 0.0, 14.3);
        shooterMotor1.setPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER, newPIDF);
        pid = shooterMotor1.getPIDFCoefficients(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        // This will now use the PID coefficients to get to the specified velocity and stay there
        shooterMotor1.setVelocity(2000);
    }

}
