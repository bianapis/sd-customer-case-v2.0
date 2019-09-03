package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeterminationUpdateInputModelDeterminationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeterminationUpdateInputModel
 */
public class BQDeterminationUpdateInputModel   {
  private String customerCaseProcedureInstanceReference = null;

  private String determinationInstanceReference = null;

  private BQDeterminationUpdateInputModelDeterminationInstanceRecord determinationInstanceRecord = null;

  private Object determinationUpdateActionTaskRecord = null;

  private String determinationUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Case Procedure instance 
   * @return customerCaseProcedureInstanceReference
  **/

  public String getCustomerCaseProcedureInstanceReference() {
    return customerCaseProcedureInstanceReference;
  }

  public void setCustomerCaseProcedureInstanceReference(String customerCaseProcedureInstanceReference) {
    this.customerCaseProcedureInstanceReference = customerCaseProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Determination instance 
   * @return determinationInstanceReference
  **/

  public String getDeterminationInstanceReference() {
    return determinationInstanceReference;
  }

  public void setDeterminationInstanceReference(String determinationInstanceReference) {
    this.determinationInstanceReference = determinationInstanceReference;
  }


  /**
   * Get determinationInstanceRecord
   * @return determinationInstanceRecord
  **/

  public BQDeterminationUpdateInputModelDeterminationInstanceRecord getDeterminationInstanceRecord() {
    return determinationInstanceRecord;
  }

  public void setDeterminationInstanceRecord(BQDeterminationUpdateInputModelDeterminationInstanceRecord determinationInstanceRecord) {
    this.determinationInstanceRecord = determinationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return determinationUpdateActionTaskRecord
  **/

  public Object getDeterminationUpdateActionTaskRecord() {
    return determinationUpdateActionTaskRecord;
  }

  public void setDeterminationUpdateActionTaskRecord(Object determinationUpdateActionTaskRecord) {
    this.determinationUpdateActionTaskRecord = determinationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return determinationUpdateActionRequest
  **/

  public String getDeterminationUpdateActionRequest() {
    return determinationUpdateActionRequest;
  }

  public void setDeterminationUpdateActionRequest(String determinationUpdateActionRequest) {
    this.determinationUpdateActionRequest = determinationUpdateActionRequest;
  }


}

