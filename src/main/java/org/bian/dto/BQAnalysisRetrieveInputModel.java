package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis;
import org.bian.dto.BQAnalysisRetrieveInputModelAnalysisInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveInputModel
 */
public class BQAnalysisRetrieveInputModel   {
  private Object analysisRetrieveActionTaskRecord = null;

  private String analysisRetrieveActionRequest = null;

  private BQAnalysisRetrieveInputModelAnalysisInstanceReport analysisInstanceReport = null;

  private BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis analysisInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return analysisRetrieveActionTaskRecord
  **/

  public Object getAnalysisRetrieveActionTaskRecord() {
    return analysisRetrieveActionTaskRecord;
  }

  public void setAnalysisRetrieveActionTaskRecord(Object analysisRetrieveActionTaskRecord) {
    this.analysisRetrieveActionTaskRecord = analysisRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return analysisRetrieveActionRequest
  **/

  public String getAnalysisRetrieveActionRequest() {
    return analysisRetrieveActionRequest;
  }

  public void setAnalysisRetrieveActionRequest(String analysisRetrieveActionRequest) {
    this.analysisRetrieveActionRequest = analysisRetrieveActionRequest;
  }


  /**
   * Get analysisInstanceReport
   * @return analysisInstanceReport
  **/

  public BQAnalysisRetrieveInputModelAnalysisInstanceReport getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(BQAnalysisRetrieveInputModelAnalysisInstanceReport analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }


  /**
   * Get analysisInstanceAnalysis
   * @return analysisInstanceAnalysis
  **/

  public BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis getAnalysisInstanceAnalysis() {
    return analysisInstanceAnalysis;
  }

  public void setAnalysisInstanceAnalysis(BQAnalysisRetrieveInputModelAnalysisInstanceAnalysis analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
  }


}

