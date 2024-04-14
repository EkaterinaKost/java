const http = require('http');

const port = 3000;

const homeHref = `<a href="http://localhost:${port}/">About</a>`;
const aboutHref = `<a href="http://localhost:${port}/about">Home</a>`;

let homeCount = 0;
let aboutCount = 0;

const server = http.createServer((req, res) => {
    if (req.url === '/') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(aboutHref);
        console.log(`страницу home просматривали ${++homeCount} раз`);
    } else if (req.url === '/about') {
        res.writeHead(200, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end(homeHref);
        console.log(`страницу about просматривали ${++aboutCount} раз`);
    } else {
        res.writeHead(404, { 'Content-Type': 'text/html; charset=utf-8' });
        res.end('<h1>страница не найдена</h1>');
    }
});
server.listen(port, () => console.log(`сервер запущен на порту: ${port}`));