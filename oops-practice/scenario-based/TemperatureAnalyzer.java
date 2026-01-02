package oops_practice.scanrio_based;

import java.util.Scanner;

public class TemperatureAnalyzer {
	public static void analyzeTemperature(float[][] temperatures) {
		float[] dailyAverage = new float[7];
		float hottestday=Float.MIN_NORMAL;
		float coldestday=Float.MAX_VALUE;
		for (int day=0;day<7;day++) {
			float sum=0;
            for (int hour=0;hour<24;hour++) {
                sum+=temperatures[day][hour];
            }
            dailyAverage[day] = sum/24;
            if(dailyAverage[day]>hottestday) {
            	hottestday=dailyAverage[day];
            }
            if(dailyAverage[day]<coldestday) {
            	coldestday=dailyAverage[day];
            }
        }
		System.out.println("Average temperature per day");
		for(int i=0;i<7;i++) {
			System.out.print(dailyAverage[i]+"  ");
		}
		System.out.println();
		System.out.println("Hottest Day : " + hottestday);
		System.out.println("Coldest Day : " + coldestday);
		
	}
	public static void main(String[] args) {
		float[][] temperatures = new float[7][24];
		for (int day=0;day<7;day++) {
            for (int hour=0;hour<24;hour++) {
                temperatures[day][hour] = (float)(Math.random()*15);
            }
        }
		for (int day=0;day<7;day++) {
            for (int hour=0;hour<24;hour++) {
                System.out.print(temperatures[day][hour] + " ");
            }
            System.out.println(" ");
        }
		analyzeTemperature(temperatures);
	}
}
