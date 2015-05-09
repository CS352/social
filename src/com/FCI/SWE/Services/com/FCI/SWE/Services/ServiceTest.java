package com.FCI.SWE.Services;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServiceTest {
  
  @Test
  public void ShowService() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
     
  public void acceptService() {
    throw new RuntimeException("Test not implemented");
  }
   
   public String name; 
   static Service ser=new Service();
  @Test
  public void addService() {
	  
	Assert.assertEquals(true, ser.addService(name));
    throw new RuntimeException("addser");
  }
  ///////////////////////////////////////////////////////
  public String nm,pw;
  @Test
  @DataProvider(name="test1")
  public static Service loginService(){
	return new Service();
	  
  };
  @DataProvider(name="test1")
  public void loginService(boolean con ,String n ,String p) {
           Assert.assertEquals(true, ser.loginService(nm, pw));	  
	  throw new RuntimeException("Test not implemented");
  }
//////////////////////////////////////////
   public String uname , pass ,email;
  @Test
  public void registrationService() {
	  Assert.assertEquals(true, ser.registrationService(uname, email, pass));
    throw new RuntimeException("Test not implemented");
  }
  ////////////////////
   public String nnn;
  @Test 
  public void searchService() {
    Assert.assertEquals(true , ser.searchService(nnn));
	  throw new RuntimeException("Test not implemented");
  }
}
