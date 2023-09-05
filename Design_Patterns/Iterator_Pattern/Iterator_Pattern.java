package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

// Step 1: Create an Iterator interface
interface Iterator<T> {
    boolean hasNext();

    T next();
}

// Step 2: Create a Container interface
interface Container<T> {
    Iterator<T> getIterator();
}

// Step 3: Create a concrete Iterator class (private inner class)
class NameIterator implements Iterator<String> {
    private List<String> names;
    private int currentIndex = 0;

    public NameIterator(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < names.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return names.get(currentIndex++);
        }
        throw new java.util.NoSuchElementException();
    }
}

// Step 4: Create a concrete Container class
class NameRepository implements Container<String> {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator(names);
    }
}

public class Iterator_Pattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        nameRepository.addName("Alice");
        nameRepository.addName("Bob");
        nameRepository.addName("Charlie");

        // Step 5: Use the Iterator to iterate through the names
        Iterator<String> iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
