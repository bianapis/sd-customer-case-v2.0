package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis
 */
public class CRCustomerCaseProcedureRetrieveInputModelCustomerCaseProcedureInstanceAnalysis   {
  private String customerCaseProcedureInstanceAnalysisReference = null;

  private String customerCaseProcedureInstanceAnalysisReportType = null;

  private String customerCaseProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCaseProcedureInstanceAnalysisReference
  **/

  public String getCustomerCaseProcedureInstanceAnalysisReference() {
    return customerCaseProcedureInstanceAnalysisReference;
  }

  public void setCustomerCaseProcedureInstanceAnalysisReference(String customerCaseProcedureInstanceAnalysisReference) {
    this.customerCaseProcedureInstanceAnalysisReference = customerCaseProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCaseProcedureInstanceAnalysisReportType
  **/

  public String getCustomerCaseProcedureInstanceAnalysisReportType() {
    return customerCaseProcedureInstanceAnalysisReportType;
  }

  public void setCustomerCaseProcedureInstanceAnalysisReportType(String customerCaseProcedureInstanceAnalysisReportType) {
    this.customerCaseProcedureInstanceAnalysisReportType = customerCaseProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCaseProcedureInstanceAnalysisParameters
  **/

  public String getCustomerCaseProcedureInstanceAnalysisParameters() {
    return customerCaseProcedureInstanceAnalysisParameters;
  }

  public void setCustomerCaseProcedureInstanceAnalysisParameters(String customerCaseProcedureInstanceAnalysisParameters) {
    this.customerCaseProcedureInstanceAnalysisParameters = customerCaseProcedureInstanceAnalysisParameters;
  }


}

