/*
 Задать поля alarmHours, alarmMinutes время когда должен зазвонить будильник
 • Создать метод для установки будильника public String setAlarm(int hours,
  int minutes)
 • Создать класс Clock (Часы)
 Метод проверяет на допустимость часы и минуты и в случае валидности
 устанавливает поля будильника. • Создать метод для проверки надо ли звонить
 сейчас public String checkAlarm(int hours, int minutes) если входные
 параметры hours и minutes совпадают с временем установленным в поля alarmHours,
  alarmMinutes, то метод возвращает "Chime" (звонок) либо "" (пустую строку) если
   будильник не сработал. Часы должны звонить в 00 минут столько раз сколько часов,
   а также каждые 15 минут. Написать метод public int checkTimeCount(int hours, int minutes).
Метод возвращает число сколько раз надо часам пробить. Например:
17:15 вернуть 1 (звонить 1 раз),
17:00 вернуть 5 (звонить 5 раз),
17:01 вернуть 0 (не надо звонить)
• Создать экземпляр часов, сделать проверки методов setAlarm,
 checkAlarm и checkTime Count*/
public class Clock {
    private int alarmHours;
    private int alarmMinutes;

    public Clock(int alarmHours, int alarmMinutes) {
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
    }

    // звонок
    String checkAlarm(int hours, int minutes) {
        if ((alarmHours == hours) && (alarmMinutes == minutes)) {
            return "Звонок";
        }
        return "";
    }

    //кол-во срабатываний;
    public int checkTimeCount(int hours, int minutes) {
        int count = 0;

        if (minutes == 0) {
            return hours % 12;
        }

        if ((minutes % 15 == 0)) {
            return 1;
        }

        if ((minutes % 10 == 0)) {
            return 2;
        }

        return count;
    }

    public static void main(String[] args) {
        Clock cl = new Clock(11, 11);

        System.out.println(cl.checkAlarm(11, 11) + cl.checkTimeCount(8, 30));
    }
}
