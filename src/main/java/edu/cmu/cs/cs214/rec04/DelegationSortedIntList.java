package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList extends SortedIntList{
    // the number of attempted element insertions
    private int totalAdded;

    private SortedIntList sortedIntList;

    /**
     * Gets the total number of attempted int insertions to the list since it.
     * was created.
     *
     * @return total number of integers added to the list.
     */
    public int getTotalAdded()
    {
        return totalAdded;
    }

    public DelegationSortedIntList() {
        this.sortedIntList = new SortedIntList();
        this.totalAdded = 0;
    }

    public boolean add(int num) {
        this.totalAdded++;
        return this.sortedIntList.add(num);
    }

    public boolean addAll(IntegerList list) {
        this.totalAdded += list.size();
        return this.sortedIntList.addAll(list);
    }

    public int get(int index) {
        return this.sortedIntList.get(index);
    }

    public boolean remove(int num) {
        return this.sortedIntList.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return this.sortedIntList.removeAll(list);
    }

    public int size() {
        return this.sortedIntList.size();
    }

}