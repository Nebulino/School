public class Elimina{
  public static String eliminaSpazi(String s1){
    for(int i = 0; s1.charAt(i) == ' ' && i < s1.length(); i++){}
    return(s1.substring(i, s1.lenght() - 1 ));
  }
}
