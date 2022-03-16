public class Main {
    public static void main(String[] args) {
        System.out.println("master2 brunch");
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        listOfStrings.add("aaa");
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i).charAt(i));
        }

    }
}
