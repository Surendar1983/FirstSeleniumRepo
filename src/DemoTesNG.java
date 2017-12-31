

import org.testng.annotations.Test;

public class DemoTesNG {
	
  @Test
  public void main() {
	  WrapperClass wc = new WrapperClass();
		wc.LoadDriver();
		wc.registration();
		System.out.println("this is test change to learn git");
  }
}
