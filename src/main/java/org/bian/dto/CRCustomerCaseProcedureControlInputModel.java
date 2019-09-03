package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureControlInputModelCustomerCaseProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureControlInputModel
 */
public class CRCustomerCaseProcedureControlInputModel   {
  private String customerCaseServicingSessionReference = null;

  private String customerCaseProcedureInstanceReference = null;

  private Object customerCaseProcedureControlActionTaskRecord = null;

  private CRCustomerCaseProcedureControlInputModelCustomerCaseProcedureControlActionRequest customerCaseProcedureControlActionRequest = null;


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
   * Get customerCaseProcedureControlActionRequest
   * @return customerCaseProcedureControlActionRequest
  **/

  public CRCustomerCaseProcedureControlInputModelCustomerCaseProcedureControlActionRequest getCustomerCaseProcedureControlActionRequest() {
    return customerCaseProcedureControlActionRequest;
  }

  public void setCustomerCaseProcedureControlActionRequest(CRCustomerCaseProcedureControlInputModelCustomerCaseProcedureControlActionRequest customerCaseProcedureControlActionRequest) {
    this.customerCaseProcedureControlActionRequest = customerCaseProcedureControlActionRequest;
  }


}

