package io.laptrinh.Liverpool.ChiDauKhuat.bai5;

public class Number {
    float value=0;

    public float getValue() {
        return value;
    }
    public void setValue(float value){
        this.value = value;
    }
    public Number(){}
    public static float get(int i,Number[] numbers){
        return numbers[i].value;
    }
    public static float highestValue(Number[] numbers){
        float max = numbers[0].value;
        for (int i = 1; i <numbers.length ; i++) {
            if(max < numbers[i].value) max = numbers[i].value;
        }
        return max;
    }
    public static float lowestValue(Number[] numbers){
        float min = numbers[0].value;
        for (int i = 1; i < numbers.length ; i++) {
            if(min > numbers[i].value) min = numbers[i].value;
        }
        return min;
    }
    public static float average(Number[] numbers){
        float total=0;
        for (int i = 0; i < numbers.length ; i++) {
            total += numbers[i].value;
        }
        float average =  total/numbers.length;
        return average;
    }

    public static void main(String[] args) {
        Number[] numbers = new Number[6];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = new Number();
        }
        numbers[0].setValue(19);
        numbers[1].setValue(5);
        numbers[2].setValue(7);
        numbers[3].setValue(4);
        numbers[4].setValue(4);
        numbers[5].setValue(7);
        System.out.println("Number 2: "+(get(2,numbers)));
        System.out.println("Highest Value: "+highestValue(numbers));
        System.out.println("Lowews Value: "+lowestValue(numbers));
        System.out.println("Average: "+average(numbers));

    }

}
