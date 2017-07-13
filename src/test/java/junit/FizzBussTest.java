package junit;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;

public class FizzBussTest {

		@Test
		public void shouldSay() {
			//arrange
			FizzBuzz underTest = new FizzBuzz();
			
			String response = underTest.say(2);
			//act
//			String response = underTest.say(1);
			assertThat(response, is("1"));
			//assert
			assertThat("Should have responded 1", response, is("1"));
			
		}
}
