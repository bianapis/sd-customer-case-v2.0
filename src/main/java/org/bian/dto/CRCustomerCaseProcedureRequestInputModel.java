package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureRequestInputModelCustomerCaseProcedureInstanceRecord;
import org.bian.dto.CRCustomerCaseProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRequestInputModel
 */
public class CRCustomerCaseProcedureRequestInputModel   {
  private String customerCaseServicingSessionReference = null;

  private String customerCaseProcedureInstanceReference = null;

  private CRCustomerCaseProcedureRequestInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private Object customerCaseProcedureRequestActionTaskRecord = null;

  private CRCustomerCaseProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerCaseProcedureRequestInputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureRequestInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCaseProcedureRequestActionTaskRecord
  **/

  public Object getCustomerCaseProcedureRequestActionTaskRecord() {
    return customerCaseProcedureRequestActionTaskRecord;
  }

  public void setCustomerCaseProcedureRequestActionTaskRecord(Object customerCaseProcedureRequestActionTaskRecord) {
    this.customerCaseProcedureRequestActionTaskRecord = customerCaseProcedureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerCaseProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerCaseProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

