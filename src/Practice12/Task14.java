package Practice12;
import java.util.*;
public class Task14 {
    static class MutableTag {

        private String label;

        public MutableTag(String label) {
            this.label = label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof MutableTag other)) {
                return false;
            }

            return Objects.equals(label, other.label);
        }

        @Override
        public int hashCode() {
            return Objects.hash(label);
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public static void main(String[] args) {

        Set<MutableTag> set = new HashSet<>();

        MutableTag tag = new MutableTag("java");

        set.add(tag);

        System.out.println("До изменения: "
                + set.contains(tag));

        tag.setLabel("kotlin");

        System.out.println("После изменения: "
                + set.contains(tag));

        System.out.println("Удаление: " + set.remove(tag));

        System.out.println("Размер множества: " + set.size());

        MutableTag safeTag = new MutableTag("python");

        set.add(safeTag);

        set.remove(safeTag);

        safeTag.setLabel("javascript");

        set.add(safeTag);

        System.out.println("Безопасное обновление: " + set);
    }
}
