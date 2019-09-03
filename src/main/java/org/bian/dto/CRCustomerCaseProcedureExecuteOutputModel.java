package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureExecuteOutputModel
 */
public class CRCustomerCaseProcedureExecuteOutputModel   {
  private CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private String customerCaseProcedureExecuteActionTaskReference = null;

  private Object customerCaseProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Procedure instance execute service call 
   * @return customerCaseProcedureExecuteActionTaskReference
  **/

  public String getCustomerCaseProcedureExecuteActionTaskReference() {
    return customerCaseProcedureExecuteActionTaskReference;
  }

  public void setCustomerCaseProcedureExecuteActionTaskReference(String customerCaseProcedureExecuteActionTaskReference) {
    this.customerCaseProcedureExecuteActionTaskReference = customerCaseProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerCaseProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerCaseProcedureExecuteActionTaskRecord() {
    return customerCaseProcedureExecuteActionTaskRecord;
  }

  public void setCustomerCaseProcedureExecuteActionTaskRecord(Object customerCaseProcedureExecuteActionTaskRecord) {
    this.customerCaseProcedureExecuteActionTaskRecord = customerCaseProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

