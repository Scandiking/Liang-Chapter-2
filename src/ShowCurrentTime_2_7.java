public class ShowCurrentTime_2_7 {
    public static void main(String[] args) {

        // Skaff antall totale millisekunder siden midnatt av 1 jan 1970
        long totalMilliSeconds = System.currentTimeMillis();

        // Skaff totalt antall sekunder siden midnatt av 1. jan 1970
        long totalSeconds = totalMilliSeconds / 1000;

        // Beregn nåværende sekund av minuttet av timen
        long currentSecond = totalSeconds % 60;

        // Skaff totale minutter
        long totalMinutes = totalSeconds / 60;

        // Beregn nåværende minutt i timen
        long currentMinute = totalMinutes % 60;

        // Skaff totale timer
        long totalHours = totalMinutes / 60;

        // Beregn nåværende time
        long currentHour = totalHours % 24;

        // Print nåværende time : nåværende minutt : nåværende sekund (i Greenwich Mean Time-tidssonen)
        System.out.println("Nåværende tid er " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
