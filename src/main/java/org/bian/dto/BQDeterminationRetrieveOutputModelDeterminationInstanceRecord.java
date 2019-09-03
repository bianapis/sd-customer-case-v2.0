package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeterminationRetrieveOutputModelDeterminationInstanceRecord
 */
public class BQDeterminationRetrieveOutputModelDeterminationInstanceRecord   {
  private String customerAgreementInstanceReference = null;

  private String customerAgreement = null;

  private String caseDeterminationWorkProduct = null;

  private String caseDeterminationWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the in-force customer master agreement 
   * @return customerAgreementInstanceReference
  **/

  public String getCustomerAgreementInstanceReference() {
    return customerAgreementInstanceReference;
  }

  public void setCustomerAgreementInstanceReference(String customerAgreementInstanceReference) {
    this.customerAgreementInstanceReference = customerAgreementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The agreement is accessed to support the determination of the resolution approach 
   * @return customerAgreement
  **/

  public String getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(String customerAgreement) {
    this.customerAgreement = customerAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return caseDeterminationWorkProduct
  **/

  public String getCaseDeterminationWorkProduct() {
    return caseDeterminationWorkProduct;
  }

  public void setCaseDeterminationWorkProduct(String caseDeterminationWorkProduct) {
    this.caseDeterminationWorkProduct = caseDeterminationWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the determination and resolution planning task 
   * @return caseDeterminationWorkTaskResult
  **/

  public String getCaseDeterminationWorkTaskResult() {
    return caseDeterminationWorkTaskResult;
  }

  public void setCaseDeterminationWorkTaskResult(String caseDeterminationWorkTaskResult) {
    this.caseDeterminationWorkTaskResult = caseDeterminationWorkTaskResult;
  }


}

