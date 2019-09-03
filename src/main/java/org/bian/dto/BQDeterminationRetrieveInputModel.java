package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis;
import org.bian.dto.BQDeterminationRetrieveInputModelDeterminationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveInputModel
 */
public class BQDeterminationRetrieveInputModel   {
  private Object determinationRetrieveActionTaskRecord = null;

  private String determinationRetrieveActionRequest = null;

  private BQDeterminationRetrieveInputModelDeterminationInstanceReport determinationInstanceReport = null;

  private BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis determinationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return determinationRetrieveActionTaskRecord
  **/

  public Object getDeterminationRetrieveActionTaskRecord() {
    return determinationRetrieveActionTaskRecord;
  }

  public void setDeterminationRetrieveActionTaskRecord(Object determinationRetrieveActionTaskRecord) {
    this.determinationRetrieveActionTaskRecord = determinationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return determinationRetrieveActionRequest
  **/

  public String getDeterminationRetrieveActionRequest() {
    return determinationRetrieveActionRequest;
  }

  public void setDeterminationRetrieveActionRequest(String determinationRetrieveActionRequest) {
    this.determinationRetrieveActionRequest = determinationRetrieveActionRequest;
  }


  /**
   * Get determinationInstanceReport
   * @return determinationInstanceReport
  **/

  public BQDeterminationRetrieveInputModelDeterminationInstanceReport getDeterminationInstanceReport() {
    return determinationInstanceReport;
  }

  public void setDeterminationInstanceReport(BQDeterminationRetrieveInputModelDeterminationInstanceReport determinationInstanceReport) {
    this.determinationInstanceReport = determinationInstanceReport;
  }


  /**
   * Get determinationInstanceAnalysis
   * @return determinationInstanceAnalysis
  **/

  public BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis getDeterminationInstanceAnalysis() {
    return determinationInstanceAnalysis;
  }

  public void setDeterminationInstanceAnalysis(BQDeterminationRetrieveInputModelDeterminationInstanceAnalysis determinationInstanceAnalysis) {
    this.determinationInstanceAnalysis = determinationInstanceAnalysis;
  }


}

