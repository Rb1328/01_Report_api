package in.Rahulit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.ComponentScan;

import in.Rahulit.Repo.EligibilityDetailsRepo;
import in.Rahulit.entity.EligibilityDetails;


@ComponentScan
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	private EligibilityDetailsRepo repo;
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub

		EligibilityDetails entity1=new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("Rahul");
		entity1.setMobile((long) 123456782);
		entity1.setGender('M');
		entity1.setSsn((long) 12458745);
		entity1.setPlanStatus("Approved");
		repo.save(entity1);
		
		EligibilityDetails entity2=new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("Rahul b");
		entity2.setMobile((long) 123456782);
		entity2.setGender('M');
		entity2.setSsn((long) 12458745);
		entity2.setPlanStatus("Rejected");
		repo.save(entity2);
		}
	

}
