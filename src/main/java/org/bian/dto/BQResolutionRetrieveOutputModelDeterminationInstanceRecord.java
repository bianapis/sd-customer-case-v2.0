package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModelDeterminationInstanceRecord
 */
public class BQResolutionRetrieveOutputModelDeterminationInstanceRecord   {
  private String caseDeterminationWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the determination and resolution planning task 
   * @return caseDeterminationWorkTaskResult
  **/

  public String getCaseDeterminationWorkTaskResult() {
    return caseDeterminationWorkTaskResult;
  }

  public void setCaseDeterminationWorkTaskResult(String caseDeterminationWorkTaskResult) {
    this.caseDeterminationWorkTaskResult = caseDeterminationWorkTaskResult;
  }


}

