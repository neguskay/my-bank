package com.abc.interests;

import com.abc.interests.calulator.InterestRateCalculator;

public class MaxiSavingsInterestScheme extends InterestScheme{

  public MaxiSavingsInterestScheme(String schemeName, double initialRate,
                                   InterestRateCalculator iCalculator, boolean isRateFlat) {

    super(schemeName, initialRate, iCalculator, isRateFlat);

  }
}
