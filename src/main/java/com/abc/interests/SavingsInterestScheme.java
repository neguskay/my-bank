package com.abc.interests;

import com.abc.interests.calulator.InterestRateCalculator;

public class SavingsInterestScheme extends InterestScheme{

  public SavingsInterestScheme(String schemeName, double initialRate,
                               InterestRateCalculator iCalculator, boolean isRateFlat) {

    super(schemeName, initialRate, iCalculator, isRateFlat);
  }
}
