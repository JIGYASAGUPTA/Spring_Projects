package model;



public class Room {

	private int roomNumber;
	private String bedType;
	private double roomRate;
	private char smoking;
	private boolean occupied;
	private String occupantName;

	public Room() {
		
//		this.occupied=false;
//		occupantName="not occupied";

	}

	public Room(int roomNumber, String bedType, double roomRate, char smoking) {
		this.roomNumber = roomNumber;
		this.bedType = bedType;
		this.roomRate = roomRate;
		this.smoking = smoking;
		this.occupied = false;
		occupantName = "Not Occupied";
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

	public char getSmoking() {
		return smoking;
	}

	public void setSmoking(char smoking) {
		this.smoking = smoking;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public String getOccupantName() {
		return occupantName;
	}

	public void setOccupantName(String occupantName) {
		this.occupantName = occupantName;
	}

	@Override
	public String toString() {
		return "\nOccupant Name=" + getOccupantName() + "\nRoomNumber=" + getRoomNumber() + "\nBedType=" + getBedType()
				+ "\nRoom Rate=" + getRoomRate() + "\nSmoking=" + getSmoking() + "\n*********";

	}

}
