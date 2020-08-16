package _Time_Table_;

public class Room 
{
	private Room ROOM_ID;
	private Room ROOM_NAME;
	private int  ROOM_FLOOR;
	private int ROOM_CAPACITY;
	// ROOM_TYPE;
	
	
	public Room(Room ROOM_ID,Room ROOM_NAME,int  ROOM_FLOOR,int ROOM_CAPACITY) {
		this.ROOM_ID = ROOM_ID;
	    this.ROOM_NAME = ROOM_NAME; 
	    this.ROOM_FLOOR = ROOM_FLOOR;
	    this.ROOM_CAPACITY = ROOM_CAPACITY; 
	    
	}


	public Room getROOM_ID() {
		return ROOM_ID;
	}


	public void setROOM_ID(Room rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}


	public Room getROOM_NAME() {
		return ROOM_NAME;
	}


	public void setROOM_NAME(Room rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}


	public int getROOM_FLOOR() {
		return ROOM_FLOOR;
	}


	public void setROOM_FLOOR(int rOOM_FLOOR) {
		ROOM_FLOOR = rOOM_FLOOR;
	}


	public int getROOM_CAPACITY() {
		return ROOM_CAPACITY;
	}


	public void setROOM_CAPACITY(int rOOM_CAPACITY) {
		ROOM_CAPACITY = rOOM_CAPACITY;
	}


	public void setROOM_ID(int i) {
		// TODO Auto-generated method stub
		i=10;
	}
	
	
}
