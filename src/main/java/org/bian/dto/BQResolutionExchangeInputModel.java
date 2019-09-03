package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQResolutionExchangeInputModel
 */
public class BQResolutionExchangeInputModel   {
  private String customerCaseProcedureInstanceReference = null;

  private String resolutionInstanceReference = null;

  private Object resolutionExchangeActionTaskRecord = null;

  private CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest resolutionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Case Procedure instance 
   * @return customerCaseProcedureInstanceReference
  **/

  public String getCustomerCaseProcedureInstanceReference() {
    return customerCaseProcedureInstanceReference;
  }

  public void setCustomerCaseProcedureInstanceReference(String customerCaseProcedureInstanceReference) {
    this.customerCaseProcedureInstanceReference = customerCaseProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Resolution instance 
   * @return resolutionInstanceReference
  **/

  public String getResolutionInstanceReference() {
    return resolutionInstanceReference;
  }

  public void setResolutionInstanceReference(String resolutionInstanceReference) {
    this.resolutionInstanceReference = resolutionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return resolutionExchangeActionTaskRecord
  **/

  public Object getResolutionExchangeActionTaskRecord() {
    return resolutionExchangeActionTaskRecord;
  }

  public void setResolutionExchangeActionTaskRecord(Object resolutionExchangeActionTaskRecord) {
    this.resolutionExchangeActionTaskRecord = resolutionExchangeActionTaskRecord;
  }


  /**
   * Get resolutionExchangeActionRequest
   * @return resolutionExchangeActionRequest
  **/

  public CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest getResolutionExchangeActionRequest() {
    return resolutionExchangeActionRequest;
  }

  public void setResolutionExchangeActionRequest(CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest resolutionExchangeActionRequest) {
    this.resolutionExchangeActionRequest = resolutionExchangeActionRequest;
  }


}

