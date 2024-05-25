const musicCollection = {

    musicAlbums: [
        { title: 'Истинный убийца', artist: 'КиШ',  year: '1993'},
        { title: 'Второй фронт', artist: 'Агата Кристи',  year: '1988'},
        { title: 'Переезд', artist: 'Наутилус Помпилиус',  year: '1983'}
    ],
    [Symbol.iterator]() {
        this.index = 0;
        return this;
    },
    next() {
        return this.index < this.musicAlbums.length
            ? {done: false, value: this.musicAlbums[this.index++]}
            : {done: true};
    }
}
for (const album of musicCollection) {
    console.log(`${album.title} - ${album.artist} (${album.year})`);
}