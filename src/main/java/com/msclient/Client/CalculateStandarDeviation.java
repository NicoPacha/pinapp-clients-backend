package com.msclient.Client;

import java.util.List;

public class CalculateStandarDeviation {

	public static double calculateStandardDeviation(List<Integer> array) {
	    double sum = 0.0;
	    for (int i : array) {
	        sum += i;
	    }

	    int total = array.size();
	    double mean = sum / total;

	    double standardDeviation = 0.0;
	    for (double num : array) {
	        standardDeviation += Math.pow(num - mean, 2);
	    }

	    return Math.round(Math.sqrt(standardDeviation / total));
	}
}
