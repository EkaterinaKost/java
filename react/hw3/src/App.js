
import './App.css';
import React from 'react';
import TemperatureConverter from './components/TemperatureConverter';
import TodoList from './components/TodoList';



function App() {
  return (
    <div>
      <TemperatureConverter/>
      <h1>Todo List</h1>
     <TodoList />
    </div>
   
  );
}

export default App;
