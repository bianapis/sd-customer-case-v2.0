package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQResolutionUpdateInputModelResolutionInstanceRecord
 */
public class BQResolutionUpdateInputModelResolutionInstanceRecord   {
  private String correspondenceInstanceReference = null;

  private String correspondenceContent = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String documentContent = null;

  private String employeeBusinessUnitReference = null;

  private String paymentOrderReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondence generated and received 
   * @return correspondenceInstanceReference
  **/

  public String getCorrespondenceInstanceReference() {
    return correspondenceInstanceReference;
  }

  public void setCorrespondenceInstanceReference(String correspondenceInstanceReference) {
    this.correspondenceInstanceReference = correspondenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Correspondence content - messages sent to and received from involved parties 
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The document reference for associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Document copy/content - legal or significant documents created & referenced 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit responsible for the customer case resolution actions 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the resolution payment order when financial adjustments are required to resolve the customer case 
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


}

