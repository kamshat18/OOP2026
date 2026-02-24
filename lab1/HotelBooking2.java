package lab1_5pt;

public class HotelBooking2 {
	public enum RoomType{
		SINGLE,
		DOUBLE,
		SUITE
	}
	public static final int max_Guests = 4;
	public final int bookingId;
	private String guestName;
	private RoomType roomType;
	private int nights;
	{
		System.out.println("New booking object is being craeted");
	}
	public HotelBooking2(int bookingId, String guestName,RoomType roomType,int nights) {
		this.bookingId = bookingId;       
        this.guestName = guestName;       
        this.roomType = roomType;
        this.nights = nights;
	}
	public double calculatePrice() {
		return calculatePrice(false);
	}
	public double calculatePrice(boolean breakfastIncluded) {
		double basePrice =0;
		switch(roomType) {
		case SINGLE:
			basePrice =50;
			break;
		case DOUBLE:
			basePrice = 60;
			break;
		case SUITE:
			basePrice = 80;
			break;
		}
		double total = basePrice * nights;
		if (breakfastIncluded) {
            total += 10 * nights;
        }
        return total;
	}
	public int getID() {
		 return bookingId;
	}
	public static void main(String[] args) {
		HotelBooking2 booking1 = new HotelBooking2(
                1,
                "Kamshat",
                HotelBooking2.RoomType.DOUBLE,
                5
        );
        HotelBooking2 booking2 = new HotelBooking2(
                2,
                "Safi",
                HotelBooking2.RoomType.SUITE,
                3
        );
        System.out.println("Booking 1(kamshat) price: " + booking1.calculatePrice());
        System.out.println("Booking 2(safi) price (with breakfast): "
                + booking2.calculatePrice(true));
        System.out.println("Booking 1(kamshat) ID: " + booking1.getID());
	}
}
