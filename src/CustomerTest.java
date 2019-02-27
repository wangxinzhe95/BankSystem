import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		Customer customer = new Customer("wangxinzhe", "huaibei", "1999-01-29");
		assertEquals(17,customer.getAge());
		assertEquals("wangxinzhe", customer.getName());
		assertEquals("huaibei", customer.getAddress());
	}

}
