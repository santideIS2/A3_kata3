package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("yahoo.com");
        histogram.increment("ulpgc.es");
        histogram.increment("mimail.net");
        histogram.increment("gmail.es");
        histogram.increment("yahoo.com");
        histogram.increment("mimail.net");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        new HistogramDisplay(histogram).execute();
    }
    
}
