package OOPS_INTERFACE;

public class AppollHospital implements USMedical,UKMedical,IndiaMedical {
	//can i have parent class interface
	//in interface i cant have multiple things like abs and normal methods

	@Override
	public void covidTest() {
		System.out.println("Apoolo------------->CovidTest");
		
	}

	@Override
	public void orthoServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entservices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pediaservices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physoService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardioService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}

	

}
