package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRequestOutputModel
 */
public class CRCustomerCaseProcedureRequestOutputModel   {
  private CRCustomerCaseProcedureInitiateOutputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private String customerCaseProcedureRequestActionTaskReference = null;

  private Object customerCaseProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Procedure instance request service call 
   * @return customerCaseProcedureRequestActionTaskReference
  **/

  public String getCustomerCaseProcedureRequestActionTaskReference() {
    return customerCaseProcedureRequestActionTaskReference;
  }

  public void setCustomerCaseProcedureRequestActionTaskReference(String customerCaseProcedureRequestActionTaskReference) {
    this.customerCaseProcedureRequestActionTaskReference = customerCaseProcedureRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

