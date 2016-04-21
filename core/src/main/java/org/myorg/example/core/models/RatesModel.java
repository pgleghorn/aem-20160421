/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.myorg.example.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import java.util.*;

@Model(adaptables = Resource.class)
public class RatesModel {

	private List<Rate> rates = new ArrayList<Rate>();
	
	@PostConstruct
	protected void init() {
		// fetch the rate data (hard coded here)	
		rates.add(new Rate("Phils 2 Year Fixed", 1.59, 3.99, 3.7, new LTV(60, "5K", "1M"), 999, new EarlyRepaymentCharge(3, "30 June 2018")));
		rates.add(new Rate("Phils 2 Year Fixed", 1.73, 3.99, 3.7, new LTV(75, "10K", "1.5M"), 999, new EarlyRepaymentCharge(3, "30 June 2018")));
		rates.add(new Rate("Phils 2 Year Fixed : Purchase Only with cashback", 2.39, 3.99, 3.8, new LTV(75, "15K", "1M"), 0, new EarlyRepaymentCharge(3, "30 June 2018")));
		rates.add(new Rate("Phils 5 Year Fixed", 2.25, 3.99, 3.4, new LTV(60, "25K", "2M"), 999, new EarlyRepaymentCharge(3, "30 June 2021")));
	}

	public List<Rate> getRates() {
		return rates;
	}
}
