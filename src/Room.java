/**
Represents a Room
*/
public class Room{
  private String code;
  private int capacity;

  /**
  Creates a room
  @param code The code of the bookable room
  @param capacity The capacity of the bookable room
  */
  public Room(String code, int capacity){
    this.code=code;
    this.capacity=capacity;
  }

  /**
  Gets details of the room
  @return formatted string of room's details
  */
  public String toString(){
    return "| "+code+" | "+capacity+" |";
  }

  /**
  Gets code of the room
  @return code of the room
  */
  public String getCode(){
    return code;
  }

  /**
  Gets capacity of the room
  @return capacity of the room
  */
  public int getCapacity(){
    return capacity;
  }
}
