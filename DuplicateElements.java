package GroupProjectArrays;

public class DuplicateElements {
    public static void main(String[] args) {

        String[] group = {"bed", "sofa", "lamp", "bed", "table", "mirror", "table", "chair"};

        for (int i = 0; i < group.length; i++) {
            for (int j = i + 1; j < group.length; j++) {
                if (group[i].equals(group[j])) {

                    System.out.println("Duplicate items are " + group[j]);
                }
            }
        }
    }
}
