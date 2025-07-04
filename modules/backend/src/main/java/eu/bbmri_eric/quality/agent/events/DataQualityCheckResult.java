package eu.bbmri_eric.quality.agent.events;

import java.time.LocalDateTime;
import org.springframework.context.ApplicationEvent;

public class DataQualityCheckResult extends ApplicationEvent {

  private final Long checkId;
  private final String checkName;
  private final int rawValue;
  private final String error;
  private final LocalDateTime finishedAt;
  private final int warningThreshold;
  private final int errorThreshold;
  private final float epsilon;

  public DataQualityCheckResult(
      Object source,
      Long checkId,
      String checkName,
      int rawValue,
      String error,
      LocalDateTime finishedAt,
      int warningThreshold,
      int errorThreshold,
      float epsilon) {
    super(source);
    this.checkId = checkId;
    this.checkName = checkName;
    this.rawValue = rawValue;
    this.error = error;
    this.finishedAt = finishedAt;
    this.warningThreshold = warningThreshold;
    this.errorThreshold = errorThreshold;
    this.epsilon = epsilon;
  }

  public Long getCheckId() {
    return checkId;
  }

  public int getRawValue() {
    return rawValue;
  }

  public String getError() {
    return error;
  }

  public LocalDateTime getFinishedAt() {
    return finishedAt;
  }

  public int getWarningThreshold() {
    return warningThreshold;
  }

  public int getErrorThreshold() {
    return errorThreshold;
  }

  public String getCheckName() {
    return checkName;
  }

  public float getEpsilon() {
    return epsilon;
  }
}
