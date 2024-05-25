let cooks = new Map();
cooks.set("Виктор", "Пицца")
    .set("Ольга", "Суши")
    .set("Дмитрий", "Десерты");

console.log(`Виктор - специализация: ${cooks.get("Виктор")}`);
console.log(`Ольга - специализация: ${cooks.get("Ольга")}`);
console.log(`Дмитрий - специализация: ${cooks.get("Дмитрий")}`);
console.log();

let controlSystem = new Map();
controlSystem.set("Пицца 'Маргарита'", "Виктор")
    .set("Пицца 'Пепперони'", "Виктор")
    .set("Суши 'Филадельфия'", "Ольга")
    .set("Суши 'Калифорния'", "Ольга")
    .set("Тирамису", "Дмитрий")
    .set("Чизкейк", "Дмитрий");

let orders = new Map();

//заказ первого клиента
let client1 = { name: 'Алексей' };
let clientOrder1 = new Set();
clientOrder1.add("Пицца 'Пепперони'")
    .add("Тирамису");

clientOrder1.forEach(el => {
    if (controlSystem.has(el)) {
        console.log(`Клиент ${client1.name} заказал(а):${el} приготовил(a) ${controlSystem.get(el)}`)
    }
});
console.log();

//заказ второго клиента
let client2 = { name: 'Мария' };
let clientOrder2 = new Set();
clientOrder2.add("Суши 'Калифорния'")
    .add("Пицца 'Маргарита'");

clientOrder2.forEach(el => {
    if (controlSystem.has(el)) {
        console.log(`Клиент ${client2.name} заказал(а):${el} приготовил(a) ${controlSystem.get(el)}`)
    }
});

//заказ третьего клиента
let client3 = { name: 'Ирина' };
let clientOrder3 = new Set();
clientOrder3.add("Чизкейк");

orders.set(client1, clientOrder1) // добавляем заказы клиентов в список
    .set(client2, clientOrder2)
    .set(client3, clientOrder3)
console.log();
clientOrder3.forEach(el => {
    if (controlSystem.has(el)) {
        console.log(`Клиент ${client3.name} заказал(а):${el} приготовил(a) ${controlSystem.get(el)}`)
    }
});