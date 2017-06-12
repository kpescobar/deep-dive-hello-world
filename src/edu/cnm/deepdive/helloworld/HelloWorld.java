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
    emitMessage("Hello World!");
  }

  private static void emitMessage(String message) {
    System.out.println(message);
  }

}
