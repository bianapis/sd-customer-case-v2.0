package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord
 */
public class CRCustomerCaseProcedureRetrieveOutputModelCustomerCaseProcedureInstanceReportRecord   {
  private String customerCaseProcedureInstanceReportData = null;

  private String customerCaseProcedureInstanceReportType = null;

  private Object customerCaseProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCaseProcedureInstanceReportData
  **/

  public String getCustomerCaseProcedureInstanceReportData() {
    return customerCaseProcedureInstanceReportData;
  }

  public void setCustomerCaseProcedureInstanceReportData(String customerCaseProcedureInstanceReportData) {
    this.customerCaseProcedureInstanceReportData = customerCaseProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCaseProcedureInstanceReport
  **/

  public Object getCustomerCaseProcedureInstanceReport() {
    return customerCaseProcedureInstanceReport;
  }

  public void setCustomerCaseProcedureInstanceReport(Object customerCaseProcedureInstanceReport) {
    this.customerCaseProcedureInstanceReport = customerCaseProcedureInstanceReport;
  }


}

