package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisUpdateInputModelAnalysisInstanceRecord
 */
public class BQAnalysisUpdateInputModelAnalysisInstanceRecord   {
  private Object customerContactRecord = null;

  private String caseAnalysisWorkProduct = null;

  private String caseAnalysisWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The contact record contains all details of the initial case submission 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return caseAnalysisWorkProduct
  **/

  public String getCaseAnalysisWorkProduct() {
    return caseAnalysisWorkProduct;
  }

  public void setCaseAnalysisWorkProduct(String caseAnalysisWorkProduct) {
    this.caseAnalysisWorkProduct = caseAnalysisWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the case root cause analysis 
   * @return caseAnalysisWorkTaskResult
  **/

  public String getCaseAnalysisWorkTaskResult() {
    return caseAnalysisWorkTaskResult;
  }

  public void setCaseAnalysisWorkTaskResult(String caseAnalysisWorkTaskResult) {
    this.caseAnalysisWorkTaskResult = caseAnalysisWorkTaskResult;
  }


}

