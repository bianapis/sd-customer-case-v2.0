package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis;
import org.bian.dto.BQAnalysisRetrieveOutputModelAnalysisInstanceReport;
import org.bian.dto.BQAnalysisRetrieveOutputModelCustomerCaseProcedureInstanceRecord;
import org.bian.dto.BQAnalysisUpdateInputModelAnalysisInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAnalysisRetrieveOutputModel
 */
public class BQAnalysisRetrieveOutputModel   {
  private BQAnalysisRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private BQAnalysisUpdateInputModelAnalysisInstanceRecord analysisInstanceRecord = null;

  private String analysisRetrieveActionTaskReference = null;

  private Object analysisRetrieveActionTaskRecord = null;

  private String analysisRetrieveActionResponse = null;

  private BQAnalysisRetrieveOutputModelAnalysisInstanceReport analysisInstanceReport = null;

  private BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysis = null;


  /**
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public BQAnalysisRetrieveOutputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(BQAnalysisRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


  /**
   * Get analysisInstanceRecord
   * @return analysisInstanceRecord
  **/

  public BQAnalysisUpdateInputModelAnalysisInstanceRecord getAnalysisInstanceRecord() {
    return analysisInstanceRecord;
  }

  public void setAnalysisInstanceRecord(BQAnalysisUpdateInputModelAnalysisInstanceRecord analysisInstanceRecord) {
    this.analysisInstanceRecord = analysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Analysis instance retrieve service call 
   * @return analysisRetrieveActionTaskReference
  **/

  public String getAnalysisRetrieveActionTaskReference() {
    return analysisRetrieveActionTaskReference;
  }

  public void setAnalysisRetrieveActionTaskReference(String analysisRetrieveActionTaskReference) {
    this.analysisRetrieveActionTaskReference = analysisRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return analysisRetrieveActionResponse
  **/

  public String getAnalysisRetrieveActionResponse() {
    return analysisRetrieveActionResponse;
  }

  public void setAnalysisRetrieveActionResponse(String analysisRetrieveActionResponse) {
    this.analysisRetrieveActionResponse = analysisRetrieveActionResponse;
  }


  /**
   * Get analysisInstanceReport
   * @return analysisInstanceReport
  **/

  public BQAnalysisRetrieveOutputModelAnalysisInstanceReport getAnalysisInstanceReport() {
    return analysisInstanceReport;
  }

  public void setAnalysisInstanceReport(BQAnalysisRetrieveOutputModelAnalysisInstanceReport analysisInstanceReport) {
    this.analysisInstanceReport = analysisInstanceReport;
  }


  /**
   * Get analysisInstanceAnalysis
   * @return analysisInstanceAnalysis
  **/

  public BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis getAnalysisInstanceAnalysis() {
    return analysisInstanceAnalysis;
  }

  public void setAnalysisInstanceAnalysis(BQAnalysisRetrieveOutputModelAnalysisInstanceAnalysis analysisInstanceAnalysis) {
    this.analysisInstanceAnalysis = analysisInstanceAnalysis;
  }


}

