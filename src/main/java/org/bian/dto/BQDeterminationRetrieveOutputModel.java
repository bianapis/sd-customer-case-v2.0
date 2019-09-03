package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeterminationRetrieveOutputModelAnalysisInstanceRecord;
import org.bian.dto.BQDeterminationRetrieveOutputModelCustomerCaseProcedureInstanceRecord;
import org.bian.dto.BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis;
import org.bian.dto.BQDeterminationRetrieveOutputModelDeterminationInstanceRecord;
import org.bian.dto.BQDeterminationRetrieveOutputModelDeterminationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveOutputModel
 */
public class BQDeterminationRetrieveOutputModel   {
  private BQDeterminationRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private BQDeterminationRetrieveOutputModelAnalysisInstanceRecord analysisInstanceRecord = null;

  private BQDeterminationRetrieveOutputModelDeterminationInstanceRecord determinationInstanceRecord = null;

  private String determinationRetrieveActionTaskReference = null;

  private Object determinationRetrieveActionTaskRecord = null;

  private String determinationRetrieveActionResponse = null;

  private BQDeterminationRetrieveOutputModelDeterminationInstanceReport determinationInstanceReport = null;

  private BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis determinationInstanceAnalysis = null;


  /**
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public BQDeterminationRetrieveOutputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(BQDeterminationRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


  /**
   * Get analysisInstanceRecord
   * @return analysisInstanceRecord
  **/

  public BQDeterminationRetrieveOutputModelAnalysisInstanceRecord getAnalysisInstanceRecord() {
    return analysisInstanceRecord;
  }

  public void setAnalysisInstanceRecord(BQDeterminationRetrieveOutputModelAnalysisInstanceRecord analysisInstanceRecord) {
    this.analysisInstanceRecord = analysisInstanceRecord;
  }


  /**
   * Get determinationInstanceRecord
   * @return determinationInstanceRecord
  **/

  public BQDeterminationRetrieveOutputModelDeterminationInstanceRecord getDeterminationInstanceRecord() {
    return determinationInstanceRecord;
  }

  public void setDeterminationInstanceRecord(BQDeterminationRetrieveOutputModelDeterminationInstanceRecord determinationInstanceRecord) {
    this.determinationInstanceRecord = determinationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Determination instance retrieve service call 
   * @return determinationRetrieveActionTaskReference
  **/

  public String getDeterminationRetrieveActionTaskReference() {
    return determinationRetrieveActionTaskReference;
  }

  public void setDeterminationRetrieveActionTaskReference(String determinationRetrieveActionTaskReference) {
    this.determinationRetrieveActionTaskReference = determinationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return determinationRetrieveActionResponse
  **/

  public String getDeterminationRetrieveActionResponse() {
    return determinationRetrieveActionResponse;
  }

  public void setDeterminationRetrieveActionResponse(String determinationRetrieveActionResponse) {
    this.determinationRetrieveActionResponse = determinationRetrieveActionResponse;
  }


  /**
   * Get determinationInstanceReport
   * @return determinationInstanceReport
  **/

  public BQDeterminationRetrieveOutputModelDeterminationInstanceReport getDeterminationInstanceReport() {
    return determinationInstanceReport;
  }

  public void setDeterminationInstanceReport(BQDeterminationRetrieveOutputModelDeterminationInstanceReport determinationInstanceReport) {
    this.determinationInstanceReport = determinationInstanceReport;
  }


  /**
   * Get determinationInstanceAnalysis
   * @return determinationInstanceAnalysis
  **/

  public BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis getDeterminationInstanceAnalysis() {
    return determinationInstanceAnalysis;
  }

  public void setDeterminationInstanceAnalysis(BQDeterminationRetrieveOutputModelDeterminationInstanceAnalysis determinationInstanceAnalysis) {
    this.determinationInstanceAnalysis = determinationInstanceAnalysis;
  }


}

