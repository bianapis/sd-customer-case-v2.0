package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveOutputModelAnalysisInstanceRecord
 */
public class BQDeterminationRetrieveOutputModelAnalysisInstanceRecord   {
  private String caseAnalysisWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the case root cause analysis 
   * @return caseAnalysisWorkTaskResult
  **/

  public String getCaseAnalysisWorkTaskResult() {
    return caseAnalysisWorkTaskResult;
  }

  public void setCaseAnalysisWorkTaskResult(String caseAnalysisWorkTaskResult) {
    this.caseAnalysisWorkTaskResult = caseAnalysisWorkTaskResult;
  }


}

