package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveInputModel
 */
public class CRCustomerCaseProcedureRetrieveInputModel   {
  private Object customerCaseProcedureRetrieveActionTaskRecord = null;

  private String customerCaseProcedureRetrieveActionRequest = null;

  private CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord customerCaseProcedureInstanceReportRecord = null;

  private CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis customerCaseProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCaseProcedureRetrieveActionRequest
  **/

  public String getCustomerCaseProcedureRetrieveActionRequest() {
    return customerCaseProcedureRetrieveActionRequest;
  }

  public void setCustomerCaseProcedureRetrieveActionRequest(String customerCaseProcedureRetrieveActionRequest) {
    this.customerCaseProcedureRetrieveActionRequest = customerCaseProcedureRetrieveActionRequest;
  }


  /**
   * Get customerCaseProcedureInstanceReportRecord
   * @return customerCaseProcedureInstanceReportRecord
  **/

  public CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord getCustomerCaseProcedureInstanceReportRecord() {
    return customerCaseProcedureInstanceReportRecord;
  }

  public void setCustomerCaseProcedureInstanceReportRecord(CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord customerCaseProcedureInstanceReportRecord) {
    this.customerCaseProcedureInstanceReportRecord = customerCaseProcedureInstanceReportRecord;
  }


  /**
   * Get customerCaseProcedureInstanceAnalysis
   * @return customerCaseProcedureInstanceAnalysis
  **/

  public CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis getCustomerCaseProcedureInstanceAnalysis() {
    return customerCaseProcedureInstanceAnalysis;
  }

  public void setCustomerCaseProcedureInstanceAnalysis(CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis customerCaseProcedureInstanceAnalysis) {
    this.customerCaseProcedureInstanceAnalysis = customerCaseProcedureInstanceAnalysis;
  }


}

