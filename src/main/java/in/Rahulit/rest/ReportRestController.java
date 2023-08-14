package in.Rahulit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Rahulit.Res.SearchResponse;
import in.Rahulit.request.SearchRequest;
import in.Rahulit.service.ReportServiceImpl;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {
	@Autowired
	private ReportServiceImpl service;
	@GetMapping("/plans")
	public ResponseEntity<List<String>> getPlanName(){
		List<String> planName = service.getUniquePlanName();
		return new ResponseEntity<>(planName,HttpStatus.OK);
	}

	@GetMapping("/statuses")
	public ResponseEntity<List<String>> getStatus(){
		List<String> planStatus = service.getUniquePlanStatus();
		return new ResponseEntity<>(planStatus,HttpStatus.OK);
	}
	
	@PostMapping("/search")
	public ResponseEntity<List<SearchResponse>> Search(@RequestBody SearchRequest request){
		
		List<SearchResponse> response = service.search(request);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/excel")
	public void excelReport(HttpServletResponse response) throws Exception {
		response.setContentType("application/octet-stream");
		String headerKey="Content-Dispositon";
		String headerValue="attachment;filename=data.xlsx";
		response.setHeader(headerKey, headerValue);
		service.generatedExcel(response);
	}
	
	@GetMapping("/pdf")
	public void pdfReport(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");	
		
		String headerKey="Content-Disposition";
				String headerValue="attachment;filename=data.xls";
		service.generatedPdf(response);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
