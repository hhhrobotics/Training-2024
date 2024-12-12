package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Opmodeclasszoha extends OpMode {
    DcMotorEx frontRight;
    DcMotorEx frontLeft;
    DcMotorEx backRight;
    DcMotorEx backLeft;
    @Override
    public void init() {
        frontright = hardwareMap.get(DcMotorEx.class, "motor");
        frontLeft = hardwareMap.get(DcMotorEx.class, "motor");
        backright = hardwareMap.get(DcMotorEx.class, "motor");
        frontLeft = hardwareMap.get(DcMotorEx.class, "motor");
    }

    @Override
    public void loop() {
        frontRight.setPower(1);
        frontLeft.setPower(1);
        backRight.setPower(1);
        backLeft.setPower(1);
    }
}
