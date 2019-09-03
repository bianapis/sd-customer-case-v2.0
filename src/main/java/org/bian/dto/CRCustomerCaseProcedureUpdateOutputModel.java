package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseProcedureUpdateInputModelCustomerCaseProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureUpdateOutputModel
 */
public class CRCustomerCaseProcedureUpdateOutputModel   {
  private CRCustomerCaseProcedureUpdateInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord = null;

  private String customerCaseProcedureUpdateActionTaskReference = null;

  private Object customerCaseProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerCaseProcedureInstanceRecord
   * @return customerCaseProcedureInstanceRecord
  **/

  public CRCustomerCaseProcedureUpdateInputModelCustomerCaseProcedureInstanceRecord getCustomerCaseProcedureInstanceRecord() {
    return customerCaseProcedureInstanceRecord;
  }

  public void setCustomerCaseProcedureInstanceRecord(CRCustomerCaseProcedureUpdateInputModelCustomerCaseProcedureInstanceRecord customerCaseProcedureInstanceRecord) {
    this.customerCaseProcedureInstanceRecord = customerCaseProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCaseProcedureUpdateActionTaskReference
  **/

  public String getCustomerCaseProcedureUpdateActionTaskReference() {
    return customerCaseProcedureUpdateActionTaskReference;
  }

  public void setCustomerCaseProcedureUpdateActionTaskReference(String customerCaseProcedureUpdateActionTaskReference) {
    this.customerCaseProcedureUpdateActionTaskReference = customerCaseProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCaseProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerCaseProcedureUpdateActionTaskRecord() {
    return customerCaseProcedureUpdateActionTaskRecord;
  }

  public void setCustomerCaseProcedureUpdateActionTaskRecord(Object customerCaseProcedureUpdateActionTaskRecord) {
    this.customerCaseProcedureUpdateActionTaskRecord = customerCaseProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

