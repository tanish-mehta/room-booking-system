/**
Represents a Booking
*/
public class Booking{
  private String time;
  private String date;
  private BookableRoom bookableRoom;
  private AssistantOnShift assistantOnShift;
  private String status;
  private String studentEmail;

  /**
  Creates a booking with specific parameters
  @param status The status of the booking
  @param date The date of the booking
  @param time The time at which the booking is
  @param assistantOnShift The assistant on shift for the test
  @param bookableRoom The bookable room where the test will take place
  @param studentEmail The email id if the student who will be tested
  */
  public Booking(String status, String date, String time, AssistantOnShift assistantOnShift, BookableRoom bookableRoom, String studentEmail){
    this.status=status;
    this.date=date;
    this.time=time;
    this.assistantOnShift=assistantOnShift;
    this.bookableRoom=bookableRoom;
    this.studentEmail=studentEmail;

    int occ=bookableRoom.getOccupancy();
    bookableRoom.setOccupancy(++occ);
    if(bookableRoom.getOccupancy()<bookableRoom.getCapacity()){
      bookableRoom.setStatus("available");
    }
    else if(bookableRoom.getOccupancy()==bookableRoom.getCapacity()){
      bookableRoom.setStatus("full");
    }
    assistantOnShift.setStatus("busy");
  }

  /**
  Gets details of bookings
  @return A formatted string with the details of the booking
  */
  public String toString(){
    return "| "+date+" "+time+" | "+status+" | "+assistantOnShift.getEmail()+" | "+bookableRoom.getCode()+" | "+studentEmail+" |";
  }

  /**
  Gets status of the booking
  @return status of the booking
  */
  public String getStatus(){
    return status;
  }

  /**
  Gets room of the booking
  @return room of the booking
  */
  public BookableRoom getBookableRoom(){
    return bookableRoom;
  }

  /**
  Gets assistant on shift for the booking
  @return assistant on shift for the booking
  */
  public AssistantOnShift getAssistantOnShift(){
    return assistantOnShift;
  }

  /**
  Sets status of booking
  @param status The status of the booking
  */
  public void setStatus(String status){
    this.status=status;
  }


}
