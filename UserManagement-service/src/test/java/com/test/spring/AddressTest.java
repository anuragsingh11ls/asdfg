package com.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.anu.usermanagement.bean.AddressBean;
import com.anu.usermanagement.service.AddressService;

@ContextConfiguration(locations = {"classpath:master-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AddressTest {
	@Autowired
	AddressService addressService;
	
	
	@Test
    public void testAddress() {
		AddressBean addressBean=new AddressBean();
		addressBean.setFirstName("anurag");
		addressBean.setLastName("singh");
		addressBean.setUserName("anuragsingh");
		addressBean.setPassword("singh");
		addressService.saveAddress(addressBean);
		
       // assertTrue("Phone log is not readable.");
    }

}
