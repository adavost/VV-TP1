
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import system.PhonyList;

public class TestPhonyList {
	
	private PhonyList<Integer> m_list;

	@Before
	public void init(){
		m_list = new PhonyList<Integer>();
	}
	
	@After
	public void tearDown(){
		m_list = null;
	}
	
	@Test
	public void testAdd()
	{
		m_list.add(10);
		m_list.add(5);
		assertTrue("méthode add : l'élément a bien été ajouté",m_list.indexOf(10) != -1);
	}
	@Test
	public void testEquals(){
		
	}
}
