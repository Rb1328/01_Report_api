package in.Rahulit.service;

import java.net.http.HttpResponse;
import java.util.List;

import in.Rahulit.Res.SearchResponse;
import in.Rahulit.request.SearchRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface EligibilityService {

	public List<String> getUniquePlanName();
	
	public List<String> getUniquePlanStatus();
	
	public List<SearchResponse> search(SearchRequest request);
	
	public void generatedExcel(HttpServletResponse response) throws Exception  ;
	
//	public HttpResponse generatedExcel();   we also write as 

	public void generatedPdf(HttpServletResponse response) throws Exception;

}
