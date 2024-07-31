package com.olivejua.array;

import java.util.*;

/**
 * https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/
 */
public class Leetcode_1604 {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> result = new ArrayList<>();

        Map<String, List<AccessTime>> history = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            history.putIfAbsent(keyName[i], new ArrayList<>());

            String[] split = keyTime[i].split(":");
            history.get(keyName[i]).add(new AccessTime(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
        }

        for (Map.Entry<String, List<AccessTime>> entry : history.entrySet()) {
            List<AccessTime> times = entry.getValue();
            times.sort(AccessTime::compare);

            for (int i = 0; i < times.size() - 2; i++) {
                if (hasToAlert(times.get(i), times.get(i + 2))) {
                    result.add(entry.getKey());
                    break;
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    private boolean hasToAlert(AccessTime time1, AccessTime time2) {
        return AccessTime.isWithinOneHour(time1, time2);
    }

    static class AccessTime {
        int hour;
        int minute;

        public AccessTime(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        public static int compare(Object o1, Object o2) {
            AccessTime time1 = (AccessTime) o1;
            AccessTime time2 = (AccessTime) o2;

            if (time1.hour < time2.hour) {
                return -1;
            } else if (time1.hour > time2.hour) {
                return 1;
            }

            //시간이 같은 경우 실행됨
            if (time1.minute < time2.minute) {
                return -1;
            } else if (time1.minute > time2.minute) {
                return 1;
            }

            //모두 같은 경우
            return 0;
        }

        public static boolean isWithinOneHour(AccessTime time1, AccessTime time2) {
            if (time1.hour == time2.hour) {
                return true;
            }

            if ((time1.hour+1) == time2.hour) {
                return time1.minute >= time2.minute;
            }

            return false;
        }
    }


    public List<String> alertNames2(String[] keyName, String[] keyTime) {
        Map<String, List<Integer>> history = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            int minutes = convertMinutes(keyTime[i]);

            history.computeIfAbsent(name, k -> new ArrayList<>()).add(minutes);
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : history.entrySet()) {
            String name = entry.getKey();
            List<Integer> times = entry.getValue();
            Collections.sort(times);

            for (int i = 0; i < times.size() - 2; i++) {
                if (times.get(i + 2) - times.get(i) <= 60) {
                    result.add(name);
                    break;
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    private int convertMinutes(String time) {
        String[] split = time.split(":");
        int hours = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);

        return (hours*60) + minutes;
    }

}
