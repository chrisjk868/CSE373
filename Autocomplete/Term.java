// Christopher Ku
// Section: AG
//
// This Term class represents an autocomplete term that has a query and a related weight.
// The Term object can be compared with each other in lexicographic order of the query,
// descending order of the weight, or lexicographic order by prefix of the query.
public class Term implements Comparable<Term>{
    private String query;
    private int weight;

    /**
     * Constructs a Term object with given query and weight.
     *
     * @param query    a non-null string of the term
     * @param weight   the related weight of the query
     */
    public Term(String query, int weight) {
        this.query = query;
        this.weight = weight;
    }

    /**
     * Compares this Term against the given other Term in lexicographical order of the query,
     * case-insensitively.
     * Returns a negative number if this Term is considered smaller than the other Term;
     * returns a positive number if this Term is considered greater than the other Term;
     * returns 0 otherwise.
     *
     * @param other     the other Term to get compared with this Term
     * @return cmp      the integer that indicates which Term is considered smaller/greater
     */
    public int compareTo(Term other) {
        int cmp = this.query.compareToIgnoreCase(other.query);
        return cmp;
    }

    /**
     * Compares this Term against the given other Term in descending order of the weight.
     * Returns a negative number if this Term is considered smaller than the other Term;
     * returns a positive number if this Term is considered greater than the other Term;
     * returns 0 otherwise.
     *
     * @param other     the other Term to get compared with this Term
     * @return cmp      the integer that indicates which Term is considered smaller/greater
     */
    public int compareToByReverseWeight(Term other) {
        int cmp = -1 * Integer.compare(this.weight, other.weight);
        return cmp;
    }

    /**
     * Returns the query of this Term.
     *
     * @return  the query of this Term
     */
    public String query() {
        return this.query;
    }

    /**
     * Returns the weight of this Term.
     *
     * @return  the weight of this Term
     */
    // Returns this term's weight.
    public int weight() {
        return this.weight;
    }

    /**
     * Returns the String representation of this Term, which is the query.
     *
     * @return the String representatiton of this Term
     */
    public String toString() {
        return this.query();
    }

    public static void main(String[] args) {
        Term t1 = new Term("hello world", 0);
        Term t2 = new Term("hi", 1);
        int cmp = t1.compareTo(t2);
        System.out.println(cmp);
    }
}

