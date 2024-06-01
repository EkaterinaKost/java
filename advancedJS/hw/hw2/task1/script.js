class Library {
    #books = [];
    constructor(initialBooks) {
        if (!Array.isArray(initialBooks)) {
            throw new Error('Начальный список книг должен быть предоставлен в виде массива.');
        }

        const uniqueBooks = new Set(initialBooks);
        if (uniqueBooks.size !== initialBooks.length) {
            throw new Error('Начальный список книг не может содержать дубликатов.');
        }

        this.#books = initialBooks;
    }

    get allBooks() {
        return this.#books;
    }

    addBook(title) {
        if (this.#books.includes(title)) {
            throw new Error('Эта книга уже существует в библиотеке.');
        }

        this.#books.push(title);
    }

    removeBook(title) {
        const index = this.#books.indexOf(title);
        if (index === -1) {
            throw new Error('Такой книги нет в библиотеке.');
        }

        this.#books.splice(index, 1);
    }

    hasBook(title) {
        return this.#books.includes(title);
    }
}

const myLibrary = new Library(['Граф Монте-Лристо', 'Преступление и наказание', 'Анна Каренина']);

console.log(myLibrary.allBooks);

myLibrary.addBook('Вишневый сад');
console.log(myLibrary.allBooks);


myLibrary.removeBook('Преступление и наказание');
console.log(myLibrary.allBooks);


console.log(myLibrary.hasBook('Граф Монте-Лристо'));
console.log(myLibrary.hasBook('Преступление и наказание'));

myLibrary.removeBook('Евгений Онегин');
console.log(myLibrary.allBooks);