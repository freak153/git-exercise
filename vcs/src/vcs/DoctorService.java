package vcs;


public class DoctorService {
	

	
	public Doctor addDoctor(Doctor doc) {
		Doctor doc1;
		if(doc==null) {
			 doc1=new Doctor(12,"Surabhi");
			 return doc1;
		}
		else {
			return doc;
		}
		
	}
	

	
}
