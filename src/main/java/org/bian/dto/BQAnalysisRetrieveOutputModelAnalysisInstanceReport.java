package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveOutputModelAnalysisInstanceReport
 */
public class BQAnalysisRetrieveOutputModelAnalysisInstanceReport   {
  private Object analysisInstanceReportRecord = null;

  private String analysisInstanceReportType = null;

  private String analysisInstanceReportParameters = null;

  private Object analysisInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return analysisInstanceReportRecord
  **/

  public Object getAnalysisInstanceReportRecord() {
    return analysisInstanceReportRecord;
  }

  public void setAnalysisInstanceReportRecord(Object analysisInstanceReportRecord) {
    this.analysisInstanceReportRecord = analysisInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return analysisInstanceReportType
  **/

  public String getAnalysisInstanceReportType() {
    return analysisInstanceReportType;
  }

  public void setAnalysisInstanceReportType(String analysisInstanceReportType) {
    this.analysisInstanceReportType = analysisInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return analysisInstanceReportParameters
  **/

  public String getAnalysisInstanceReportParameters() {
    return analysisInstanceReportParameters;
  }

  public void setAnalysisInstanceReportParameters(String analysisInstanceReportParameters) {
    this.analysisInstanceReportParameters = analysisInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return analysisInstanceReport
  **/

  public Object getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(Object analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }


}

