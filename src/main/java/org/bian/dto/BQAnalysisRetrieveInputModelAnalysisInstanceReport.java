package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveInputModelAnalysisInstanceReport
 */
public class BQAnalysisRetrieveInputModelAnalysisInstanceReport   {
  private String analysisInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return analysisInstanceReportReference
  **/

  public String getAnalysisInstanceReportReference() {
    return analysisInstanceReportReference;
  }

  public void setAnalysisInstanceReportReference(String analysisInstanceReportReference) {
    this.analysisInstanceReportReference = analysisInstanceReportReference;
  }


}

