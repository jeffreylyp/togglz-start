package com.yongpoliu.togglz.start.feature;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@Component
public final class FeatureConfig {

  @Bean
  public FeatureProvider featureProvider() {
    EnumBasedFeatureProvider featureProvider = new EnumBasedFeatureProvider();
    featureProvider.addFeatureEnum(MyTogglzFeature.class);
    return featureProvider;
  }

}
