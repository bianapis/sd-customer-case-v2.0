package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureExchangeOutputModel
 */
public class CRCustomerCaseProcedureExchangeOutputModel   {
  private String customerCaseProcedureExchangeActionTaskReference = null;

  private Object customerCaseProcedureExchangeActionTaskRecord = null;

  private String customerCaseProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Procedure instance exchange service call 
   * @return customerCaseProcedureExchangeActionTaskReference
  **/

  public String getCustomerCaseProcedureExchangeActionTaskReference() {
    return customerCaseProcedureExchangeActionTaskReference;
  }

  public void setCustomerCaseProcedureExchangeActionTaskReference(String customerCaseProcedureExchangeActionTaskReference) {
    this.customerCaseProcedureExchangeActionTaskReference = customerCaseProcedureExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCaseProcedureExchangeActionResponse
  **/

  public String getCustomerCaseProcedureExchangeActionResponse() {
    return customerCaseProcedureExchangeActionResponse;
  }

  public void setCustomerCaseProcedureExchangeActionResponse(String customerCaseProcedureExchangeActionResponse) {
    this.customerCaseProcedureExchangeActionResponse = customerCaseProcedureExchangeActionResponse;
  }


}

