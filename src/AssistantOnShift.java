/**
Represents an AssistantOnShift
*/
public class AssistantOnShift{
  private String status;
  private String name;
  private String email;
  private String date;
  private String time;

  /**
  Creates an assistant on shift
  @param name The name of the assistant
  @param email The email of the assistant
  @param date The date on which the shift is
  @param status The status of the shift
  @param time The time on which the shift is
  */
  public AssistantOnShift(String name, String email, String date, String status, String time){
    this.status=status;
    this.name=name;
    this.email=email;
    this.date=date;
    this.time=time;
  }

  /**
  Gets details of assistant on shift
  @return A formatted string with the details of assistant on shift
  */
  public String toString(){
    return "| "+date+" "+time+" | "+status+" | "+email+" |" ;
  }

  /**
  Sets status of assistant on shift
  @param status The status of the assistant on shift
  */
  public void setStatus(String status){
    this.status=status;
  }

  /**
  Sets time of shift
  @param time The time of the shift
  */
  public void setTime(String time){
    this.time=time;
  }

  /**
  Gets status of the assistant on shift
  @return status of the assistant on shift
  */
  public String getStatus(){
    return status;
  }

  /**
  Gets email of the assistant on shift
  @return email of the assistant on shift
  */
  public String getEmail(){
    return email;
  }

  /**
  Gets name of the assistant on shift
  @return name of the assistant on shift
  */
  public String getName(){
    return name;
  }

  /**
  Gets time of the shift
  @return time of the shift
  */
  public String getTime(){
    return time;
  }

  /**
  Gets date of the shift
  @return date of the shift
  */
  public String getDate(){
    return date;
  }
}
