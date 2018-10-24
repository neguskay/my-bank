package com.abc.interests;

import com.abc.interests.calulator.InterestRateCalculator;
import com.abc.interests.defaults.InterestRates;

public class CheckingInterestScheme extends InterestScheme{
  private static final String DEFAULT_CHECKING_SCHEME_NAME= "Checking Interest";

  //private InterestRateCalculator iCalculator;

  public CheckingInterestScheme() {
    super(DEFAULT_CHECKING_SCHEME_NAME, InterestRates.DEFAULT_CHECKING_RATE, null, false);
  }
}
