package Demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderDemo {

	@Test(dataProvider = "testData")
	public void method1(String Username, String Password) {

		System.out.println(Username);
		System.out.println(Password);

	}

	@DataProvider
	public Object[][] testData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "testuser1";
		data[0][1] = "secure123";
		data[1][0] = "testuser2";
		data[1][1] = "secure456";
		data[2][0] = "testuser3";
		data[2][1] = "secure567";

		data[3][0] = "testuser4";
		data[3][1] = "secure567";

		return data;
	}

}
