public class fifth_hw {

    public static class Author {
        public String name;
        public String surname;
        public int rating;

        public Author(String name, String surname, int rating) {
            this.name = name;
            this.surname = surname;
            this.rating = rating;
        }
    }    

    public static class Book {
        public String title;
        public Author author;
        public int releaseYear;
        public int pages;

        public Book(String title, int releaseYear, Author author, int pages) {
            this.title = title;
            this.releaseYear = releaseYear;
            this.author = author;
            this.pages = pages;
        }
        public boolean isBig() {
            return pages > 500;
        }

        public int estimatePrice() {
            int price;
            price = (int) Math.floor((3*pages*(Math.sqrt(author.rating))));
            if (price <=250) {
                price = 250;
            }
            return price;
        }

        public boolean matches(String word) {
            return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
        }
    
    }

    public static void main(String[] args) {
        Author author1 = new Author("F. Scott", "Fitzgerald", 4);
        Book book1 = new Book("The Great Gatsby", 1925, author1, 218);

        Author author2 = new Author("Leo", "Tolstoy", 5);
        Book book2 = new Book("War and Peace", 1869, author2, 1225);

        System.out.println("Book 1: " + book1.title + " by " + book1.author.name + " " + book1.author.surname);
        System.out.println("Is Book 1 big? " + book1.isBig());
        System.out.println("Estimated price of Book 1: $" + book1.estimatePrice());

        System.out.println();

        System.out.println("Book 2: " + book2.title + " by " + book2.author.name + " " + book2.author.surname);
        System.out.println("Is Book 2 big? " + book2.isBig());
        System.out.println("Estimated price of Book 2: $" + book2.estimatePrice());

        String searchWord = "War";
        System.out.println();
        System.out.println("Searching for books containing the word '" + searchWord + "'...");
        if (book1.matches(searchWord)) {
            System.out.println("Book 1 matches the search.");
        }

        if (book2.matches(searchWord)) {
            System.out.println("Book 2 matches the search.");
        }
    }
}
