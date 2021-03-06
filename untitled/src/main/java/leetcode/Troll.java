package leetcode;

/**
 * Trolls are attacking your comment section!
 * <p>
 * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
 * <p>
 * Your task is to write a function that takes a string and return a new string with all vowels removed.
 * <p>
 * For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
 * <p>
 * Note: for this kata y isn't considered a vowel.
 */
public class Troll {

    public static String disemvowel(String s) {
        return s.replaceAll("[euioaEUIOA]", "");
    }
}
