package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis
 */
public class BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis   {
  private String determinationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return determinationInstanceAnalysisReference
  **/

  public String getDeterminationInstanceAnalysisReference() {
    return determinationInstanceAnalysisReference;
  }

  public void setDeterminationInstanceAnalysisReference(String determinationInstanceAnalysisReference) {
    this.determinationInstanceAnalysisReference = determinationInstanceAnalysisReference;
  }


}

