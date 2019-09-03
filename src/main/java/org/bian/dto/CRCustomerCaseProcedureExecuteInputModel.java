package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureExecuteInputModelCustomerCaseProcedureInstanceRecord;
import org.bian.dto.CRCustomerCaseProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureExecuteInputModel
 */
public class CRCustomerCaseProcedureExecuteInputModel   {
  private String customerCaseServicingSessionReference = null;

  private String customerCaseProcedureInstanceReference = null;

  private CRCustomerCaseProcedureExecuteInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private Object customerCaseProcedureExecuteActionTaskRecord = null;

  private CRCustomerCaseProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public CRCustomerCaseProcedureExecuteInputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureExecuteInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerCaseProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerCaseProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

