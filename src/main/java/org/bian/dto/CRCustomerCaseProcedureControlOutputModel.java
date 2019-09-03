package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureControlOutputModel
 */
public class CRCustomerCaseProcedureControlOutputModel   {
  private String customerCaseProcedureControlActionTaskReference = null;

  private Object customerCaseProcedureControlActionTaskRecord = null;

  private String customerCaseProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Procedure instance control processing service call 
   * @return customerCaseProcedureControlActionTaskReference
  **/

  public String getCustomerCaseProcedureControlActionTaskReference() {
    return customerCaseProcedureControlActionTaskReference;
  }

  public void setCustomerCaseProcedureControlActionTaskReference(String customerCaseProcedureControlActionTaskReference) {
    this.customerCaseProcedureControlActionTaskReference = customerCaseProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerCaseProcedureControlActionTaskRecord
  **/

  public Object getCustomerCaseProcedureControlActionTaskRecord() {
    return customerCaseProcedureControlActionTaskRecord;
  }

  public void setCustomerCaseProcedureControlActionTaskRecord(Object customerCaseProcedureControlActionTaskRecord) {
    this.customerCaseProcedureControlActionTaskRecord = customerCaseProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerCaseProcedureControlActionResponse
  **/

  public String getCustomerCaseProcedureControlActionResponse() {
    return customerCaseProcedureControlActionResponse;
  }

  public void setCustomerCaseProcedureControlActionResponse(String customerCaseProcedureControlActionResponse) {
    this.customerCaseProcedureControlActionResponse = customerCaseProcedureControlActionResponse;
  }


}

