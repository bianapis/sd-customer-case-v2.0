package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis
 */
public class CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceAnalysis   {
  private String customerCaseProcedureInstanceAnalysisData = null;

  private String customerCaseProcedureInstanceAnalysisReportType = null;

  private Object customerCaseProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCaseProcedureInstanceAnalysisData
  **/

  public String getCustomerCaseProcedureInstanceAnalysisData() {
    return customerCaseProcedureInstanceAnalysisData;
  }

  public void setCustomerCaseProcedureInstanceAnalysisData(String customerCaseProcedureInstanceAnalysisData) {
    this.customerCaseProcedureInstanceAnalysisData = customerCaseProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCaseProcedureInstanceAnalysisReport
  **/

  public Object getCustomerCaseProcedureInstanceAnalysisReport() {
    return customerCaseProcedureInstanceAnalysisReport;
  }

  public void setCustomerCaseProcedureInstanceAnalysisReport(Object customerCaseProcedureInstanceAnalysisReport) {
    this.customerCaseProcedureInstanceAnalysisReport = customerCaseProcedureInstanceAnalysisReport;
  }


}

