package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis
 */
public class BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis   {
  private Object determinationInstanceAnalysisRecord = null;

  private String determinationInstanceAnalysisReportType = null;

  private String determinationInstanceAnalysisParameters = null;

  private Object determinationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return determinationInstanceAnalysisRecord
  **/

  public Object getDeterminationInstanceAnalysisRecord() {
    return determinationInstanceAnalysisRecord;
  }

  public void setDeterminationInstanceAnalysisRecord(Object determinationInstanceAnalysisRecord) {
    this.determinationInstanceAnalysisRecord = determinationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return determinationInstanceAnalysisReportType
  **/

  public String getDeterminationInstanceAnalysisReportType() {
    return determinationInstanceAnalysisReportType;
  }

  public void setDeterminationInstanceAnalysisReportType(String determinationInstanceAnalysisReportType) {
    this.determinationInstanceAnalysisReportType = determinationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return determinationInstanceAnalysisParameters
  **/

  public String getDeterminationInstanceAnalysisParameters() {
    return determinationInstanceAnalysisParameters;
  }

  public void setDeterminationInstanceAnalysisParameters(String determinationInstanceAnalysisParameters) {
    this.determinationInstanceAnalysisParameters = determinationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return determinationInstanceAnalysisReport
  **/

  public Object getDeterminationInstanceAnalysisReport() {
    return determinationInstanceAnalysisReport;
  }

  public void setDeterminationInstanceAnalysisReport(Object determinationInstanceAnalysisReport) {
    this.determinationInstanceAnalysisReport = determinationInstanceAnalysisReport;
  }


}

