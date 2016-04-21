package org.myorg.example.core.models;

public class EarlyRepaymentCharge {
	long rate;
	String untilDate;

	public long getRate() {
		return rate;
	}

	public String getUntilDate() {
		return untilDate;
	}

	public EarlyRepaymentCharge(long rate, String untilDate) {
		super();
		this.rate = rate;
		this.untilDate = untilDate;
	}
}