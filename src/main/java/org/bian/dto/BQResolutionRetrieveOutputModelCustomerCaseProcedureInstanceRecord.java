package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionRetrieveOutputModelCustomerCaseProcedureInstanceRecord
 */
public class BQResolutionRetrieveOutputModelCustomerCaseProcedureInstanceRecord   {
  private String customerCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerContactRecordReference = null;

  private String productTransactionReference = null;

  private Object productTransactionRecord = null;

  private String caseLocation = null;

  private String date = null;

  private String employeeBusinessUnitReference = null;

  private String customerCaseResolutionSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of case being processed including any supporting narrative (e.g. disputed charges, suspected account fraud, stolen device, change of status) 
   * @return customerCaseType
  **/

  public String getCustomerCaseType() {
    return customerCaseType;
  }

  public void setCustomerCaseType(String customerCaseType) {
    this.customerCaseType = customerCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific product instance associated with the case 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The customer raising the case 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the complete contact record assembled during the contact where the case was raised if appropriate 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to one or more product transactions associated with the case 
   * @return productTransactionReference
  **/

  public String getProductTransactionReference() {
    return productTransactionReference;
  }

  public void setProductTransactionReference(String productTransactionReference) {
    this.productTransactionReference = productTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The complete transaction record for transactions associated with the case (detailed attribute breakdown not included) 
   * @return productTransactionRecord
  **/

  public Object getProductTransactionRecord() {
    return productTransactionRecord;
  }

  public void setProductTransactionRecord(Object productTransactionRecord) {
    this.productTransactionRecord = productTransactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the physical address or electronic venue the customer case was detected 
   * @return caseLocation
  **/

  public String getCaseLocation() {
    return caseLocation;
  }

  public void setCaseLocation(String caseLocation) {
    this.caseLocation = caseLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time when the case was initiated 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in capturing the case 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The case processing schedule including key tasks and dates for resolution (target and actual dates/times ) 
   * @return customerCaseResolutionSchedule
  **/

  public String getCustomerCaseResolutionSchedule() {
    return customerCaseResolutionSchedule;
  }

  public void setCustomerCaseResolutionSchedule(String customerCaseResolutionSchedule) {
    this.customerCaseResolutionSchedule = customerCaseResolutionSchedule;
  }


}

