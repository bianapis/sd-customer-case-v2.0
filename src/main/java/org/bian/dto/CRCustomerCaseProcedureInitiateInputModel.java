package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureInitiateInputModelCustomerCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureInitiateInputModel
 */
public class CRCustomerCaseProcedureInitiateInputModel   {
  private String customerCaseServicingSessionReference = null;

  private Object customerCaseProcedureInitiateActionRecord = null;

  private String customerCaseProcedureInstanceStatus = null;

  private CRCustomerCaseProcedureInitiateInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerCaseProcedureInitiateActionRecord
  **/

  public Object getCustomerCaseProcedureInitiateActionRecord() {
    return customerCaseProcedureInitiateActionRecord;
  }

  public void setCustomerCaseProcedureInitiateActionRecord(Object customerCaseProcedureInitiateActionRecord) {
    this.customerCaseProcedureInitiateActionRecord = customerCaseProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Case Procedure instance (e.g. initialised, pending, active) 
   * @return customerCaseProcedureInstanceStatus
  **/

  public String getCustomerCaseProcedureInstanceStatus() {
    return customerCaseProcedureInstanceStatus;
  }

  public void setCustomerCaseProcedureInstanceStatus(String customerCaseProcedureInstanceStatus) {
    this.customerCaseProcedureInstanceStatus = customerCaseProcedureInstanceStatus;
  }


  /**
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public CRCustomerCaseProcedureInitiateInputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureInitiateInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


}

