public class min_Years_Days{
  public static void main(String args[]){
      print(1440);
  }
  public static void print(long minutes){
    if(minutes < 0){
      System.out.println("Invalid value");
    }else{
    long years = minutes/525600;
    long days = (minutes/60/24) % 365;// (min to hours to a day) % year = remaining days in a year.
    
    System.out.println(years + "Y " + days + "D");
    }
  }
}