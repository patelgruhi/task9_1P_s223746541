package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;

public class TestMathQuestionService {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Developer point of view tests
	@Test
	public void testAddBlanlkNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q1Addition("", "");
		}catch(Exception e) {
			assert true;
		}
	}	
	
	@Test
	public void testAddBlanlkNum1DoubleNum2() {
		double answer;
		try {
			answer = MathQuestionService.q1Addition("", "10");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testAddDoubleNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q1Addition("10", "");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testAddDoubleNum1DoubleNum2() {
		Assert.assertEquals(MathQuestionService.q1Addition("20", "10"), 30, 0);
	}
	
	@Test
	public void testSubBlanlkNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q2Subtraction("", "");
		}catch(Exception e) {
			assert true;
		}
	}	
	
	@Test
	public void testSubBlanlkNum1DoubleNum2() {
		double answer;
		try {
			answer = MathQuestionService.q2Subtraction("", "10");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testSubDoubleNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q2Subtraction("20", "");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testSubDoubleNum1DoubleNum2() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("20", "10"), 10, 0);
	}
	
	@Test
	public void testDivBlanlkNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q3Devision("", "");
		}catch(Exception e) {
			assert true;
		}
	}	
	
	@Test
	public void testDivBlanlkNum1DoubleNum2() {
		double answer;
		try {
			answer = MathQuestionService.q3Devision("", "10");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testDivDoubleNum1BlankNum2() {
		double answer;
		try {
			answer = MathQuestionService.q3Devision("20", "");
		}catch(Exception e) {
			assert true;
		}
	}
	
	@Test
	public void testDivDoubleNum1DoubleNum2() {
		Assert.assertEquals(MathQuestionService.q3Devision("20", "10"), 2, 0);
	}
	
	// Functional test
	
	
	// Q1
	@Test
	public void testQ1BlankNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q1");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ1BlankNum1DoubleNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q1");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("10");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ1DoubleNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q1");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ1DoubleNum1DoubleNum2WrongAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q1");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("20");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("50");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Wrong answer, try again.");
		driver.close();
	}
	
	@Test
	public void testQ1DoubleNum1DoubleNum2CorrectAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q1");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("20");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("30");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		String currentPage = "http://127.0.0.1:8080/q1";
		String nextPage = driver.getCurrentUrl();
		Assert.assertNotEquals(currentPage, nextPage);
		driver.close();
	}
	
	// Q2
	@Test
	public void testQ2BlankNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q2");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ2BlankNum1DoubleNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q2");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("10");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ2DoubleNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q2");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ2DoubleNum1DoubleNum2WrongAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q2");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("20");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("50");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Wrong answer, try again.");
		driver.close();
	}
	
	@Test
	public void testQ2DoubleNum1DoubleNum2CorrectAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q2");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("20");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("-10");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		String currentPage = "http://127.0.0.1:8080/q2";
		String nextPage = driver.getCurrentUrl();
		Assert.assertNotEquals(currentPage, nextPage);
		driver.close();
	}	
	
	// Q3
	@Test
	public void testQ3BlankNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q3");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ3BlankNum1DoubleNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q3");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("10");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ3DoubleNum1BlankNum2Functional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q3");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Please fill all fields");
		driver.close();
	}
	
	@Test
	public void testQ3DoubleNum1DoubleNum2WrongAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q3");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("10");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("20");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("50");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "Wrong answer, try again.");
		driver.close();
	}
	
	@Test
	public void testQ3DoubleNum1DoubleNum2CorrectAnswerFunctional() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8080/q3");
		sleep(2);
		
		WebElement num1 = driver.findElement(By.id("number1"));
		num1.sendKeys("20");
		WebElement num2 = driver.findElement(By.id("number2"));
		num2.sendKeys("10");
		WebElement result = driver.findElement(By.id("result"));
		result.sendKeys("2");
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		sleep(2);
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "You passes all tests.");
		driver.close();
	}
	
	// Complete Test
	@Test
	public void testCompleteTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gruhi\\Downloads\\chromedriver-win64 (4)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://127.0.0.1:8080/";
		driver.get(url);
		sleep(2);
		
		WebElement a = driver.findElement(By.tagName("a"));
		a.click();
		sleep(2);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ahsan");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("ahsan_pass");
		WebElement loginSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
		loginSubmit.click();
		sleep(2);
		
		WebElement num1Q1 = driver.findElement(By.id("number1"));
		num1Q1.sendKeys("10");
		WebElement num2Q1 = driver.findElement(By.id("number2"));
		num2Q1.sendKeys("20");
		WebElement resultQ1 = driver.findElement(By.id("result"));
		resultQ1.sendKeys("30");
		WebElement submitQ1 = driver.findElement(By.cssSelector("input[type='submit']"));
		submitQ1.click();
		sleep(2);
		
		WebElement num1Q2 = driver.findElement(By.id("number1"));
		num1Q2.sendKeys("10");
		WebElement num2Q2 = driver.findElement(By.id("number2"));
		num2Q2.sendKeys("20");
		WebElement resultQ2 = driver.findElement(By.id("result"));
		resultQ2.sendKeys("-10");
		WebElement submitQ2 = driver.findElement(By.cssSelector("input[type='submit']"));
		submitQ2.click();
		sleep(2);
		
		WebElement num1Q3 = driver.findElement(By.id("number1"));
		num1Q3.sendKeys("20");
		WebElement num2Q3 = driver.findElement(By.id("number2"));
		num2Q3.sendKeys("10");
		WebElement resultQ3 = driver.findElement(By.id("result"));
		resultQ3.sendKeys("2");
		WebElement submitQ3 = driver.findElement(By.cssSelector("input[type='submit']"));
		submitQ3.click();
		sleep(2);
		
		WebElement message = driver.findElement(By.tagName("div"));
		Assert.assertEquals(message.getText(), "You passes all tests.");
		driver.close();
	}
}
