package caseservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaseServiceImpl implements ICaseService{

	public ArrayList<CaseModel> caseModelList;
	Scanner scn = new Scanner(System.in);
	
	public CaseServiceImpl() {
		super();
	}

	//retrieve data from the object
	@Override
	public void getAllCases() {
		// TODO Auto-generated method stub
		if(caseModelList.isEmpty()) {
			System.out.println("No any cases to check");	
		}
		else {
			System.out.println("Cases Received");
			for(CaseModel cm : caseModelList) {
				System.out.println(cm.toString());
				System.out.println("--------------------");
			}
		}
	}

	//add new data to the casemodel object
	@Override
	public void createCases() {
		caseModelList = new ArrayList<CaseModel>();
		CaseModel cases = new CaseModel();
		String id = "";
		// TODO Auto-generated method stub
		System.out.print("Enter case id: ");
		id = scn.next();

		if (id == "") {
			System.out.println("Id field can not be empty");

		}else {
			cases.setCaseId(id);
		}
		
		System.out.print("Case Description: ");
		id = scn.next();
		if (id == "") {
			System.out.println("Description cannot be empty");
		} else if(id != "") {
			cases.setCaseDescription(id);
		}
		else {
			System.out.println("Wrong Duration ");
		}
		
		System.out.print("Enter the Case Type Enter 1, if Customer;\n Enter 2, if Importer;\n Enter 3, if Supplier;\n Enter 4,if Transport:\n");
		int statusNo = scn.nextInt();
		if (statusNo == 0) {
			System.out.println("Type Cannot be enterd as 0");
		} else if (statusNo <= 1 || statusNo >= 4) {
			switch(statusNo) {
			case 1: 
				cases.setCaseType("Customer");
			break;
			case 2: 
				cases.setCaseType("Importer");
			break;
			case 3: 
				cases.setCaseType("Supplier");
			break;
			case 4: 
				cases.setCaseType("Transport");
			break;
			}
		} else {
			System.out.println("Wrong Type");
		}
		
		System.out.print("Case Date(DD/MM/YY): ");
		id = scn.next();
		
		if (id == "") {
			System.out.println("Date field Cannot be empty");
		} else if(id != "") {
			cases.setCaseDate(id);
		}
		else {
			System.out.println("Wrong Date");
		}
			
		System.out.print("Enter the Case Response state Enter 1, if Active;\n Enter 2, if Sorted;\n Enter 3, if Hold:\n");
		int val = scn.nextInt();
		if (val == 0) {
			System.out.println("Type Cannot be enterd as 0");
		} else if (val <= 1 || val >= 4) {
			switch(val) {
			case 1: 
				cases.setCaseResponse("Active");
			break;
			case 2: 
				cases.setCaseResponse("Sorted");
			break;
			case 3: 
				cases.setCaseResponse("Hold");
			break;
			}
			
		} else {
			System.out.println("Wrong Type");
		}
		caseModelList.add(cases);
		System.out.println("'"+cases.getCaseId()+"' "+" Case added successfully...");
		
	}
	private ArrayList<CaseModel> deleteCases = new ArrayList<>();

	@Override
	public void cancelCases() {
	    String id;
	    boolean delete = false;
	    System.out.print("Enter Case Id to delete: ");
	    id = scn.next();

	    for (int x = 0; x < caseModelList.size(); x++) {
	        if (caseModelList.get(x).getCaseId().equalsIgnoreCase(id)) {
	            System.out.println("Case Deleted");
	            deleteCases.add(caseModelList.get(x));
	            caseModelList.remove(x);
	            delete = true;
	            break;
	        }
	    }

	    if (!delete) {
	        System.out.println("Case Id Entered Not Found");
	    }
	}

	public void getCancelCases() {
	    boolean find = false;
	    String id;
	    
	    System.out.println("Enter the case id deleted: ");
	    id = scn.next();
	    for (CaseModel cm : deleteCases) {
	        if (cm.getCaseId().equalsIgnoreCase(id)) {
	            System.out.println("Deleted Case Details");
	            System.out.println("Case Id: " + cm.getCaseId());
	            System.out.println("Case Description: " + cm.getCaseDescription());
	            System.out.println("Case Status: " + cm.getCaseResponse());
	            find = true;
	            break;
	        }
	    }

	    if (!find) {
	        System.out.println("Entered delete id not found");
	    }
	}


	@Override
	public void getCaseResponse() {
		// TODO Auto-generated method stub
		String id;
		boolean done = false;
		System.out.println();
		System.out.print("Enter Case id to check the response ");
		Scanner scan = new Scanner(System.in);
		id = scn.next();

		for (CaseModel cm : caseModelList) {

			if (cm.getCaseId().equalsIgnoreCase(id)) {
				System.out.println("Matched Response");
				System.out.println(cm.toString());
				done = true;
				break;
			}
		}
		if (!done) {
			System.out.println();
			System.out.println("Case Not found ");
		}

	}

//	@Override
//	public void getCancelCases() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public static void main(String args []) {
		CaseServiceImpl c =  new CaseServiceImpl();
		c.createCases();
		c.getAllCases();
		c.cancelCases();
		c.getAllCases();

	}
}
