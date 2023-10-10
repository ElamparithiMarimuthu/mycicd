package com.gymsvg.util;

public class TimingUtil {
    public static boolean isBefore5PM(String timing) {
        // Extract the start time from the timing slot (e.g., "5-9am" -> "5")
        String startTime = timing.split("-")[0].toLowerCase();
        
        // Check if it's before 5 pm
        return !startTime.contains("pm") || Integer.parseInt(startTime.replace("am", "").replace("pm", "")) < 5;
    }
}

