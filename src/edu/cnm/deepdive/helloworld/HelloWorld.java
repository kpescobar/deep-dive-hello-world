/**
 * 
 */
package edu.cnm.deepdive.helloworld;

/**
 * Class that displays the text "Hello World!".
 */
public class HelloWorld {

  /**
   * Prints "Hello World!" to standard output.
   *
   * @param args Command-line parameters (ignored).
   */
  public static void main(String[] args) {
    String target;
    if (args.length >0){
      target = args [0];
    } else {
      target = "World";
    }
    String message;
    message = String. format("Hello %s!", target);
    
    emitMessage(message);
  }

  private static void emitMessage(String message) {
    System.out.println(message);
  }
  

}
