package domain.entityTest.ContractInfoTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import domain.entity.ContractInfo.Bonus;
import domain.entity.ContractInfo.Contract;
import domain.entity.ContractInfo.ContractProperties;
import domain.testBuilders.ContextTestBuilder;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class ContractTest extends Mockito {
	
	private ContextTestBuilder testBuilder;
	private Bonus bonus;
	private ContractProperties contractProperties;
	
	@Mock
	private Contract contract;
	
	
	@Before
	public void setUp(){
		bonus = new Bonus();
		contractProperties = new ContractProperties();
	}
	
	@Test
	public void getBonus_should_be_return_bonus_object(){
		when(contract.getBonus()).thenReturn(bonus);
		assertThat("Contract doesnt return bonus object",contract.getBonus(), is(Bonus.class));
	}
	
	@Test
	public void getContractProperties_should_be_return_contractProperties_object(){
		when(contract.getContractProperties()).thenReturn(contractProperties);
		assertThat("Contract doesn't return contract properties object", contract.getContractProperties(), is(ContractProperties.class));
	}
	
	@Test
	public void getTypeContract_should_be_string(){
		when(contract.getTypeContract()).thenReturn(testBuilder.testString);
		assertThat("typeContract in contract is not string",contract.getTypeContract(),is(String.class));
	}
	
	@Test
	public void getStartTimeContract_should_be_string(){
		when(contract.getStartTimeContract()).thenReturn(testBuilder.testString);
		assertThat("StartTimeContract in contract is not string",contract.getStartTimeContract(),is(String.class));
	}
	
	@Test
	public void getEndTimeContract_should_be_string(){
		when(contract.getEndTimeContract()).thenReturn(testBuilder.testString);
		assertThat("EndTimeContract in contract is not string",contract.getEndTimeContract(),is(String.class));
	}
	
	@Test
	public void freeDay_should_be_string(){
		when(contract.getFreeDay()).thenReturn(testBuilder.testInteger);
		assertThat("FreeDay in contract is not integer",contract.getFreeDay(),is(Integer.class));
	}
	
	@Test
	public void getJobPosition_should_be_string(){
		when(contract.getJobPosition()).thenReturn(testBuilder.testString);
		assertThat("JobPosition in contract is not string",contract.getJobPosition(),is(String.class));
	}
	
	
}
