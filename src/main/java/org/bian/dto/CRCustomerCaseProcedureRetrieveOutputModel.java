package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceRecord;
import org.bian.dto.CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveOutputModel
 */
public class CRCustomerCaseProcedureRetrieveOutputModel   {
  private CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private String customerCaseProcedureRetrieveActionTaskReference = null;

  private Object customerCaseProcedureRetrieveActionTaskRecord = null;

  private String customerCaseProcedureRetrieveActionResponse = null;

  private CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord customerCaseProcedureInstanceReportRecord = null;

  private CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis customerCaseProcedureInstanceAnalysis = null;


  /**
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Procedure instance retrieve service call 
   * @return customerCaseProcedureRetrieveActionTaskReference
  **/

  public String getCustomerCaseProcedureRetrieveActionTaskReference() {
    return customerCaseProcedureRetrieveActionTaskReference;
  }

  public void setCustomerCaseProcedureRetrieveActionTaskReference(String customerCaseProcedureRetrieveActionTaskReference) {
    this.customerCaseProcedureRetrieveActionTaskReference = customerCaseProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCaseProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerCaseProcedureRetrieveActionTaskRecord() {
    return customerCaseProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerCaseProcedureRetrieveActionTaskRecord(Object customerCaseProcedureRetrieveActionTaskRecord) {
    this.customerCaseProcedureRetrieveActionTaskRecord = customerCaseProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCaseProcedureRetrieveActionResponse
  **/

  public String getCustomerCaseProcedureRetrieveActionResponse() {
    return customerCaseProcedureRetrieveActionResponse;
  }

  public void setCustomerCaseProcedureRetrieveActionResponse(String customerCaseProcedureRetrieveActionResponse) {
    this.customerCaseProcedureRetrieveActionResponse = customerCaseProcedureRetrieveActionResponse;
  }


  /**
   * Get customerCaseProcedureInstanceReportRecord
   * @return customerCaseProcedureInstanceReportRecord
  **/

  public CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord getCustomerCaseProcedureInstanceReportRecord() {
    return customerCaseProcedureInstanceReportRecord;
  }

  public void setCustomerCaseProcedureInstanceReportRecord(CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord customerCaseProcedureInstanceReportRecord) {
    this.customerCaseProcedureInstanceReportRecord = customerCaseProcedureInstanceReportRecord;
  }


  /**
   * Get customerCaseProcedureInstanceAnalysis
   * @return customerCaseProcedureInstanceAnalysis
  **/

  public CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis getCustomerCaseProcedureInstanceAnalysis() {
    return customerCaseProcedureInstanceAnalysis;
  }

  public void setCustomerCaseProcedureInstanceAnalysis(CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis customerCaseProcedureInstanceAnalysis) {
    this.customerCaseProcedureInstanceAnalysis = customerCaseProcedureInstanceAnalysis;
  }


}

