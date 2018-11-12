package Loc.StackAndQueue.Demerging;

import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemerging {
    public static void main(String[] args) throws ParseException {
        Staffs[] staffs = new Staffs[6];
        Queue<Staffs> NAM = new ArrayDeque<>();
        Queue<Staffs> NU = new ArrayDeque<>();
        staffs[0] = new Staffs("Son",true,"26/1/1999");
        staffs[1] = new Staffs("Dung",true,"29/01/1999");
        staffs[2] = new Staffs("Loc",false,"07/04/1999");
        staffs[3] = new Staffs("Chi",true,"19/05/1999");
        staffs[4]= new Staffs("Dũng",false,"07/06/1999");
        staffs[5] = new Staffs("Huy",false,"30/06/1999");
        for (Staffs staff : staffs
             ) {
            if(staff.sex) NU.add(staff);
            else NAM.add(staff);
        }
        while(!NU.isEmpty()) System.out.println(((ArrayDeque<Staffs>) NU).pop());
        while (!NAM.isEmpty()) System.out.println(((ArrayDeque<Staffs>) NAM).pop());
    }
}
