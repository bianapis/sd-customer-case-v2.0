/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCaseApiServiceImpl implements CustomerCaseApiService {

	public SDCustomerCaseActivateOutputModel activate(SDCustomerCaseActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCaseActivateOutputModel.json",new TypeReference<SDCustomerCaseActivateOutputModel>(){});
	}
	
	public SDCustomerCaseConfigureOutputModel configure(String sdReferenceId, SDCustomerCaseConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCaseConfigureOutputModel.json",new TypeReference<SDCustomerCaseConfigureOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerCaseProcedureControlOutputModel.json",new TypeReference<CRCustomerCaseProcedureControlOutputModel>(){});
	}
	
	public BQResolutionExchangeOutputModel exchangeResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionExchangeInputModel request){
		return JsonReader.read("exchange-BQResolutionExchangeOutputModel.json",new TypeReference<BQResolutionExchangeOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerCaseProcedureExchangeOutputModel.json",new TypeReference<CRCustomerCaseProcedureExchangeOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerCaseProcedureExecuteOutputModel.json",new TypeReference<CRCustomerCaseProcedureExecuteOutputModel>(){});
	}
	
	public SDCustomerCaseFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCaseFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCaseFeedbackOutputModel.json",new TypeReference<SDCustomerCaseFeedbackOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerCaseProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerCaseProcedureInitiateOutputModel.json",new TypeReference<CRCustomerCaseProcedureInitiateOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerCaseProcedureRequestOutputModel.json",new TypeReference<CRCustomerCaseProcedureRequestOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCaseProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerCaseProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAnalysisRetrieveOutputModel retrieveAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAnalysisRetrieveOutputModel.json",new TypeReference<BQAnalysisRetrieveOutputModel>(){});
	}
	
	public BQDeterminationRetrieveOutputModel retrieveDetermination(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeterminationRetrieveOutputModel.json",new TypeReference<BQDeterminationRetrieveOutputModel>(){});
	}
	
	public BQResolutionRetrieveOutputModel retrieveResolution(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQResolutionRetrieveOutputModel.json",new TypeReference<BQResolutionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerCaseRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCaseRetrieveOutputModel.json",new TypeReference<SDCustomerCaseRetrieveOutputModel>(){});
	}
	
	public CRCustomerCaseProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCaseProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCaseProcedureUpdateOutputModel.json",new TypeReference<CRCustomerCaseProcedureUpdateOutputModel>(){});
	}
	
	public BQAnalysisUpdateOutputModel updateAnalysis(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAnalysisUpdateInputModel request){
		return JsonReader.read("update-BQAnalysisUpdateOutputModel.json",new TypeReference<BQAnalysisUpdateOutputModel>(){});
	}
	
	public BQDeterminationUpdateOutputModel updateDetermination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeterminationUpdateInputModel request){
		return JsonReader.read("update-BQDeterminationUpdateOutputModel.json",new TypeReference<BQDeterminationUpdateOutputModel>(){});
	}
	
	public BQResolutionUpdateOutputModel updateResolution(String sdReferenceId, String crReferenceId, String bqReferenceId, BQResolutionUpdateInputModel request){
		return JsonReader.read("update-BQResolutionUpdateOutputModel.json",new TypeReference<BQResolutionUpdateOutputModel>(){});
	}
	
}
