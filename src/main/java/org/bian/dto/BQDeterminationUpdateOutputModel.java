package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeterminationUpdateInputModelDeterminationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeterminationUpdateOutputModel
 */
public class BQDeterminationUpdateOutputModel   {
  private BQDeterminationUpdateInputModelDeterminationInstanceRecord determinationInstanceRecord = null;

  private String determinationUpdateActionTaskReference = null;

  private Object determinationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return determinationUpdateActionTaskReference
  **/

  public String getDeterminationUpdateActionTaskReference() {
    return determinationUpdateActionTaskReference;
  }

  public void setDeterminationUpdateActionTaskReference(String determinationUpdateActionTaskReference) {
    this.determinationUpdateActionTaskReference = determinationUpdateActionTaskReference;
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

