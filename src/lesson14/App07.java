package lesson14;

import java.util.*;

public class App07 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String str = "From Wikipedia, the free encyclopedia" + "Jump to navigation" + "Jump to search" + "This article is about the type of website. For other uses, see Wiki (disambiguation)." + "\"Wikitext\" redirects here. For the Wikipedia help page, see Help:Wikitext." + "Wikitext" + "" + "    Cheatsheet" + "    All Wikitext" + "    Magic links" + "    Visual files" + "    Sound files" + "    Tables" + "    Using templates" + "    Using HTML codes within Wikitext" + "" + "    vte" + "" + "File:Ward Cunningham, Inventor of the Wiki.webmPlay media" + "Interview with Ward Cunningham, inventor of the wiki" + "" + "A wiki (/ˈwɪki/ (About this soundlisten) WIK-ee) is a hypertext publication collaboratively edited and managed by its own audience directly using a web browser. A typical wiki contains multiple pages for the subjects or scope of the project and could be either open to the public or limited to use within an organization for maintaining its internal knowledge base." + "" + "Wikis are enabled by wiki software, otherwise known as wiki engines. A wiki engine, being a form of a content management system, differs from other web-based systems such as blog software, in that the content is created without any defined owner or leader, and wikis have little inherent structure, allowing structure to emerge according to the needs of the users.[1] Wiki engines usually allow content to be written using a simplified markup language and sometimes edited with the help of a rich-text editor.[2] There are dozens of different wiki engines in use, both standalone and part of other software, such as bug tracking systems. Some wiki engines are open source, whereas others are proprietary. Some permit control over different functions (levels of access); for example, editing rights may permit changing, adding, or removing material. Others may permit access without enforcing access control. Other rules may be imposed to organize content." + "" + "The online encyclopedia project Wikipedia is the most popular wiki-based website, and is one of the most widely viewed sites in the world, having been ranked in the top twenty since 2007.[3] Wikipedia is not a single wiki but rather a collection of hundreds of wikis, with each one pertaining to a specific language. In addition to Wikipedia, there are hundreds of thousands of other wikis in use, both public and private, including wikis functioning as knowledge management resources, notetaking tools, community websites, and intranets. The English-language Wikipedia has the largest collection of articles: as of February 2020, it has over 6 million articles. Ward Cunningham, the developer of the first wiki software, WikiWikiWeb, originally described wiki as \"the simplest online database that could possibly work.\"[4] \"Wiki\" (pronounced [wiki][note 1]) is a Hawaiian word meaning \"quick.\"[5][6][7] ";

        String[] split = str.split("\\W+");

        for (String word : split) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, ++count);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
        Map<String, Integer> sortedByValue = sortByValue(map);
        System.out.println(sortedByValue);
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> listEntries = new ArrayList<>(map.entrySet());
        listEntries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Integer> result = new LinkedHashMap<>();
        for (int i = 0, listEntriesSize = listEntries.size(); i < listEntriesSize; i++) {
            Map.Entry<String, Integer> entry = listEntries.get(i);
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
