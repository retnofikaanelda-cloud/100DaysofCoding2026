package Day021;
public class Day021 {
    public static void main(String[] args) {

        String dataByte = "10";
        String dataShort = "1000";
        String dataInt = "25000";
        String dataLong = "1000000";
        String dataFloat = "3.14";
        String dataDouble = "99.99";
        String dataChar = "A";
        String dataBoolean = "true";

        byte angkaByte = Byte.parseByte(dataByte);
        short angkaShort = Short.parseShort(dataShort);
        int angkaInt = Integer.parseInt(dataInt);
        long angkaLong = Long.parseLong(dataLong);
        float angkaFloat = Float.parseFloat(dataFloat);
        double angkaDouble = Double.parseDouble(dataDouble);
        char angkaChar = dataChar.charAt(0);
        boolean angkaBoolean = Boolean.parseBoolean(dataBoolean);

        System.out.println("byte = " + angkaByte);
        System.out.println("short = " + angkaShort);
        System.out.println("int = " + angkaInt);
        System.out.println("long = " + angkaLong);
        System.out.println("float = " + angkaFloat);
        System.out.println("double = " + angkaDouble);
        System.out.println("char = " + angkaChar);
        System.out.println("boolean = " + angkaBoolean);
    }
}
