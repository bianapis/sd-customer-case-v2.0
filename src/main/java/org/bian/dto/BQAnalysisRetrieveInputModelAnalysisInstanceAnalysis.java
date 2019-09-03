package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis
 */
public class BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis   {
  private String analysisInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return analysisInstanceAnalysisReference
  **/

  public String getAnalysisInstanceAnalysisReference() {
    return analysisInstanceAnalysisReference;
  }

  public void setAnalysisInstanceAnalysisReference(String analysisInstanceAnalysisReference) {
    this.analysisInstanceAnalysisReference = analysisInstanceAnalysisReference;
  }


}

