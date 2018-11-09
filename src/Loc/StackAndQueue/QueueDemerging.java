package Loc.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

public class QueueDemerging {
    String name;
    boolean sex;
    Date birthday;

    public QueueDemerging(String name, boolean sex, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Queue<QueueDemerging> NAM = new ArrayDeque<>();
        Queue<QueueDemerging> NU = new ArrayDeque<>();
        QueueDemerging staff1 = new QueueDemerging("Son",true,new Date());
    }

}
