import java.util.Scanner;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;

/**
Booking System Application
An application for a covid test booking system.
@author Tanish Mehta
@version 1.1
*/
public class BookingApp{

  // Creation of ArrayLists
  private ArrayList<Room> roomsList=new ArrayList<Room>();
  private ArrayList<BookableRoom> bookableRoomsList=new ArrayList<BookableRoom>();
  private ArrayList<Assistant> assistantsList=new ArrayList<Assistant>();
  private ArrayList<AssistantOnShift> assistantsOnShiftList=new ArrayList<AssistantOnShift>();
  private ArrayList<Booking> bookingsList=new ArrayList<Booking>();

  /**
  Creates BookingApp object
  @param args
  */
  public static void main(String[] args){
    BookingApp bookingApp=new BookingApp();

    // Calls method that loads intitial data
    bookingApp.loadInitialData();

    // Calls method that displays the main menu
    bookingApp.mainMenu();
  }

  /**
  Shows main menu
  */
  public void mainMenu(){

    Scanner sc=new Scanner(System.in);
    boolean correctInput=false;
    String selection;

    do{
      System.out.println("University of Knowledge - COVID test\n\nManage Bookings\n\nPlease, enter the number to select your option:\n\nTo manage Bookable Rooms:");
      System.out.println("\t1. List\n\t2. Add\n\t3. Remove\nTo manage Assistants on Shift:\n\t4. List\n\t5. Add\n\t6.Remove\nTo manage Bookings:\n\t7. List\n\t8. Add\n\t9. Remove\n\t10. Conclude");
      System.out.println("After selecting one the options above, you will be presented other screens.\nIf you press 0, you will be able to return to this main menu.");
      System.out.println("Press -1 (or ctrl+c) to quit this application.\n");

      selection=sc.nextLine();

      if(selection.equals("1")){
        clearTerminal();
        listBookableRooms();
      }
      else if(selection.equals("2")){
        clearTerminal();
        addBookableRooms();
      }
      else if(selection.equals("3")){
        clearTerminal();
        removeBookableRooms();
      }
      else if(selection.equals("4")){
        clearTerminal();
        listAssistantsOnShift();
      }
      else if(selection.equals("5")){
        clearTerminal();
        addAssistantsOnShift();
      }
      else if(selection.equals("6")){
        clearTerminal();
        removeAssistantsOnShift();
      }
      else if(selection.equals("7")){
        clearTerminal();
        listBookings();
      }
      else if(selection.equals("8")){
        clearTerminal();
        addBookings();
      }
      else if(selection.equals("9")){
        clearTerminal();
        removeBookings();
      }
      else if(selection.equals("10")){
        clearTerminal();
        concludeBookings();
      }
      else if(selection.equals("-1")){
        System.out.println("You have selected to terminate this application");
        System.exit(0);
      }
      else{
        clearTerminal();
        System.out.println("Error: "+selection+" is not a valid input. Please enter a valid number from 1 to 10, or -1");
        correctInput=false;
      }
    } while(correctInput==false);
  }

  /**
  Loads intial data
  */
  public void loadInitialData(){
    // creating rooms and adding them to an ArrayList
    Room room1=new Room("r1",2);
    Room room2=new Room("r2",1);
    Room room3=new Room("r3",1);
    roomsList.add(room1);
    roomsList.add(room2);
    roomsList.add(room3);

    // creating assistants and adding them to an ArrayList
    Assistant assistant1=new Assistant("alex","nurseAlex@uok.ac.uk");
    Assistant assistant2=new Assistant("bob","nurseBob@uok.ac.uk");
    Assistant assistant3=new Assistant("chris","nurseChris@uok.ac.uk");
    assistantsList.add(assistant1);
    assistantsList.add(assistant2);
    assistantsList.add(assistant3);

    // creating bookable rooms and adding them to an ArrayList
    BookableRoom bookableRoom1=new BookableRoom(room1.getCode(), room1.getCapacity(), "12/03/2021", "07:00", "empty", 0);
    BookableRoom bookableRoom2=new BookableRoom(room1.getCode(), room1.getCapacity(), "12/03/2021", "08:00", "empty", 0);
    BookableRoom bookableRoom3=new BookableRoom(room1.getCode(), room1.getCapacity(), "12/03/2021", "09:00", "empty", 0);
    BookableRoom bookableRoom4=new BookableRoom(room2.getCode(), room2.getCapacity(), "12/03/2021", "07:00", "empty", 0);
    BookableRoom bookableRoom5=new BookableRoom(room2.getCode(), room2.getCapacity(), "12/03/2021", "08:00", "empty", 0);
    BookableRoom bookableRoom6=new BookableRoom(room2.getCode(), room2.getCapacity(), "12/03/2021", "09:00", "empty", 0);
    BookableRoom bookableRoom7=new BookableRoom(room3.getCode(), room3.getCapacity(), "12/03/2021", "07:00", "empty", 0);
    BookableRoom bookableRoom8=new BookableRoom(room3.getCode(), room3.getCapacity(), "12/03/2021", "08:00", "empty", 0);
    BookableRoom bookableRoom9=new BookableRoom(room3.getCode(), room3.getCapacity(), "12/03/2021", "09:00", "empty", 0);
    bookableRoomsList.add(bookableRoom1);
    bookableRoomsList.add(bookableRoom2);
    bookableRoomsList.add(bookableRoom3);
    bookableRoomsList.add(bookableRoom4);
    bookableRoomsList.add(bookableRoom5);
    bookableRoomsList.add(bookableRoom6);
    bookableRoomsList.add(bookableRoom7);
    bookableRoomsList.add(bookableRoom8);
    bookableRoomsList.add(bookableRoom9);

    // creating assistants on shift and adding them to an ArrayList
    AssistantOnShift assistantOnShift1=new AssistantOnShift(assistant1.getName(), assistant1.getEmail(), "12/03/2021", "free", "07:00");
    AssistantOnShift assistantOnShift2=new AssistantOnShift(assistant1.getName(), assistant1.getEmail(), "12/03/2021", "free", "08:00");
    AssistantOnShift assistantOnShift3=new AssistantOnShift(assistant1.getName(), assistant1.getEmail(), "12/03/2021", "free", "09:00");
    AssistantOnShift assistantOnShift4=new AssistantOnShift(assistant2.getName(), assistant2.getEmail(), "12/03/2021", "free", "07:00");
    AssistantOnShift assistantOnShift5=new AssistantOnShift(assistant2.getName(), assistant2.getEmail(), "12/03/2021", "free", "08:00");
    AssistantOnShift assistantOnShift6=new AssistantOnShift(assistant2.getName(), assistant2.getEmail(), "12/03/2021", "free", "09:00");
    assistantsOnShiftList.add(assistantOnShift1);
    assistantsOnShiftList.add(assistantOnShift2);
    assistantsOnShiftList.add(assistantOnShift3);
    assistantsOnShiftList.add(assistantOnShift4);
    assistantsOnShiftList.add(assistantOnShift5);
    assistantsOnShiftList.add(assistantOnShift6);

    // creating bookings and adding them to an ArrayList
    Booking booking1=new Booking("completed", bookableRoom1.getDate(), bookableRoom1.getTime(), assistantOnShift1, bookableRoom1, "alves@uok.ac.uk");
    Booking booking2=new Booking("scheduled", bookableRoom4.getDate(), bookableRoom5.getTime(), assistantOnShift2, bookableRoom4, "firmino@uok.ac.uk");
    Booking booking3=new Booking("scheduled", bookableRoom7.getDate(), bookableRoom9.getTime(), assistantOnShift3, bookableRoom7, "charlotte@uok.ac.uk");
    bookingsList.add(booking1);
    bookingsList.add(booking2);
    bookingsList.add(booking3);
  }

  /**
  Lists bookable rooms
  */
  public void listBookableRooms(){
    System.out.println("University of Knowledge - COVID test\n");

    // Loop that iterates through the list of bookable rooms
    for(BookableRoom a:bookableRoomsList){
      System.out.println(a);
    }
    System.out.println("0. Back to main menu.\n-1. Quit application.\n");
    secondInput();
  }

  /**
  Adds bookable rooms
  */
  public void addBookableRooms(){
    int id=10;
    boolean correctInput=false;
    System.out.println("University of Knowledge - COVID test\n\nAdding bookable room\n");
    for(Room a:roomsList){
      System.out.println(++id+". "+a);
    }

    Scanner sc= new Scanner(System.in);
    String input;
    String[] inputs;
    int seqId;
    String date;
    String time;
    String roomCode;
    Room holder;
    boolean addValue=false;

    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),separated by a white space.");
      System.out.println("0. Back to main menu.\n-1.Quit application.\n");
      input=sc.nextLine();
      clearTerminal();
      if(input.equals("0")){
        correctInput=true;
        clearTerminal();
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        // check whether input is correct, if so a bookable room is added
        inputs = input.split("\\s+");
        if(inputs.length!=3){
        System.out.println("Error!\nInput is in incorrect format. 3 fields seperated by a space is the correct format");
        continue;
        }
        else{
          try{
          seqId=Integer.parseInt(inputs[0]);
          }
          catch(Exception e){
            System.out.println("Error!\nThe input is incorrect. Sequential ID is a number");
            continue;
          }
          try{
            date=inputs[1];
          }
          catch(Exception e){
            System.out.println("Error!\nThe input is incorrect. Date cannot be found");
            continue;
          }
          try{
            time=inputs[2];;
          }
          catch(Exception e){
            System.out.println("Error!\nThe input is incorrect. Time cannot be found");
            continue;
          }
          if((seqId>=id) || (seqId<10)){
            System.out.println("Error!\nSequential id is incorrect");
            continue;
          }
          else{
            holder=roomsList.get((seqId-11));
            if(date.length()!=10){
              System.out.println("Error!\nDate format is incorrect");
              continue;
            }
            else if(time.length()!=5){
              System.out.println("Error!\nTime format is incorrect");
              continue;
            }
            else if((!time.equals("07:00")) && (!time.equals("08:00")) && (!time.equals("07:00"))){
              System.out.println("Error!\nTime has to be 07:00 or 08:00 or 09:00");
              continue;
            }
            else{
              for(BookableRoom a: bookableRoomsList){
                if(holder.getCode().equals(a.getCode()) && a.getDate().equals(date) && a.getTime().equals(time)){
                  System.out.println("Error!\nThe time and date for the bookable room entered have already been created");
                  continue;
                }
                else{
                  addValue=true;
                }
              }
              if(addValue==true){
                bookableRoomsList.add(new BookableRoom(holder.getCode(), holder.getCapacity(), date, time, "empty", 0));
                System.out.println("Bookable Room added successfully:");
                System.out.println(bookableRoomsList.get(bookableRoomsList.size() - 1));
              }
            }
          }
        }
      }
    } while(correctInput==false);
  }

  /**
  Removes bookable rooms
  */
  public void removeBookableRooms(){
    int id=10;
    ArrayList<BookableRoom> indexes=new ArrayList<BookableRoom>();
    System.out.println("University of Knowledge - COVID test\n");

    // List empty boobkable rooms
    for(BookableRoom a:bookableRoomsList){
      if(a.getStatus().equals("empty")){
        System.out.println(++id+". "+a);
        indexes.add(a);
      }
    }

    System.out.println("Removing bookable room\n");
    Scanner sc= new Scanner(System.in);
    String input;
    int selection;
    boolean correctInput=false;

    // process input
    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID to select the bookable room to be removed.\n0. Back to main menu.\n-1. Quit application.\n");
      input=sc.nextLine();
      if(input.equals("0")){
        correctInput=true;
        clearTerminal();
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        try{
          selection=Integer.parseInt(input);
        }
        catch(Exception e){
          System.out.println("Error!\nPlease enter a number");
          continue;
        }
        if(selection>=id || selection<10){
          System.out.println("Error!\nSequential id is incorrect");
          continue;
        }
        else{
          System.out.println(bookableRoomsList.get(bookableRoomsList.indexOf(indexes.get(selection-11))));
          bookableRoomsList.remove(bookableRoomsList.indexOf(indexes.get(selection-11)));
          System.out.println("Bookable Room removed successfully:");
        }
      }
    } while(correctInput==false);
  }

  /**
  Lists assistants on shift
  */
  public void listAssistantsOnShift(){
    System.out.println("University of Knowledge - COVID test\n");

    // Loop that iterates through the list of assistants on shift
    for(AssistantOnShift a:assistantsOnShiftList){
      System.out.println(a);
    }
    System.out.println("0. Back to main menu.\n-1. Quit application.\n");
    secondInput();
  }

  /**
   Adds assistants on shift
  */
  public void addAssistantsOnShift(){
    int id=10;
    boolean correctInput=false;

    // List assistants on shift
    System.out.println("University of Knowledge - COVID test\n\nAdding assistant on shift\n");
    for(Assistant a:assistantsList){
      System.out.println(++id+". "+a);
    }

    Scanner sc= new Scanner(System.in);
    String input;
    int seqId;
    String date;
    String assistantName;
    String[] inputs;
    Assistant holder;
    boolean addValue=false;

    // process input
    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.\n0. Back to main menu.\n-1.Quit application.\n");
      input=sc.nextLine();
      clearTerminal();
      if(input.equals("0")){
        correctInput=true;
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        inputs = input.split("\\s+");
        if(inputs.length!=2){
        System.out.println("Error!\nInput is in incorrect format. 3 fields seperated by a space is the correct format");
        continue;
        }
        else{
          try{
          seqId=Integer.parseInt(inputs[0]);
          }
          catch(Exception e){
            System.out.println("Error!\nThe input is incorrect. Sequential ID is a number");
            continue;
          }
          try{
            date=inputs[1];
          }
          catch(Exception e){
            System.out.println("Error!\nThe input is incorrect. Date cannot be found");
            continue;
          }
          if((seqId>=id) || (seqId<10)){
            System.out.println("Error!\nSequential id is incorrect");
            continue;
          }
          else{
            holder=assistantsList.get((seqId-11));
            if(date.length()!=10){
              System.out.println("Error!\nDate format is incorrect");
              continue;
            }
            else{
              for(AssistantOnShift a: assistantsOnShiftList){
                if(holder.getName().equals(a.getName()) && a.getDate().equals(date)) {
                  System.out.println("Error!\nThis assistant is already registered for a shift on this day.");
                  break;
                }
                else{
                  addValue=true;
                }
              }
              if(addValue==true){
                assistantsOnShiftList.add(new AssistantOnShift(holder.getName(), holder.getEmail(), date, "free", "07:00"));
                assistantsOnShiftList.add(new AssistantOnShift(holder.getName(), holder.getEmail(), date, "free", "08:00"));
                assistantsOnShiftList.add(new AssistantOnShift(holder.getName(), holder.getEmail(), date, "free", "09:00"));
                System.out.println("Assistant on Shift added successfully:");
                System.out.println(assistantsOnShiftList.get(assistantsOnShiftList.size() - 3));
                System.out.println(assistantsOnShiftList.get(assistantsOnShiftList.size() - 2));
                System.out.println(assistantsOnShiftList.get(assistantsOnShiftList.size() - 1));
              }
            }
          }
        }
      }
    } while(correctInput==false);
  }

  /**
  Removes assistants on shift
  */
  public void removeAssistantsOnShift(){
    int id=10;
    ArrayList<AssistantOnShift> indexes=new ArrayList<AssistantOnShift>();
    System.out.println("University of Knowledge - COVID test\n");

    // List free assistants on shift
    for(AssistantOnShift a:assistantsOnShiftList){
      if(a.getStatus().equals("free")){
        System.out.println(++id+". "+a);
        indexes.add(a);
      }
    }

    System.out.println("Removing assistant on shift\n");
    Scanner sc= new Scanner(System.in);
    Room holder;
    int place;
    String input;
    int seqId;
    boolean correctInput=false;

    // process input
    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID to select the assistant on shift to be removed.\n0. Back to main menu.\n-1. Quit application.\n");
      input=sc.nextLine();
      clearTerminal();
      if(input.equals("0")){
        correctInput=true;
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        try{
        seqId=Integer.parseInt(input);
        }
        catch(Exception e){
          System.out.println("Error!\nThe input is incorrect. Sequential ID is a number.");
          continue;
        }
        if(seqId>=id || seqId<10){
          System.out.println("Error!\nSequential id is incorrect");
          continue;
        }
        else{
          System.out.println(assistantsOnShiftList.get(assistantsOnShiftList.indexOf(indexes.get(seqId-11))));
          assistantsOnShiftList.remove(assistantsOnShiftList.indexOf(indexes.get(seqId-11)));
          System.out.println("Assistant on Shift removed successfully:");
        }
      }
    } while(correctInput==false);
  }

  /**
  Lists bookings
  */
  public void listBookings(){
    Scanner sc= new Scanner(System.in);
    System.out.println("University of Knowledge - COVID test\n");
    System.out.println("Select which booking to list:\n1. All\n2. Only bookings status:SCHEDULED\n3. Only bookings status:COMPLETED\n0. Back to main menu.\n-1. Quit application.\n");
    String input;
    input=sc.nextLine();

    // process input and list bookings based on entered criteria
    if(input.equals("1")){
      System.out.println("Booking status: no status selected");
      for(Booking a: bookingsList){
          System.out.println(a);
        }
        System.out.println("0. Back to main menu.\n-1. Quit application.\n");
        secondInput();
      }
    else if(input.equals("2")){
      System.out.println("Booking status: scheduled");
      for(Booking a: bookingsList){
        if(a.getStatus().equals("scheduled")){
          System.out.println(a);
        }
      }
      System.out.println("0. Back to main menu.\n-1. Quit application.\n");
      secondInput();
    }
    else if(input.equals("3")){
      System.out.println("Booking status: completed");
      for(Booking a: bookingsList){
        if(a.getStatus().equals("completed")){
          System.out.println(a);
        }
      }
      System.out.println("0. Back to main menu.\n-1. Quit application.\n");
      secondInput();
    }
    else if(input.equals("0")){
      clearTerminal();
      mainMenu();
    }
    else if(input.equals("-1")){
      System.out.println("You have selected to terminate this application");
      System.exit(0);
    }
    else{
      for(Booking a: bookingsList){
          System.out.println(a);
        }
        System.out.println("0. Back to main menu.\n-1. Quit application.\n");
        secondInput();
    }
  }

  /**
  Adds bookings
  */
  public void addBookings(){
    ArrayList<BookableRoom> bookableRoomsForBookings=new ArrayList<BookableRoom>();
    ArrayList<AssistantOnShift> assistantsOnShiftForBookings=new ArrayList<AssistantOnShift>();

    String[] inputs;
    String input;

    boolean addBooking=false;
    boolean correctInput=false;
    boolean matchFound=false;

    String studentEmail;
    int seqId;

    Scanner sc= new Scanner(System.in);

    System.out.println("University of Knowledge - COVID test\n");
    System.out.println("Adding booking (appointment for a COVID test) to the system\n");

    int id;

    do{
      id=10;

      // List available time slots
      System.out.println("List of available time-slots:");
      for(BookableRoom a:bookableRoomsList){
        for(AssistantOnShift b: assistantsOnShiftList){
          if(a.getStatus().equals("empty") && b.getStatus().equals("free")){
            if(a.getDate().equals(b.getDate()) && a.getTime().equals(b.getTime())){
              System.out.println(++id+". "+a.getDate()+" "+a.getTime());
              bookableRoomsForBookings.add(a);
              assistantsOnShiftForBookings.add(b);
              matchFound=true;
              break;
            }
          }
          if(matchFound==true){
            matchFound=false;
            continue;
          }
        }
      }

      System.out.println("\nPlease, enter one of the following:\n");
      System.out.println("The sequential ID of an available time-slot and the student email, separated by a white space.");
      System.out.println("0. Back to main menu.\n-1. Quit application.\n");
      input=sc.nextLine();
      clearTerminal();

      //process input
      if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        System.exit(0);
      }
      else if(input.equals("0")){
        mainMenu();
      }
      else{
        inputs=input.split("\\s+");
        if(inputs.length!=2){
          System.out.println("Error!\nInput is not in correct format. Input has to be two fields seperated by a white space");
        }
        else{
          try{
            seqId=Integer.parseInt(inputs[0]);
          }
          catch(Exception e){
            System.out.println("Error!\nSequential id has to be a number");
            continue;
          }
          studentEmail=inputs[1];
          if(studentEmail.substring(studentEmail.lastIndexOf("@"),studentEmail.length()).equals("@uok.ac.uk")){
            if(seqId<=id || seqId>=11){
                bookingsList.add(new Booking("scheduled", bookableRoomsForBookings.get(seqId-11).getDate(), bookableRoomsForBookings.get(seqId-11).getTime(), assistantsOnShiftForBookings.get(seqId-11), bookableRoomsForBookings.get(seqId-11), studentEmail));
                System.out.println("Booking added successfully:");
                System.out.println(bookingsList.get(bookingsList.size()-1)+"\n");
            }
          }
        }
      }
    }while(correctInput==false);
  }

  /**
  Removes bookings
  */
  public void removeBookings(){
    int id=10;
    ArrayList<Booking> indexes=new ArrayList<Booking>();
    System.out.println("University of Knowledge - COVID test\n");

    // List scheduled bookings
    for(Booking a:bookingsList){
      if(a.getStatus().equals("scheduled")){
        System.out.println(++id+". "+a);
        indexes.add(a);
      }
    }
    System.out.println("Removing booking from the system\n");
    Scanner sc= new Scanner(System.in);
    int place;
    String input;
    int seqId;
    boolean correctInput=false;

    // process input
    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID to select the booking to be removed from the listed bookings above.\n0. Back to main menu.\n-1. Quit application.\n");
      input=sc.nextLine();
      clearTerminal();
      if(input.equals("0")){
        correctInput=true;
        clearTerminal();
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        try{
          seqId=Integer.parseInt(input);
        }
        catch(Exception e){
          System.out.println("Error!\nSequential id has to be a number");
          continue;
        }
        if(seqId>=id || seqId<10){
          System.out.println("Error!\nSequential id is incorrect");
          continue;
        }
        else{
          System.out.println(bookingsList.get(bookingsList.indexOf(indexes.get(seqId-11))));
          bookingsList.remove(bookingsList.indexOf(indexes.get(seqId-11)));
          System.out.println("Booking removed successfully:");
        }
      }
    } while(correctInput==false);
  }

  /**
  Concludes bookings
  */
  public void concludeBookings(){
    int id=10;
    Scanner sc= new Scanner(System.in);
    String input;
    int seqId;
    boolean correctInput=false;
    ArrayList<Booking> indexes=new ArrayList<Booking>();
    System.out.println("University of Knowledge - COVID test\n");

    // List scheduled bookings
    for(Booking a:bookingsList){
      if(a.getStatus().equals("scheduled")){
        System.out.println(++id+". "+a);
        indexes.add(a);
      }
    }
    System.out.println("\nConclude booking\n");

    // process input
    do{
      System.out.println("Please, enter one of the following:\n\nThe sequential ID to select the booking to be completed.\n0. Back to main menu.\n-1. Quit application.\n");
      input=sc.nextLine();
      clearTerminal();
      if(input.equals("0")){
        correctInput=true;
        clearTerminal();
        mainMenu();
      }
      else if(input.equals("-1")){
        System.out.println("You have selected to terminate this application");
        correctInput=true;
        System.exit(0);
      }
      else{
        try{
          seqId=Integer.parseInt(input);
        }
        catch(Exception e){
          System.out.println("Error!\nSequential id has to be a number");
          continue;
        }
        if(seqId>=id || seqId<10){
          System.out.println("Error!\nSequential id is incorrect");
          continue;
        }
        else{
          bookingsList.get((bookingsList.indexOf(indexes.get(seqId-11)))).setStatus("completed");
          System.out.println(bookingsList.get(bookingsList.indexOf(indexes.get(seqId-11))));
          System.out.println("Booking completed successfully:");
        }
      }
    } while(correctInput==false);

  }

  /**
  For input processing that takes place multiple times
  */
  public void secondInput(){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    if(a.equals("0")){
      mainMenu();
    }
    else if(a.equals("-1")){
      System.out.println("You have selected to terminate this application");
      System.exit(0);
    }
    else{
      System.out.println("The input is incorrect.\n0. Back to main menu.\n-1.Quit application.\n");
      secondInput();
    }
  }

  /**
  Clears console
  */
  public static void clearTerminal() {
      try {
          if (System.getProperty("os.name").contains("Windows")) {
              new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
          }
          else {
              System.out.print("\033\143");
          }
      } catch (IOException | InterruptedException ex) {}
  }
}
