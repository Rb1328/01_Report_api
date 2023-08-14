package in.Rahulit.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {

	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public SearchRequest(String planName, String planStatus, LocalDate planStartDate, LocalDate planEndDate) {
		super();
		this.planName = planName;
		this.planStatus = planStatus;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
	}
	public SearchRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SearchRequest [planName=" + planName + ", planStatus=" + planStatus + ", planStartDate=" + planStartDate
				+ ", planEndDate=" + planEndDate + "]";
	}
	
}
