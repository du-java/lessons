package lesson17;

import java.util.Comparator;

public class ButtonsKeyboardPcComparator implements Comparator<Pc> {
    @Override
    public int compare(Pc o1, Pc o2) {
        return o1.getKeyboard().getButtons()-o2.getKeyboard().getButtons();
    }
}
