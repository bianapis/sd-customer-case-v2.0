package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureInitiateOutputModel
 */
public class CRCustomerCaseProcedureInitiateOutputModel   {
  private String customerCaseProcedureInstanceReference = null;

  private String customerCaseProcedureInitiateActionReference = null;

  private Object customerCaseProcedureInitiateActionRecord = null;

  private String customerCaseProcedureInstanceStatus = null;

  private CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerCaseProcedureInitiateActionReference
  **/

  public String getCustomerCaseProcedureInitiateActionReference() {
    return customerCaseProcedureInitiateActionReference;
  }

  public void setCustomerCaseProcedureInitiateActionReference(String customerCaseProcedureInitiateActionReference) {
    this.customerCaseProcedureInitiateActionReference = customerCaseProcedureInitiateActionReference;
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

  public CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


}

