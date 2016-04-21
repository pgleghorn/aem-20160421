package org.myorg.example.core.models;

public class Rate {
	String productName;
	double initialInterestRate;
	double followOnInterestRate;
	double overallCost;
	LTV LTV;
	long mortgageFee;
	EarlyRepaymentCharge earlyRepaymentCharge;

	public Rate(String productName, double initialInterestRate,
			double followOnInterestRate, double overallCost, LTV LTV,
			long mortgageFee, EarlyRepaymentCharge earlyRepaymentCharge) {
		super();
		this.productName = productName;
		this.initialInterestRate = initialInterestRate;
		this.followOnInterestRate = followOnInterestRate;
		this.overallCost = overallCost;
		this.LTV = LTV;
		this.mortgageFee = mortgageFee;
		this.earlyRepaymentCharge = earlyRepaymentCharge;
	}

	public String getProductName() {
		return productName;
	}

	public double getInitialInterestRate() {
		return initialInterestRate;
	}

	public double getFollowOnInterestRate() {
		return followOnInterestRate;
	}

	public double getOverallCost() {
		return overallCost;
	}

	public LTV getLTV() {
		return LTV;
	}

	public long getMortgageFee() {
		return mortgageFee;
	}

	public EarlyRepaymentCharge getEarlyRepaymentCharge() {
		return earlyRepaymentCharge;
	}
}
