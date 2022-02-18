package org.motor1;

import org.motor.DcMotor;

public class StepperMotor extends DcMotor {
	
	@Override
	public void Characteristics() {
		System.out.println("Stepper Motor");
		super.Characteristics();
	}
	@Override
	public void ControlCharacteristics() {
		System.out.println("Micro Controller");
		super.ControlCharacteristics();
	}
	@Override
	public void SpeedRange() {
		System.out.println("Low");
		super.SpeedRange();
	}
	@Override
	public void Reliablity() {
		System.out.println("High");
		super.Reliablity();
	}
	@Override
	public void Efficiency() {
		System.out.println("Low");
		super.Efficiency();
	}
	@Override
	public void Torque() {
		System.out.println("Low Torque");
		super.Torque();
	}
	@Override
	public void Cost() {
		System.out.println("Low");
		super.Cost();
	}
	@Override
	public void Current() {
		System.out.println("Low Current");
		super.Current();
	}
	@Override
	public void Voltage() {
		System.out.println("High Voltage");
		super.Voltage();
	}
	@Override
	public void Amp() {
		System.out.println("Varies");
		super.Amp();
	}
	public static void main(String[] args) {
		StepperMotor b = new StepperMotor();
		b.Characteristics();
		b.ControlCharacteristics();
		b.SpeedRange();
		b.Reliablity();
		b.Efficiency();
		b.Torque();
		b.Cost();
		b.Current();
		b.Voltage();
		b.Amp();
		
	
	}
}
