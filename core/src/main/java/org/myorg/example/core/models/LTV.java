package org.myorg.example.core.models;

public class LTV {
	long Ratio;
	String minLoan;
	String maxLoan;

	public LTV(long ratio, String minLoan, String maxLoan) {
		super();
		Ratio = ratio;
		this.minLoan = minLoan;
		this.maxLoan = maxLoan;
	}

	public long getRatio() {
		return Ratio;
	}

	public String getMinLoan() {
		return minLoan;
	}

	public String getMaxLoan() {
		return maxLoan;
	}
}