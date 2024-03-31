
//1) Дан массив const arr = [1, 5, 7, 9] с помощью Math.min 
//и spread оператора, найти минимальное число в массиве, решение 
//задание должно состоять из одной строки

const arr = [5, 7, 9, 1];
console.log(Math.min(...arr));

//2) Напишите функцию createCounter, которая создает счетчик и 
//возвращает объект с двумя методами: increment и decrement.
// Метод increment должен увеличивать значение счетчика на 1, 
//а метод decrement должен уменьшать значение счетчика на 1.
// Значение счетчика должно быть доступно только через методы объекта, а не напрямую.

function createCounter(count) {
    return {
        value:count,
        increment(){
            this.value += 1;
            return this.value;
        },
        decrement(){
            this.value -=1;
            return this.value;
        }
    }
}
const objEl = createCounter(10);
console.log(objEl.increment());
console.log(objEl.decrement());

//3) Напишите рекурсивную функцию findElementByClass, которая принимает корневой 
//элемент дерева DOM и название класса в качестве аргументов и возвращает
// первый найденный элемент с указанным классом в этом дереве.
//Пример
//const rootElement = document.getElementById('root');
//const targetElement = findElementByClass(rootElement, 'my-class');
//console.log(targetElement);

let serchElement = [];
function findElementByClass(rootEl, classEl) {
   if (rootEl.hasChildNodes()) {
      for (let element of rootEl.children) {
         if (element.className === classEl) {
            serchElement.push(element);
            if (serchElement[0].className !== classEl) {
               serchElement = [];
               serchElement.push(element);
            }
         }
         findElementByClass(element, classEl);
      }
   }
   return serchElement[0];
}

const rootElement = document.getElementById('root');
const targetElement = findElementByClass(rootElement, 'child6');
console.log(targetElement);

console.log("***");

const rootElement_1 = document.getElementById('root1');
const targetElement_1 = findElementByClass(rootElement_1, 'class5');
console.log(targetElement_1);
