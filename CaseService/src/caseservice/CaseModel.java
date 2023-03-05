package caseservice;
public class CaseModel{

	//Declaring variables for case model
	private String caseId,caseDescription,caseType,caseDate,caseResponseStatus;
	

	//constructors
	public CaseModel(String caseId, String caseDescription, String caseType, String caseDate,
			String response) {
		super();
		this.caseId = caseId;
		this.caseDescription = caseDescription;
		this.caseType = caseType;
		this.caseDate = caseDate;
		this.caseResponseStatus = response;
	}

	//getters and setters for case

	public CaseModel() {
		// TODO Auto-generated constructor stub
	}

	public String getCaseId() {
		return caseId;
	}


	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}


	public String getCaseDescription() {
		return caseDescription;
	}


	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}


	public String getCaseType() {
		return caseType;
	}


	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseDate() {
		return caseDate;
	}


	public void setCaseDate(String caseDate) {
		this.caseDate = caseDate;
	}


	public String getCaseResponse() {
		return caseResponseStatus;
	}


	public void setCaseResponse(String response) {
		this.caseResponseStatus = response;
	}

	@Override
	public String toString() {
		return "caseId: " + caseId + "\ncaseDescription: " + caseDescription + "\ncaseType: " + caseType
			    + "\ncaseDate: " + caseDate + "\ncaseResponseStatus: " + caseResponseStatus;
	}
	
}