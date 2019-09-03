package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord
 */
public class CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceReportRecord   {
  private String customerCaseProcedureInstanceReportReference = null;

  private String customerCaseProcedureInstanceReportType = null;

  private String customerCaseProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCaseProcedureInstanceReportReference
  **/

  public String getCustomerCaseProcedureInstanceReportReference() {
    return customerCaseProcedureInstanceReportReference;
  }

  public void setCustomerCaseProcedureInstanceReportReference(String customerCaseProcedureInstanceReportReference) {
    this.customerCaseProcedureInstanceReportReference = customerCaseProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCaseProcedureInstanceReportType
  **/

  public String getCustomerCaseProcedureInstanceReportType() {
    return customerCaseProcedureInstanceReportType;
  }

  public void setCustomerCaseProcedureInstanceReportType(String customerCaseProcedureInstanceReportType) {
    this.customerCaseProcedureInstanceReportType = customerCaseProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCaseProcedureInstanceReportParameters
  **/

  public String getCustomerCaseProcedureInstanceReportParameters() {
    return customerCaseProcedureInstanceReportParameters;
  }

  public void setCustomerCaseProcedureInstanceReportParameters(String customerCaseProcedureInstanceReportParameters) {
    this.customerCaseProcedureInstanceReportParameters = customerCaseProcedureInstanceReportParameters;
  }


}

