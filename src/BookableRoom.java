/**
Represents a BookableRoom
*/
public class BookableRoom{
  String code;
  int capacity;
  String time;
  String date;
  int occupancy;
  String status;

  /**
  Creates a bookable room
  @param code The code of the bookable room
  @param capacity The capacity of the bookable room
  @param date The date of the bookable room
  @param time The time of the bookable room
  @param status The status of the bookable room
  @param occupancy The occupancy of the bookable room
  */
  public BookableRoom(String code,int capacity, String date, String time, String status, int occupancy){
    this.code=code;
    this.capacity=capacity;
    this.time=time;
    this.date=date;
    this.status=status;
    this.occupancy=occupancy;
  }

  /**
  Gets details of the bookable room
  @return formatted string of bookable room's details
  */
  public String toString(){
    return "| "+date+" "+time+" | "+status+" | "+code+" | "+occupancy+" |";
  }

  /**
  Sets occupancy of the bookable room
  @param occupancy The occupancy of the bookable room
  */
  public void setOccupancy(int occupancy){
    this.occupancy=occupancy;
  }

  /**
  Sets status of the bookable room
  @param status The status of the bookable room
  */
  public void setStatus(String status){
    this.status=status;
  }

  /**
  Gets time of the bookable room
  @return time of the bookable room
  */
  public String getTime(){
    return time;
  }

  /**
  Gets date of the bookable room
  @return date of the bookable room
  */
  public String getDate(){
    return date;
  }

  /**
  Gets code of the bookable room
  @return code of the bookable room
  */
  public String getCode(){
    return code;
  }

  /**
  Gets occupancy of the bookable room
  @return occupancy of the bookable room
  */
  public int getOccupancy(){
    return occupancy;
  }

  /**
  Gets status of the bookable room
  @return status of the bookable room
  */
  public String getStatus(){
    return status;
  }

  /**
  Gets capacity of the bookable room
  @return capacity of the bookable room
  */
  public int getCapacity(){
    return capacity;
  }
}
