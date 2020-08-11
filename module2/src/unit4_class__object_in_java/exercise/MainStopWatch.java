package unit4_class__object_in_java.exercise;

import java.util.Arrays;

public class MainStopWatch {
        public static void main(String[] args) {
            int[] array = new int[99999];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 1000000 + 1);
            }
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Arrays.sort(array);
            stopWatch.stop();
            System.out.println(stopWatch.getElapsedTime());
        }
    }

