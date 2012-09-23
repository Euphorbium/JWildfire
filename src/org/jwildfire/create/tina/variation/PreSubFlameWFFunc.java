package org.jwildfire.create.tina.variation;

import static org.jwildfire.create.tina.base.Constants.AVAILABILITY_CUDA;
import static org.jwildfire.create.tina.base.Constants.AVAILABILITY_JWILDFIRE;

import org.jwildfire.create.tina.base.XForm;
import org.jwildfire.create.tina.base.XYZPoint;

public class PreSubFlameWFFunc extends SubFlameWFFunc {
  private static final long serialVersionUID = 1L;

  @Override
  public int getPriority() {
    return -1;
  }

  @Override
  public void transform(FlameTransformationContext pContext, XForm pXForm, XYZPoint pAffineTP, XYZPoint pVarTP, double pAmount) {
    super.transform(pContext, pXForm, pAffineTP, pVarTP, pAmount);
    pAffineTP.assign(pVarTP);
  }

  @Override
  public String getName() {
    return "pre_subflame_wf";
  }

  @Override
  public int getAvailability() {
    return AVAILABILITY_JWILDFIRE | AVAILABILITY_CUDA;
  }

}
