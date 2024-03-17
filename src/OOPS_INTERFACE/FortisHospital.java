package OOPS_INTERFACE;
//we need create relationship between from class and interface we need to use implements keyword
//extend keyword is used for class to class
//in interface compulsory we need to override ride those methods
//this is multiple Inheritance
//yes i can define individual fortis hospital methods after implementing multiple interface methods

public class FortisHospital extends UNHG implements USMedical,UKMedical,IndiaMedical {
	//fortis hospital is class extending from UNHG
	//3 parent interface and 1 class

	//this are  overridden methods  in your child class
	//US
	@Override
	public void physoService() {
		System.out.println("FP---------->physoService");
	}

	@Override
	public void cardioService() {
		System.out.println("FP---------->cardioService");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FP---------->oncologyServices");
	}

	//UK
	@Override
	public void entservices() {
		System.out.println("FP---------->entservices");		
	}

	@Override
	public void pediaservices() {
		System.out.println("FP---------->pediaservices");
		
	}
	
	//India

	@Override
	public void orthoServices() {
		System.out.println("FP---------->orthoServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FP---------->dentalServices");
	}
	
	//fortis hospital individual method
	
	public void medicaltraining() {
		System.out.println("FP------>medicaltraining");
	}
	public void optservices() {
		System.out.println("FP-------------->optservices");
	}
//Yes we can over ride emergency method only one time ,eventhough we have same method in all parent interface
	@Override
	public void emergencyServices() {
		System.out.println("FP-------------->emergencyServices");

	}
	//Fortis method will provide own medical isurance ethod
	//default void medicalinsurance() {  //Cannot reduce the visibility of the inherited method from USMedical,"default" keyword only for interface not for classes
	@Override  //overidden method  ,default method can be overridden abs allowed in java	
	public void medicalinsurance() {
		System.out.println("FH --------------->medicalinsurance");
	}
	//WHO We need to unimplemented the WHO individual method----Covidtest();

	@Override
	public void covidTest() {
		System.out.println("FH-----------> Covid test method");
		
	}

}
