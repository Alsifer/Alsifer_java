public class app9 {
    public static void main (String[] args){

        Box box = new Box(1,1,1);
        System.out.println(box.getVolume() + "м");
        System.out.println(box);

        Box box2 = new Box(2,3,4);
        System.out.println(box2.getVolume());
        System.out.println(box2);

        WeightedBox box3 = new WeightedBox(3,3,3,54);
        System.out.println(box3.getDensity());
        System.out.println(box3);

        System.out.println("Привет");

        System.out.println(box.equals(box2));
        System.out.println(box.equals(new Box(1,1,1)));
        System.out.println(box.equals("Привет"));


    }
}
