package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveInputModelDeterminationInstanceReport
 */
public class BQDeterminationRetrieveInputModelDeterminationInstanceReport   {
  private String determinationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return determinationInstanceReportReference
  **/

  public String getDeterminationInstanceReportReference() {
    return determinationInstanceReportReference;
  }

  public void setDeterminationInstanceReportReference(String determinationInstanceReportReference) {
    this.determinationInstanceReportReference = determinationInstanceReportReference;
  }


}

