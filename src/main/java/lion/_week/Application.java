package lion._week;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


		String str = "apple, banana, orange, grape";
		String[] strArr1 = str.split(",");
		String[] strArr2 = str.split(":");

		System.out.println("아직 연습용입니다. ㅠㅠ");


	}

}
