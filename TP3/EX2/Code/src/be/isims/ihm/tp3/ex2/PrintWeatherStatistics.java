package be.isims.ihm.tp3.ex2;

import java.util.IntSummaryStatistics;

public class PrintWeatherStatistics implements Observer {

    @Override
    public void update(Object o) {
        IntSummaryStatistics stats = ((WeatherStation)o).getTemperatures().stream()
                .mapToInt((x) -> x)
                .summaryStatistics();
        System.out.println("PrintWeatherStatistics: " +
                "max temperature: " + stats.getMax() +
                ", min temperature: " + stats.getMin() +
                ", min temperature: " + stats.getAverage());
    }

}
