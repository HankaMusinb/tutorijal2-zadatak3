package ba.unsa.etf.rpr.tut2;
import java.util.List;

public class MatematikaUtils {

    /**
     * Nalazenje najmanjeg broja u listi
     * @param numbers
     * @return
     */
    public static Double min(List<Double> numbers){
        double min = Double.MAX_VALUE;
        for(Double num : numbers){
            //pretvaranje iz velikog u mali Double
            if (num.doubleValue() < min){
                min = num.doubleValue();
            }
        }
        return min;
    }

    /**
     * gnalazenje najveceg broja
     * @param numbers
     * @return
     */
    public static Double max(List<Double> numbers){
        double max = Double.MIN_VALUE;
        for(Double num : numbers){
            if (num.doubleValue() > max){
                max = num.floatValue();
            }
        }
        return max;
    }

    /**
     * srednja vrijednost elemenata liste
     * @param numbers
     * @return
     */
    public static Double mean(List<Double> numbers){
        double sum = 0;
        for(Double num : numbers){
            sum += num.doubleValue();
        }
        return sum/numbers.size();
    }

    /**
     * standardna devijacija: sqrt((∑(Xi - ų)^2) / N)
     * @param numbers
     * @return
     */
    //sumiraj sve kvadrate -> podijeli s n -> vrati korijen
    public static Double stdev(List<Double> numbers){
        Double mean = MatematikaUtils.mean(numbers);
        float standardDeviation = 0;
        for(Double num: numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/numbers.size());
    }
}
