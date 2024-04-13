const url = 'https://jsonplaceholder.typicode.com/users';
let containerEl;
let usersList = [];

const getUsers = async () => {
    usersList = [];
    try {
        const response = await fetch(url);
        const users = await response.json();
        users.forEach(user => usersList.push(user));
        printUsers(users);
    } catch (error) {
        console.error(error.message);
    }
}

const loadFromLocalStorage = () => {
    usersList = [];
    const users = JSON.parse(localStorage.getItem('users'));
    users.forEach(user => usersList.push(user));
    printUsers(users);
}

const saveToLocalStorage = () => {
    localStorage.clear();
    localStorage.setItem('users', JSON.stringify(usersList));
}

const printUsers = (users) => {
    if (document.querySelector('.users_list') != null) {
        containerEl.removeChild(document.querySelector('.users_list'));
    }
    const ulEl = document.createElement('ul');
    ulEl.classList.add('users_list');
    users.forEach(user => ulEl.appendChild(createUser(user)));
    containerEl.appendChild(ulEl);
}

const createUser = (user) => {
    const liEl = document.createElement('li');
    liEl.classList.add('user');
    liEl.id = user.username;

    liEl.appendChild(createParagraph(user.username));
    liEl.appendChild(createParagraph(user.name));
    liEl.appendChild(createParagraph(user.email));

    const delButton = document.createElement('button');
    delButton.textContent = 'Удалить';
    delButton.addEventListener('click', function (e) {
        const index = usersList.indexOf(user);
        usersList = usersList.slice(0, index).concat(usersList.slice(index + 1, usersList.length));
        document.querySelector('.users_list').removeChild(liEl);
    });
    liEl.appendChild(delButton);

    return liEl;
}

const createParagraph = (text) => {
    const pEl = document.createElement('p');
    pEl.textContent = text;
    return pEl;
}

const init = () => {
    const titleEl = document.createElement('h1');
    titleEl.innerHTML = 'Управление списком пользователей';
    containerEl.appendChild(titleEl);

    const buttonsBlock = document.createElement('div');
    buttonsBlock.appendChild(createButton('Загрузить из базы данных', getUsers)); 
    buttonsBlock.appendChild(createButton('Загрузить из локального хранидища', loadFromLocalStorage));
    buttonsBlock.appendChild(createButton('Сохранить в локальном хранилище', saveToLocalStorage));
    containerEl.appendChild(buttonsBlock);
}

const createButton = (text, func) => {
    const buttonEl = document.createElement('button');
    buttonEl.innerText = text;
    buttonEl.onclick = func;
    return buttonEl;
}

document.addEventListener('DOMContentLoaded', function (e) {
    containerEl = document.querySelector('div.container');
    init();
});