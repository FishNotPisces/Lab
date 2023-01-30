package Containers.TextContainer;



public class TextTester {
    public static void main(String[] args)
    {
        Text box = new Text();
        System.out.println(box.isEmpty());
        box.add("sole");
        box.add("mare");
        box.add("cane");
        box.add("ciao");
        box.add("sano");
        box.add("zio");
        box.add("alpa");
        box.add("pala");
        box.add("duna");
        box.add("filo");
        box.add("attimo");
        box.add("edema");

        System.out.println(box.isEmpty());
        System.out.println(box.toString());
        box.sort();

        System.out.println(box.toString());

    }
}
