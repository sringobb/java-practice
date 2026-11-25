import java.util.ArrayList;

public class Ex1ArrayList {
  public static void main(String[] args) {
    ArrayList<String> events = new ArrayList<String>();
    events.add("GSX");
    events.add("Cisco Live");
    events.add("Partner Summit");
    events.add("GSX"); // duplicate allowed
    for (String e : events) {
        System.out.println(e);
    }
    System.out.println("First event:" + events.get(0));
  }
}