package edu.cnm.deepdive.intro;

/**
 * This is a Javadoc comment. This class demonstrates iteration over command line arguments.
 *
 * @author itajan
 */
public class CommandLineArgs {

  public static final String ARGUMENT_FORMAT = "Argument %d = %s%n";

  /**
   * Iterates through the arguments <code>args</code>, printing each one.
   * <p>
   * You can enter html code to allow you to create a lot of preemptive formatting.</p>
   *
   * @param args  command line arguments
   */
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) { //The term "argument" used here could be anything. Basic for-loop = (int i=0; i < args.length; i++)
      String argument = args[i];
      System.out.printf(ARGUMENT_FORMAT, i, argument); //you could use "println" and it would have the text on its own line.
    }
  }

}
