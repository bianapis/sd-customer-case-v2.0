package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureExchangeInputModel
 */
public class CRCustomerCaseProcedureExchangeInputModel   {
  private String customerCaseServicingSessionReference = null;

  private String customerCaseProcedureInstanceReference = null;

  private Object customerCaseProcedureExchangeActionTaskRecord = null;

  private CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest customerCaseProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCaseServicingSessionReference
  **/

  public String getCustomerCaseServicingSessionReference() {
    return customerCaseServicingSessionReference;
  }

  public void setCustomerCaseServicingSessionReference(String customerCaseServicingSessionReference) {
    this.customerCaseServicingSessionReference = customerCaseServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Case Procedure instance 
   * @return customerCaseProcedureInstanceReference
  **/

  public String getCustomerCaseProcedureInstanceReference() {
    return customerCaseProcedureInstanceReference;
  }

  public void setCustomerCaseProcedureInstanceReference(String customerCaseProcedureInstanceReference) {
    this.customerCaseProcedureInstanceReference = customerCaseProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCaseProcedureExchangeActionTaskRecord
  **/

  public Object getCustomerCaseProcedureExchangeActionTaskRecord() {
    return customerCaseProcedureExchangeActionTaskRecord;
  }

  public void setCustomerCaseProcedureExchangeActionTaskRecord(Object customerCaseProcedureExchangeActionTaskRecord) {
    this.customerCaseProcedureExchangeActionTaskRecord = customerCaseProcedureExchangeActionTaskRecord;
  }


  /**
   * Get customerCaseProcedureExchangeActionRequest
   * @return customerCaseProcedureExchangeActionRequest
  **/

  public CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest getCustomerCaseProcedureExchangeActionRequest() {
    return customerCaseProcedureExchangeActionRequest;
  }

  public void setCustomerCaseProcedureExchangeActionRequest(CRCustomerCaseProcedureExchangeInputModelCustomerCaseProcedureExchangeActionRequest customerCaseProcedureExchangeActionRequest) {
    this.customerCaseProcedureExchangeActionRequest = customerCaseProcedureExchangeActionRequest;
  }


}

