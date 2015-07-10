package controller;

import condition.ArithmeticCalc;
import condition.ClacAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기 (if-else)
		ClacAvg avg = new ClacAvg();
		//avg.calcAvg();
		
		// 2015.07.09 사칙연산계산기 (if-else)
		ArithmeticCalc calc = new ArithmeticCalc();
		//calc.calc();
		
		// 2015.07.10  성적계산기 (switch-case) 
		SwitchAvg avg2 = new SwitchAvg();
		//avg2.avg();
		
		// 2015.07.10 성 판별기 (switch-case)
		ManOrWoman manOrWoman = new ManOrWoman();
		manOrWoman.ssn();
	}
}
