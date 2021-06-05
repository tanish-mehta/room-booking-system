import java.util.ArrayList;
/**
Represents an Assistant
*/
public class Assistant{
    private String name;
    private String email;

    /**
    Creates assistant
    @param name The name of the assistant
    @param email The email of the assistant
    */
    public Assistant(String name, String email){
      this.name=name;
      this.email=email;
    }

    /**
    Gets details of assistant
    @return formatted string of assistant's details
    */
    public String toString(){
      return "| "+name+" | "+email+" |";
    }

    /**
    Gets name of the assistant
    @return name of the assistant
    */
    public String getName(){
      return name;
    }

    /**
    Gets email of the assistant
    @return email of the assistant
    */
    public String getEmail(){
      return email;
    }

}
