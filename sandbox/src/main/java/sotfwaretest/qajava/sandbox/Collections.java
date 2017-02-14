package sotfwaretest.qajava.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args){
  String[] langs = {"Java","C#","Python","PHP"};

  for (int i=0; i<langs.length; i++){
    System.out.println("Я хочу выучить " + langs[i]);
  }

  for (String l : langs){
      System.out.println("Я хочу выучить " + l);
    }

  List<String> languages = new ArrayList<String>();
  languages.add("Java");
  languages.add("C#");
  languages.add("Python");
  languages.add("PHP");

    for (String l : languages){
      System.out.println("Я хочу выучить " + l);
    }

   List<String> languages2 = Arrays.asList("Java","C#","Python","PHP");
    for (int i = 0; i<languages2.size(); i++){
      System.out.println("Я хочу выучить " + languages2.get(i));
    }

    List languages3 = Arrays.asList("Java","C#","Python","PHP");
    for (Object l : languages3){
      System.out.println("Я хочу выучить " + l);
    }

  }
}
