package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis
 */
public class BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis   {
  private Object analysisInstanceAnalysisRecord = null;

  private String analysisInstanceAnalysisReportType = null;

  private String analysisInstanceAnalysisParameters = null;

  private Object analysisInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return analysisInstanceAnalysisRecord
  **/

  public Object getAnalysisInstanceAnalysisRecord() {
    return analysisInstanceAnalysisRecord;
  }

  public void setAnalysisInstanceAnalysisRecord(Object analysisInstanceAnalysisRecord) {
    this.analysisInstanceAnalysisRecord = analysisInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return analysisInstanceAnalysisReportType
  **/

  public String getAnalysisInstanceAnalysisReportType() {
    return analysisInstanceAnalysisReportType;
  }

  public void setAnalysisInstanceAnalysisReportType(String analysisInstanceAnalysisReportType) {
    this.analysisInstanceAnalysisReportType = analysisInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return analysisInstanceAnalysisParameters
  **/

  public String getAnalysisInstanceAnalysisParameters() {
    return analysisInstanceAnalysisParameters;
  }

  public void setAnalysisInstanceAnalysisParameters(String analysisInstanceAnalysisParameters) {
    this.analysisInstanceAnalysisParameters = analysisInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return analysisInstanceAnalysisReport
  **/

  public Object getAnalysisInstanceAnalysisReport() {
    return analysisInstanceAnalysisReport;
  }

  public void setAnalysisInstanceAnalysisReport(Object analysisInstanceAnalysisReport) {
    this.analysisInstanceAnalysisReport = analysisInstanceAnalysisReport;
  }


}

