package com.yongpoliu.togglz.start.feature;


import com.yongpoliu.togglz.start.feature.group.Performance;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyTogglzFeature implements Feature {

  @EnabledByDefault
  @Performance
  @Label("first feature")
  FEATURE_ONE,

  @Label("second feature")
  FEATURE_TWO;

  public boolean isActive() {
    return FeatureContext.getFeatureManager().isActive(this);
  }
}
