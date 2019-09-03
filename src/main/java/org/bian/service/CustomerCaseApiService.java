/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCaseApiService {

	SDCustomerCaseActivateOutputModel activate(SDCustomerCaseActivateInputModel request);
	
	SDCustomerCaseConfigureOutputModel configure(String sdReferenceId, SDCustomerCaseConfigureInputModel request);
	
	CRCustomerCaseProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureControlInputModel request);
	
	BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request);
	
	CRCustomerCaseProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureExchangeInputModel request);
	
	CRCustomerCaseProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureExecuteInputModel request);
	
	SDCustomerCaseFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCaseFeedbackInputModel request);
	
	CRCustomerCaseProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerCaseProcedureInitiateInputModel request);
	
	CRCustomerCaseProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureRequestInputModel request);
	
	CRCustomerCaseProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeterminationRetrieveOutputModel retrieveDetermination(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerCaseRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerCaseProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureUpdateInputModel request);
	
	BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request);
	
	BQDeterminationUpdateOutputModel updateDetermination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeterminationUpdateInputModel request);
	
	BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request);
	
}
