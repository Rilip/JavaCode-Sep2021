package OOPS_INTERFACE;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.cardioService();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entservices();
		fh.optservices();
		fh.medicaltraining();
		USMedical.billing();  //USMedical----------->billing
	// fh.billing(); i cant access billing method of USMedical
		fh.medicalinsurance();  //FH -medical insurance //i can access parent class to child class default method which is there in USedical  14-50.01
		
		System.out.println(USMedical.min_fee);  //100
		//USMedical.min_fee=200;  //The final field USMedical.min_fee cannot be assigned
		//fortis hospital is child of US MEdical
		System.out.println(FortisHospital.min_fee);  //100
		
		fh.covidTest();  //FH-----------> Covid test method
		
		//fh.covidGuideLines();  //UNHG------------>covidGuideLines
		UNHG.covidGuideLines();  //UNHG------------>covidGuideLines
		fh.medicalinfo();     //UNHG------------>medicalinfo
		
		//can not create object of Interface  14-34-02
		//USMedical us=new USMedical();  //Cannot instantiate the type USMedical
		//UKMedical uk=new UKMedical();   //Cannot instantiate the type UKMedical
		//IndiaMedical in=new IndiaMedical();/Cannot instantiate the type IndiaMedical
		
		/// child  class object can be reffered by parent interface reff variable---yes absolutely allowed

		//top casting approach
		USMedical us=new FortisHospital();
		us.cardioService();
		us.physoService();
		us.emergencyServices();
		us.oncologyServices();
	//us.biling(); i cant access ,access by USMedical.billing	
		us.medicalinsurance(); //always preference given to overridden method from jdk1.8 //US default  ----------->medicalinsurance
		
		//i can't access the individual methods of Fortis Hospital
		//us.medicaltraining();  (Reference type check fails) will happened 
		/*FP---------->cardioService
          FP---------->physoService
          FP-------------->emergencyServices
          AZz FP---------->oncologyServices*/
		
		UKMedical uk=new FortisHospital();
		uk.emergencyServices();
		uk.entservices();
		uk.pediaservices();
		//uk.medicaltraining();  (Reference check fails )
		
		IndiaMedical in=new FortisHospital();
		in.dentalServices();
		in.emergencyServices();
		in.orthoServices();
		//Run time down casting strictly not allowed
		//Can i do down casting at compile time
		//parent interface object can be refereed by child  class ref variable
		//FortisHospital fp=new UKMedical();  
		
		
	}

}
