/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.deps.app;

import gradle.deps.list.LinkedList;

import static gradle.deps.utilities.StringUtils.join;
import static gradle.deps.utilities.StringUtils.split;
import static gradle.deps.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
