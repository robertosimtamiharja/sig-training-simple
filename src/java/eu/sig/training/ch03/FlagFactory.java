package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    public Map<Nationality, List<Color>> getFlagColors(Nationality nationality) {
        List<Color> result;

        Map<Nationality, List<Color>> map = new HashMap();

        map.put(Nationality.DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        map.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        map.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        map.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        map.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        map.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));

        map.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        map.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        map.put(Nationality.BULGARIAN,  Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        map.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
        map.put(Nationality.UNCLASSIFIED, Arrays.asList(Color.GRAY));

        return map;
    }

}