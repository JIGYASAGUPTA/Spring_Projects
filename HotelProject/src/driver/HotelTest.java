package driver;
import model.Room;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import model.Hotel;
import model.Room;

public class HotelTest {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Hotel hotel = (Hotel)c.getBean("hotel");
		
		
		
		
		hotel.addReservation("jigyasa", 'n', "queen");
		hotel.addReservation("gupta", 'n', "king");
hotel.cancelReservation("Vaibhav4");
		
		hotel.findReservation("Vaibhav2");
		hotel.findReservation("Vaibhav4");
		
		System.out.println(hotel);


	}

}
