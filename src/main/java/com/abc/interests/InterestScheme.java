package com.abc.interests;

import com.abc.interests.calulator.InterestRateCalculator;

public class InterestScheme {

  private double initialRate;

  private String schemeName;

  private boolean isRateFlat;

  private InterestRateCalculator iCalculator;

  public InterestScheme(String schemeName, double initialRate, InterestRateCalculator iCalculator, boolean isRateFlat){

    this.schemeName = schemeName;
    this.initialRate = initialRate;
    this.iCalculator = iCalculator;
    this.isRateFlat = isRateFlat;

  }
}
