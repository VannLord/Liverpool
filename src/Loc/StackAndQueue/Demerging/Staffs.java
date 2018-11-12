package Loc.StackAndQueue.Demerging;

import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Staffs {
        String name;
        boolean sex;
        String birthday;
        public Staffs(String name, boolean sex, String birthday) {
            this.name = name;
            this.sex = sex;
            this.birthday = birthday;
        }

    @Override
    public String toString() {
        return "Staffs{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

