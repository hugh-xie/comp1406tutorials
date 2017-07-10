public class length {

  public static void main(String[] args) {
    /* Option 1
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    */

    /* Option 2
    for (int i = (args.length - 1); i >= 0; i--) {
      int l = args[i].length();
      if ((l > 2) && (l < 9)) {
        System.out.println(args[i].toLowerCase());
      }
    }
    */
  }
}
